package com.example.prototype.application;

import com.example.prototype.domain.model.Instrument;
import com.example.prototype.domain.port.InstrumentPort;
import com.example.prototype.domain.port.MarketDepthSubscriptionPort;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
@AllArgsConstructor
public class InstrumentService {

    private final InstrumentPort instrumentPort;
    private final MarketDepthSubscriptionPort marketDepthSubscriptionPort;

    public Mono<Instrument> processNewInstrument(Instrument instrument) {
        return instrumentPort.addInstrument(instrument)
                .flatMap(marketDepthSubscriptionPort::subscribeInstrument);
    }
 }
