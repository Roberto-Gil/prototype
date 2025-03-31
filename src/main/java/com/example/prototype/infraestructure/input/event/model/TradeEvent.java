package com.example.prototype.infraestructure.input.event.model;

import lombok.Data;

@Data
public class TradeEvent {
    private String id;
    private Double bid;
    private Double ask;
    private Integer volume;
}
