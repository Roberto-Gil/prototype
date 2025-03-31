package com.example.prototype.infraestructure.input.repository;

import com.example.prototype.domain.model.VolumeWeightedAveragePrice;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
public class VWAPRepository {
   public Mono<VolumeWeightedAveragePrice> getVolumeWeightedAveragePrice(String instrumentId) {
       return Mono.just(VolumeWeightedAveragePrice.builder().build());
   }

   public Mono<VolumeWeightedAveragePrice> save(VolumeWeightedAveragePrice volumeWeightedAveragePrice) {
       return Mono.just(volumeWeightedAveragePrice);
   }
}
