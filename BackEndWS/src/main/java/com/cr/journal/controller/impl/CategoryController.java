package com.cr.journal.controller.impl;

import com.cr.journal.dao.repository.CategorieRepository;
import com.cr.journal.entity.Categorie;
import com.cr.journal.entity.SousCategorie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(value = "*")
@RestController
@RequestMapping("/api/categories")
public class CategoryController {

    @Autowired
    CategorieRepository categorieRepository;

    @GetMapping("/")
    public List<Categorie> getCategories(){

        List<Categorie> categories = new ArrayList<>();
        List<SousCategorie> sousCategorieList = new ArrayList<>();
        Categorie c1 = new Categorie(1,"Sports","Sports Category",null);
        Categorie c2 = new Categorie(2,"Arts","Art Category",null);

        categories.add(c1);
        categories.add(c2);

        return categories;
    }


}
