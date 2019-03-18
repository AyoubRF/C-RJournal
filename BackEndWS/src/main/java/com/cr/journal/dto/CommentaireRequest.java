package com.cr.journal.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

@Getter
@Setter
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class CommentaireRequest {

    private String titre;
    private String commentaire;
    private Integer nbrsatisfaction;
    //en attente , approuver
    private String status;
}
