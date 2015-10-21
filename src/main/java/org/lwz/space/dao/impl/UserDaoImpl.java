package org.lwz.space.dao.impl;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.lwz.space.dao.UserDao;
import org.lwz.space.model.User;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Liaowz on 2015/10/16.
 */
@Repository(value = "userDao")
public class UserDaoImpl implements UserDao {

    @Resource
    private SessionFactory sessionFactory;

    @Override
    public void save(User user) {
        this.sessionFactory.getCurrentSession().save(user);
    }

    @Override
    public void delete(User user) {
        this.sessionFactory.getCurrentSession().delete(user);
    }

    @Override
    public List<User> list() {
        Query query = this.sessionFactory.getCurrentSession().createQuery("FROM User");

        return (List<User>)query.list();
    }

    public List<User> listBySQL() {
        Query query = this.sessionFactory.getCurrentSession().createSQLQuery("select * from t_user");
        return query.list();
    }

    @Override
    public void update(User user) {
        this.sessionFactory.getCurrentSession().update(user);
    }

    @Override
    public User getUser(String userName, String password) {
        Query query = this.sessionFactory.getCurrentSession()
                .createQuery("FROM User where userName = :userName and password=:password");
        query.setParameter("userName", userName);
        query.setParameter("password", password);
        return (User) query.uniqueResult();
    }
}
