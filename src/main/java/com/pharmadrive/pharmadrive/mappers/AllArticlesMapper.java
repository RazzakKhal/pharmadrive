package com.pharmadrive.pharmadrive.mappers;

import org.springframework.stereotype.Component;

import com.pharmadrive.pharmadrive.dtos.toView.AllArticlesDto;
import com.pharmadrive.pharmadrive.models.Article;

@Component
public class AllArticlesMapper {

    public AllArticlesDto toDto(Article article) {
        if (article == null) {
            return null;
        }
        AllArticlesDto dto = new AllArticlesDto();
        dto.setId(article.getIdArticle());
        dto.setNameArticle(article.getNameArticle());
        dto.setPrice(article.getPrice());
        dto.setIsRefundable(article.getIsRefundable());
        return dto;
    }

    public Article toEntity(AllArticlesDto dto) {
        if (dto == null) {
            return null;
        }
        Article article = new Article();
        article.setIdArticle(dto.getIdArticle());
        article.setNameArticle(dto.getNameArticle());
        article.setPrice(dto.getPrice());
        article.setIsRefundable(dto.getIsRefundable());
        return article;
    }
}
