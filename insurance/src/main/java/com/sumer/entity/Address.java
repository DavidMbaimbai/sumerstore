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
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @JsonProperty("addressGroup")
    private String addressGroup;

    @JsonProperty("addressType")
    private String addressType;

    @JsonProperty("addressLine1")
    private String addressLine1;

    @JsonProperty("addressLine2")
    private String addressLine2;

    @JsonProperty("addressLine3")
    private String addressLine3;

    @JsonProperty("suburb")
    private String suburb;

    @JsonProperty("town")
    private String town;

    @JsonProperty("postalCode")
    private String postalCode;

    @JsonProperty("phoneNumber")
    private String phoneNumber;

    @JsonProperty("faxNumber")
    private String faxNumber;

    @JsonProperty("cellNumber")
    private String cellNumber;

    @JsonProperty("emailAddress")
    private String emailAddress;

    @JsonProperty("longitude")
    private int longitude;

    @JsonProperty("latitude")
    private int latitude;

}
