package com.example.prototype.infraestructure.output.adapter;

import com.example.prototype.domain.model.VolumeWeightedAveragePrice;
import com.example.prototype.domain.port.VWAPPublisherPort;
import com.example.prototype.infraestructure.output.event.VWAPPublisher;
import com.example.prototype.infraestructure.output.event.mapper.VWAPEventMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

@Component
@AllArgsConstructor
public class VWAPPublisherAdapter implements VWAPPublisherPort {

    private final VWAPPublisher vwapPublisher;
    private final VWAPEventMapper vwapEventMapper;

    @Override
    public Mono<VolumeWeightedAveragePrice> publish(VolumeWeightedAveragePrice volumeWeightedAveragePrice) {
        return vwapPublisher.publish(vwapEventMapper.toVwapEvent(volumeWeightedAveragePrice)).thenReturn(volumeWeightedAveragePrice);
    }
}
