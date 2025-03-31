package com.example.prototype.infraestructure.input.event.mapper;

import com.example.prototype.domain.model.Trade;
import com.example.prototype.infraestructure.input.event.model.TradeEvent;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TradeMapper {
    Trade toTrade(TradeEvent tradeEvent);
}
