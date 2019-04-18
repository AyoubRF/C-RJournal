package com.cr.journal.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "Image")
@Data
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
public class Image {

    @Id
    @Column(name = "ID_IMAGE")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idimage;

    @Column(name="IMAGE")
    private String image;

    @ManyToOne
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private  Article article;

//    @OneToOne(mappedBy = "image")
//    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
//    private  User user;

}
