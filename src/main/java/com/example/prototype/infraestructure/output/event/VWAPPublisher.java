package com.example.prototype.infraestructure.output.event;

import com.example.prototype.infraestructure.output.event.Model.VWAPEvent;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

@Component
public class VWAPPublisher {

    public Mono<Void> publish(VWAPEvent vwapEvent) {
        return Mono.empty();
    }
}
