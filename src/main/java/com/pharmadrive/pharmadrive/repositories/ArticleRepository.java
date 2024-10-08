package com.pharmadrive.pharmadrive.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pharmadrive.pharmadrive.models.Article;

@Repository
public interface ArticleRepository extends JpaRepository<Article, Long> {
    Article findByNameArticle(String nameArticle);
}
