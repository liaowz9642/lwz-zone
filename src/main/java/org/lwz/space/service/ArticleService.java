package org.lwz.space.service;

import org.lwz.space.model.Article;
import org.lwz.space.model.User;

import java.util.List;

/**
 * Created by xiaoQuan on 2014/12/21.
 */
public interface ArticleService {
    void save(Article article);
    void delete(Article article);
    List<Article> list();
    void update(Article article);
}
