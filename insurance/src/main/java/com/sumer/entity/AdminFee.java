package com.sumer.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class AdminFee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @JsonProperty("min")
    private int min;

    @JsonProperty("max")
    private int max;

    @JsonProperty("value")
    private int value;

    @JsonProperty("calculationMethod")
    private String calculationMethod;

    @JsonProperty("coverPeriod")
    private String coverPeriod;
}
