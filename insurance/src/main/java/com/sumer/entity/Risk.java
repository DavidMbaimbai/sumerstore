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
public class Risk{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "header_id", referencedColumnName = "id")
    private Header header;

    @Column(length = 1000)
    private String description;

    private int sumInsured;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "risk_id", referencedColumnName = "id")
    private ArrayList<DetailField> detailFields;
}
