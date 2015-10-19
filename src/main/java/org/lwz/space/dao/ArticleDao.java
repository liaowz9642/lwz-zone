package org.lwz.space.dao;

import org.lwz.space.model.Article;
import org.lwz.space.model.User;

import java.util.List;


public interface ArticleDao {

    void save(Article article);
    void delete(Article article);
    List<Article> list();
    void update(Article article);


}
