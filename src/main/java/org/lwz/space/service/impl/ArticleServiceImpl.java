package org.lwz.space.service.impl;

import org.lwz.space.dao.ArticleDao;
import org.lwz.space.dao.ArticleTypeDao;
import org.lwz.space.dao.UserDao;
import org.lwz.space.model.Article;
import org.lwz.space.model.ArticleType;
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

    @Resource
    private ArticleTypeDao articleTypeDao;

    @Resource
    private UserDao userDao;



    @Override
    public void save(Article article) {
        User user = userDao.getUser(article.getUser().getUserName(), article.getUser().getPassword());
        if (user == null) {
            throw new IllegalStateException("User not found");
        }
        ArticleType articleType = articleTypeDao.getArticleType(article.getArticleType().getName());

        article.setUser(user);
        article.setArticleType(articleType);

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
