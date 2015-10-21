package org.lwz.space.dao.impl;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.lwz.space.dao.ArticleDao;
import org.lwz.space.dao.ArticleTypeDao;
import org.lwz.space.model.Article;
import org.lwz.space.model.ArticleType;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Liaowz on 2015/10/16.
 */
@Repository(value = "ArticleTypeDao")
public class ArticleTypeDaoImpl implements ArticleTypeDao {

    @Resource
    private SessionFactory sessionFactory;

    public void save(ArticleType articleType) {
        this.sessionFactory.getCurrentSession().save(articleType);
    }

    public void delete(ArticleType articleType) {
        this.sessionFactory.getCurrentSession().save(articleType);
    }

    public List<ArticleType> list() {
        Query query = getSession().createQuery("FROM ArticleType");

        return (List<ArticleType>)query.list();
    }

    public void update(ArticleType articleType) {
        getSession().update(articleType);
    }

    @Override
    public ArticleType getArticleType(String name) {
        Query query = getSession().createQuery("from ArticleType where name=:name");
        query.setParameter("name", name);
        return (ArticleType) query.uniqueResult();
    }



    private Session getSession(){
        return sessionFactory.getCurrentSession();
    }
}
