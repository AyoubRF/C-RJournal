package com.cr.journal.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "Sous_Categorie")
@Data
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
public class SousCategorie {
    @Id
    @Column(name = "ID_Sous_Categorie")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idSousCategorie;

    @Column
    private String name;
    @ManyToOne
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    Categorie categorie;
}
