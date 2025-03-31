package com.example.prototype.domain.port;

import com.example.prototype.domain.model.Instrument;
import reactor.core.publisher.Mono;

public interface MarketDepthSubscriptionPort {
    Mono<Instrument> subscribeInstrument(Instrument instrument);
}
