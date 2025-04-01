package com.example.prototype.infraestructure.input.adapter;

import com.example.prototype.application.InstrumentService;
import com.example.prototype.infraestructure.input.event.mapper.InstrumentMapper;
import com.example.prototype.infraestructure.input.event.model.InstrumentEvent;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import reactor.core.Disposable;

@Component
@AllArgsConstructor
public class InstrumentEventAdapter {

    private final InstrumentService instrumentService;
    private final InstrumentMapper instrumentMapper;

    public Disposable processNewInstrument(InstrumentEvent instrumentEvent) {
        return instrumentService.processNewInstrument(instrumentMapper.toInstrument(instrumentEvent)).subscribe();
    }
}
