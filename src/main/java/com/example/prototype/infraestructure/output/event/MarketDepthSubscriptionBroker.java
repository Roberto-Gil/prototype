package com.example.prototype.infraestructure.output.event;

import com.example.prototype.domain.model.Instrument;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

@Component
public class MarketDepthSubscriptionBroker {
    public Mono<Void> subscribeInstrument(Instrument instrument) {
        return Mono.empty();
    }
}
