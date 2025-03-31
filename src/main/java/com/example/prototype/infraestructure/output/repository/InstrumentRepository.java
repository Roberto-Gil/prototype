package com.example.prototype.infraestructure.output.repository;

import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
public class InstrumentRepository {

    public Mono<Boolean> saveValue(String key, String value) {
        return Mono.empty();
    }

    public Mono<String> getValue(String key) {
        return Mono.empty();
    }
}
