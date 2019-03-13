package com.cr.journal.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "Commentaire")
@Data
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor

public class Commentaire {
    @Id
    @Column(name = "ID_COMMENTAIRE")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCommentaire;
    @Column(name="TITRE")
    private String titre;
    @Column(name="COMMENTAIRE")
    private String commentaire;
    @Column(name="NBR_SATISFACTION")
    private Integer nbrsatisfaction;
    //en attente , approuver
    @Column(name="STATUE")
    private String status;
    @ManyToOne
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private User visiteur;

}
