package com.example.prototype.application;

import com.example.prototype.domain.model.Trade;
import com.example.prototype.domain.model.VolumeWeightedAveragePrice;
import com.example.prototype.domain.port.LockTradePort;
import com.example.prototype.domain.port.VWAPPublisherPort;
import com.example.prototype.domain.port.VWAPRepositoryPort;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
@AllArgsConstructor
public class TradeService {

    private final LockTradePort lockTradePort;
    private final VWAPRepositoryPort vWAPRepositoryPort;
    private final VWAPPublisherPort vwapPublisherPort;

    public Mono<Trade> addTrade(Trade trade) {
        return lockTradePort.lockTrade(trade)
        .flatMap(this::addTradeToVolumeWeightedAveragePrice)
        .flatMap(vwapPublisherPort::publish)
        .flatMap((vwap)-> Mono.defer(() -> vWAPRepositoryPort.save(vwap)))
        .thenReturn(trade);
    }

    private Mono<VolumeWeightedAveragePrice> addTradeToVolumeWeightedAveragePrice(Trade trade){
        return vWAPRepositoryPort.getVolumeWeightedAveragePrice(trade.getId())
                .map(vwap -> VolumeWeightedAveragePrice.builder()
                        .askAndVolumeSum(vwap.getAskAndVolumeSum() + (trade.getAsk() * trade.getVolume()))
                        .bidAndVolumeSum(vwap.getBidAndVolumeSum() + (trade.getBid() * trade.getVolume()))
                        .totalVolume(vwap.getTotalVolume() + trade.getVolume()).build());
    }
}
