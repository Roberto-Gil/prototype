package com.example.prototype.domain.port;

import com.example.prototype.domain.model.VolumeWeightedAveragePrice;
import reactor.core.publisher.Mono;

public interface VWAPPublisherPort {
    Mono<VolumeWeightedAveragePrice> publish(VolumeWeightedAveragePrice volumeWeightedAveragePrice);
}
