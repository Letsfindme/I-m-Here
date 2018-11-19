package com.fadi.imhere.controller;

import com.fadi.imhere.model.Article;
import com.fadi.imhere.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/user")
public class ArticleController {

    @Autowired
    private ArticleRepository articleRepository;




}
