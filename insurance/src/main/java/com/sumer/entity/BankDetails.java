package com.sumer.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class BankDetails {
    @JsonProperty("accountHolder")
    private String accountHolder;

    @JsonProperty("accountNumber")
    private String accountNumber;

    @JsonProperty("bank")
    private String bank;

    @JsonProperty("branchCode")
    private String branchCode;

    @JsonProperty("sortCode")
    private String sortCode;

    @JsonProperty("accountType")
    private String accountType;
}