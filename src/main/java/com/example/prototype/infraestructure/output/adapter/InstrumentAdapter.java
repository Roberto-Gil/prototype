package com.example.prototype.infraestructure.output.adapter;

import com.example.prototype.domain.model.Instrument;
import com.example.prototype.domain.port.InstrumentPort;
import com.example.prototype.infraestructure.output.repository.InstrumentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

@Component
@AllArgsConstructor
public class InstrumentAdapter implements InstrumentPort {

    private final InstrumentRepository instrumentRepository;

    @Override
    public Mono<Instrument> addInstrument(Instrument instrument) {
        return instrumentRepository.getValue(instrument.getId())
                .switchIfEmpty(Mono.just(instrumentRepository.saveValue(instrument.getId(), instrument.getName())).thenReturn(instrument.getId()))
                .thenReturn(instrument);
    }
}

