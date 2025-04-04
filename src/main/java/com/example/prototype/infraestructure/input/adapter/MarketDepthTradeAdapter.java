package com.example.prototype.infraestructure.input.adapter;

import com.example.prototype.application.TradeService;
import com.example.prototype.infraestructure.input.event.mapper.TradeMapper;
import com.example.prototype.infraestructure.input.event.model.TradeEvent;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import reactor.core.Disposable;

@Component
@AllArgsConstructor
public class MarketDepthTradeAdapter {

    private final TradeService tradeService;
    private final TradeMapper tradeMapper;

    Disposable processNewTrade(TradeEvent tradeEvent) {
      return tradeService.addTrade(tradeMapper.toTrade(tradeEvent)).subscribe();
    }
}
