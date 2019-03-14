package com.cr.journal.dao.repository;

import com.cr.journal.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository  extends JpaRepository<Article,Integer > {
}
