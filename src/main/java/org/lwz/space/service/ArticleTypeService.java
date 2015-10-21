package org.lwz.space.service;

import org.lwz.space.model.Article;
import org.lwz.space.model.ArticleType;

import java.util.List;

/**
 * Created by xiaoQuan on 2014/12/21.
 */
public interface ArticleTypeService {
    void save(ArticleType articleType);
    void delete(ArticleType articleType);
    List<ArticleType> list();
    void update(ArticleType articleType);
}
