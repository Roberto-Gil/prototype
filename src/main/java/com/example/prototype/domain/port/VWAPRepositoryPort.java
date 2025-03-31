package com.example.prototype.domain.port;

import com.example.prototype.domain.model.VolumeWeightedAveragePrice;
import reactor.core.publisher.Mono;

public interface VWAPRepositoryPort {
    Mono<VolumeWeightedAveragePrice> getVolumeWeightedAveragePrice(String instrumentId);

    Mono<VolumeWeightedAveragePrice> save(VolumeWeightedAveragePrice volumeWeightedAveragePrice);
}
