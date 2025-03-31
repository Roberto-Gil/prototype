package com.example.prototype.domain.port;

import com.example.prototype.domain.model.Trade;
import reactor.core.publisher.Mono;

public interface LockTradePort {

    Mono<Trade> lockTrade(Trade trade);

}
