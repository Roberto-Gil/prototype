package com.example.prototype.infraestructure.output.event.Model;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class VWAPEvent {
    private String instrumentId;
    private Double bid;
    private Double ask;
}
