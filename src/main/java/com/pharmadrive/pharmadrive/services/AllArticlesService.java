package com.pharmadrive.pharmadrive.services;

import java.util.List;

import com.pharmadrive.pharmadrive.dtos.toView.AllArticlesDto;

public interface AllArticlesService {
    List<AllArticlesDto> getAllArticles();
    AllArticlesDto createArticle(AllArticlesDto allArticlesDto);
}
