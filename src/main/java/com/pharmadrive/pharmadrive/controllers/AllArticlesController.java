package com.pharmadrive.pharmadrive.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pharmadrive.pharmadrive.dtos.toView.AllArticlesDto;
import com.pharmadrive.pharmadrive.services.AllArticlesService;
@CrossOrigin
@RestController
@RequestMapping("/api/articles")
public class AllArticlesController {

    @Autowired
    private AllArticlesService allArticlesService;

    @GetMapping("")
    public List<AllArticlesDto> getAllArticles() {
        return allArticlesService.getAllArticles();
    }

    @PostMapping
    public AllArticlesDto createArticle(@RequestBody AllArticlesDto allArticlesDto) {
        return allArticlesService.createArticle(allArticlesDto);
    }
}
