package org.lwz.space.dao;

import org.lwz.space.model.Article;
import org.lwz.space.model.ArticleType;

import java.util.List;


public interface ArticleTypeDao {

    void save(ArticleType articleType);
    void delete(ArticleType articleType);
    List<ArticleType> list();
    void update(ArticleType articleType);


    ArticleType getArticleType(String name);
}
