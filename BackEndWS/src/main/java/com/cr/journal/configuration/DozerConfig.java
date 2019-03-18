package com.cr.journal.configuration;

import com.cr.journal.entity.User;
import com.cr.journal.dto.*;
import com.cr.journal.entity.*;
import org.dozer.DozerBeanMapper;
import org.dozer.loader.api.BeanMappingBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static org.dozer.loader.api.TypeMappingOptions.mapEmptyString;
import static org.dozer.loader.api.TypeMappingOptions.mapNull;


@Configuration
public class DozerConfig {


    @Bean
    public BeanMappingBuilder beanMappingBuilder() {
        return new BeanMappingBuilder() {
            @Override
            protected void configure() {
                mapping(ArticleRequest.class,Article.class, mapNull(false), mapEmptyString(false));
                mapping(CategorieRequest.class, Categorie.class, mapNull(false), mapEmptyString(false));
                mapping(CommentaireRequest.class, Commentaire.class, mapNull(false), mapEmptyString(false));
                mapping(ImageRequest.class,  Image.class, mapNull(false), mapEmptyString(false));
                mapping(SousCategorieRequest.class, SousCategorie.class, mapNull(false), mapEmptyString(false));
                mapping(UserRequest.class, User.class, mapNull(false), mapEmptyString(false));

            }
        };
    }

    @Bean
    public DozerBeanMapper beanMapper() {
        DozerBeanMapper dozerBeanMapper = new DozerBeanMapper();
        dozerBeanMapper.addMapping(beanMappingBuilder());
        return dozerBeanMapper;
    }

}
