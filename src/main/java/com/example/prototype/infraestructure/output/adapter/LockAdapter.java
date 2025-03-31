package com.example.prototype.infraestructure.output.adapter;

import com.example.prototype.domain.model.Trade;
import com.example.prototype.domain.port.LockTradePort;
import com.example.prototype.infraestructure.output.repository.LockRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

@AllArgsConstructor
@Component
public class LockAdapter implements LockTradePort {

    private final LockRepository lockRepository;

    @Override
    public Mono<Trade> lockTrade(Trade trade) {
        return lockRepository.lockTrade(trade).thenReturn(trade);
    }
}
