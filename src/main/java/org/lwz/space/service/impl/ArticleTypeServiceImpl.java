package org.lwz.space.service.impl;

import org.lwz.space.dao.ArticleDao;
import org.lwz.space.dao.ArticleTypeDao;
import org.lwz.space.model.Article;
import org.lwz.space.model.ArticleType;
import org.lwz.space.service.ArticleService;
import org.lwz.space.service.ArticleTypeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Liaowz on 2015/10/16.
 */
@Service("ArticleTypeService")
public class ArticleTypeServiceImpl implements ArticleTypeService {

    @Resource
    private ArticleTypeDao articleTypeDao;

    public void save(ArticleType articleType) {
        this.articleTypeDao.save(articleType);
    }

    public void delete(ArticleType articleType) {
        this.articleTypeDao.save(articleType);
    }

    public List<ArticleType> list() {
        return this.articleTypeDao.list();
    }

    public void update(ArticleType articleType) {
        this.articleTypeDao.update(articleType);
    }
}
