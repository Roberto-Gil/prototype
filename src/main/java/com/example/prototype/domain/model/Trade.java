package com.example.prototype.domain.model;

import lombok.Data;

@Data
public class Trade {
    private String id;
    private Double bid;
    private Double ask;
    private Integer volume;
}
