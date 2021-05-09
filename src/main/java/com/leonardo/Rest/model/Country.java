package com.leonardo.Rest.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "pais")
@NoArgsConstructor
@Data
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "nome")
    private String name;
    @Column(name = "nome_pt")
    private String namePt;
    @Column(name = "sigla")
    private String initials;
    private Integer bacen;
}
