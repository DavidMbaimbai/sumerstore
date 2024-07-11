package com.sumer.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class Header {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonProperty("productId")
    private int productId;

    @JsonProperty("subCampaignId")
    private int subCampaignId;

    @JsonProperty("commissionVersion")
    private int commissionVersion;

    @JsonProperty("oldPolicyNumber")
    private String oldPolicyNumber;

    @JsonProperty("actualPolicyNumber")
    private String actualPolicyNumber;

    @JsonProperty("comment")
    private String comment;

    @JsonProperty("countryAlpha2Code")
    private String countryAlpha2Code;

    @JsonProperty("coverStartDate")
    private String coverStartDate;

    @JsonProperty("sasriaCategory")
    private String sasriaCategory;

    @JsonProperty("commissionRebate")
    private int commissionRebate;

    @JsonProperty("matching")
    private String matching;

    @JsonProperty("riskTypeId")
    private int riskTypeId;

    @JsonProperty("addressId")
    private int addressId;

    @JsonProperty("coInsurers")
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "header_id", referencedColumnName = "id")
    private ArrayList<CoInsurer> coInsurers;

    @JsonProperty("firstName")
    private String firstName;

    @JsonProperty("lastName")
    private String lastName;

    @JsonProperty("initials")
    private String initials;

    @JsonProperty("customerType")
    private String customerType;

    @JsonProperty("companyName")
    private String companyName;

    @JsonProperty("contactName")
    private String contactName;

    @JsonProperty("customerId")
    private int customerId;

    @JsonProperty("commissionRelId")
    private int commissionRelId;

    @JsonProperty("language")
    private String language;

    @JsonProperty("postalAddressId")
    private int postalAddressId;

    @JsonProperty("physicalAddressId")
    private int physicalAddressId;

    @JsonProperty("workAddressId")
    private int workAddressId;

    @JsonProperty("itcCheckAuthorised")
    private boolean itcCheckAuthorised;

    @JsonProperty("vatRegistered")
    private boolean vatRegistered;

    @JsonProperty("vatRegNo")
    private String vatRegNo;
}
