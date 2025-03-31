package com.example.prototype.infraestructure.input.event.mapper;

import com.example.prototype.domain.model.Instrument;
import com.example.prototype.infraestructure.input.event.model.InstrumentEvent;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface InstrumentMapper {
    Instrument toInstrument(InstrumentEvent instrumentEvent);
}
