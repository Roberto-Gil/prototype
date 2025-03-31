package com.example.prototype.domain.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class VolumeWeightedAveragePrice {
    private String instrumentId;
    private Double bidAndVolumeSum;
    private Double askAndVolumeSum;
    private Integer totalVolume;
}
