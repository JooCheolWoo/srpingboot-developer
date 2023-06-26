package com.galaxypoby.springbootdeveloper.repository;

import com.galaxypoby.springbootdeveloper.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Article, Long> {
}
