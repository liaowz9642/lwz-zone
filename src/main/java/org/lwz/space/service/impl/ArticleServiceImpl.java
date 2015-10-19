package org.lwz.space.service.impl;

import org.lwz.space.dao.ArticleDao;
import org.lwz.space.dao.UserDao;
import org.lwz.space.model.Article;
import org.lwz.space.model.User;
import org.lwz.space.service.ArticleService;
import org.lwz.space.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Liaowz on 2015/10/16.
 */
@Service("ArticleService")
public class ArticleServiceImpl implements ArticleService {

    @Resource
    private ArticleDao articleDao;

    @Override
    public void save(Article article) {
        this.articleDao.save(article);
    }

    @Override
    public void delete(Article article) {
        this.articleDao.delete(article);
    }

    @Override
    public List<Article> list() {
        return this.articleDao.list();
    }

    @Override
    public void update(Article article) {
        this.articleDao.update(article);
    }
}
