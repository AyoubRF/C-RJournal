package com.cr.journal.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Article")
@Data
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor

public class Article {
    @Id
    @Column(name = "ID_ARTICLE")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idArticle;
    @Column(name="TITRE")
    private String titre;
    @Column(name = "ARTICLE")
    private String article;
    @Column(name = "DATE_CREATION")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private Date creationDate = new Date();
    @Column(name = "Date_APPROUVEMENT")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private Date approvementdate = new Date();
    //attente , approuver
    @Column(name="STATUE")
    private String status;
    @OneToMany(mappedBy = "article")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private List<Image> images;
    @ManyToOne
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private  User journaliste;


}
