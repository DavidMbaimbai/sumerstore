package com.sumer.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class Finance{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonProperty("accountHolder")
    private String accountHolder;

    @JsonProperty("accountNumber")
    private String accountNumber;

    @JsonProperty("bank")
    private String bank;

    @JsonProperty("branchCode")
    private String branchCode;

    @JsonProperty("sortCode")
    private Object sortCode;

    @JsonProperty("accountType")
    private String accountType;
}