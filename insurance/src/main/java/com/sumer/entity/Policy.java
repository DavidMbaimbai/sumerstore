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
public class Policy{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "header_id", referencedColumnName = "id")
    @JsonProperty("header")
    private Header header;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "finance_id", referencedColumnName = "id")
    @JsonProperty("finance")
    private Finance finance;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "policy_id")
    @JsonProperty("risks")
    private ArrayList<Risk> risks;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "policy_id")
    @JsonProperty("detailFields")
    private ArrayList<DetailField> detailFields;
}
