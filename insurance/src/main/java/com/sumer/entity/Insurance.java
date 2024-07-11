package com.sumer.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class Insurance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "root_id", referencedColumnName = "id")
    private ArrayList<Policy> policies;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "header_id", referencedColumnName = "id")
    private Header header;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "root_id", referencedColumnName = "id")
    private ArrayList<Address> addresses;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "root_id", referencedColumnName = "id")
    private ArrayList<DetailField> detailFields;
}