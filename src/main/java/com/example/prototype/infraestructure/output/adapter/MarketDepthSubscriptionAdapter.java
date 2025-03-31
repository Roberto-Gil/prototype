package com.example.prototype.infraestructure.output.adapter;

import com.example.prototype.domain.model.Instrument;
import com.example.prototype.domain.port.MarketDepthSubscriptionPort;
import com.example.prototype.infraestructure.output.event.MarketDepthSubscriptionBroker;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

@Component
@AllArgsConstructor
public class MarketDepthSubscriptionAdapter implements MarketDepthSubscriptionPort {

    private final MarketDepthSubscriptionBroker marketDepthSubscriptionBroker;

    @Override
    public Mono<Instrument> subscribeInstrument(Instrument instrument) {
        return marketDepthSubscriptionBroker.subscribeInstrument(instrument).thenReturn(instrument);
    }
}
