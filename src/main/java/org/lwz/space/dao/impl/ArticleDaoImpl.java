package org.lwz.space.dao.impl;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.lwz.space.dao.ArticleDao;
import org.lwz.space.dao.UserDao;
import org.lwz.space.model.Article;
import org.lwz.space.model.User;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Liaowz on 2015/10/16.
 */
@Repository(value = "ArticleDao")
public class ArticleDaoImpl implements ArticleDao {

    @Resource
    private SessionFactory sessionFactory;

    @Override
    public void save(Article article) {
        this.sessionFactory.getCurrentSession().save(article);
    }

    @Override
    public void delete(Article article) {
        this.sessionFactory.getCurrentSession().delete(article);
    }

    @Override
    public void update(Article article) {
        this.sessionFactory.getCurrentSession().update(article);
    }

    @Override
    public List<Article> list() {
        Query query = this.sessionFactory.getCurrentSession().createQuery("FROM Article");

        return (List<Article>)query.list();
    }

}
