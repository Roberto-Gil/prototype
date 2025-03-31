package com.example.prototype.infraestructure.output.repository;

import com.example.prototype.domain.model.Trade;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

@Component
public class LockRepository {
    public Mono<Void> lockTrade(Trade trade) {
        return Mono.empty();
    }

}
