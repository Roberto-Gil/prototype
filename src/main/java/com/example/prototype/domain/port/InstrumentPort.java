package com.example.prototype.domain.port;

import com.example.prototype.domain.model.Instrument;
import reactor.core.publisher.Mono;

public interface InstrumentPort {

    Mono<Instrument> addInstrument(Instrument instrument);

}
