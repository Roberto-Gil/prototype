package com.example.prototype.infraestructure.output.event.mapper;

import com.example.prototype.domain.model.VolumeWeightedAveragePrice;
import com.example.prototype.infraestructure.output.event.Model.VWAPEvent;
import org.springframework.stereotype.Component;

@Component
public class VWAPEventMapper {
    public VWAPEvent toVwapEvent(VolumeWeightedAveragePrice volumeWeightedAveragePrice) {
        return VWAPEvent.builder()
                .instrumentId(volumeWeightedAveragePrice.getInstrumentId())
                .ask(volumeWeightedAveragePrice.getAskAndVolumeSum() / volumeWeightedAveragePrice.getTotalVolume())
                .bid(volumeWeightedAveragePrice.getBidAndVolumeSum() / volumeWeightedAveragePrice.getTotalVolume())
                .build();
    }

}
