package com.pharmadrive.pharmadrive.controllers;

import com.pharmadrive.pharmadrive.dtos.toView.AllArticlesDto;
import com.pharmadrive.pharmadrive.services.AllArticlesService;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class ArticleGraphQLController {

    private final AllArticlesService allArticlesService;


    public ArticleGraphQLController(AllArticlesService allArticlesService) {
        this.allArticlesService = allArticlesService;

    }

    @QueryMapping
    public List<AllArticlesDto> articles() {
        return allArticlesService.getAllArticles();
    }


}