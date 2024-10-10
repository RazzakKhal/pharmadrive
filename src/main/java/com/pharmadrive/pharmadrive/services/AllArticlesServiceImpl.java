package com.pharmadrive.pharmadrive.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pharmadrive.pharmadrive.dtos.toView.AllArticlesDto;
import com.pharmadrive.pharmadrive.mappers.AllArticlesMapper;
import com.pharmadrive.pharmadrive.models.Article;
import com.pharmadrive.pharmadrive.repositories.ArticleRepository;

@Service
public class AllArticlesServiceImpl implements AllArticlesService {

    @Autowired
    private ArticleRepository articleRepository;

    @Autowired
    private AllArticlesMapper allArticlesMapper;

    @Override
    public List<AllArticlesDto> getAllArticles() {
        List<Article> articles = articleRepository.findAll();
        return articles.stream().map(allArticlesMapper::toDto).collect(Collectors.toList());
    }

    @Override
    public AllArticlesDto createArticle(AllArticlesDto allArticlesDto) {
        Article article = allArticlesMapper.toEntity(allArticlesDto);
        Article savedArticle = articleRepository.save(article);
        return allArticlesMapper.toDto(savedArticle);
    }
}
