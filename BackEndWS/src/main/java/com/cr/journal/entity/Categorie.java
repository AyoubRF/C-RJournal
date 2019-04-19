package com.cr.journal.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Categorie")
@Data
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor

public class Categorie {

    @Id
    @Column(name = "ID_Categorie")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCategorie;

    @Column
    private String name;

    @Column
    private String description;

    @OneToMany(mappedBy = "categorie")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private  List<SousCategorie> sousCategorie;

}
