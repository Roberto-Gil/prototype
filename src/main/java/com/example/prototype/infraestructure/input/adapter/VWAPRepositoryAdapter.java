package com.example.prototype.infraestructure.input.adapter;

import com.example.prototype.domain.model.VolumeWeightedAveragePrice;
import com.example.prototype.domain.port.VWAPRepositoryPort;
import com.example.prototype.infraestructure.input.repository.VWAPRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

@Component
@AllArgsConstructor
public class VWAPRepositoryAdapter implements VWAPRepositoryPort {

    private final VWAPRepository vwapRepository;

    @Override
    public Mono<VolumeWeightedAveragePrice> getVolumeWeightedAveragePrice(String instrumentId) {
        return vwapRepository.getVolumeWeightedAveragePrice(instrumentId);
    }

    @Override
    public Mono<VolumeWeightedAveragePrice> save(VolumeWeightedAveragePrice volumeWeightedAveragePrice) {
        return vwapRepository.save(volumeWeightedAveragePrice);
    }


}
