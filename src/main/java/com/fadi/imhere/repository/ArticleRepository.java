package com.fadi.imhere.repository;

import com.fadi.imhere.model.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Long> {
}
