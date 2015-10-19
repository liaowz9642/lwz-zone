package org.lwz.space.service.impl;

import org.lwz.space.dao.UserDao;
import org.lwz.space.model.User;
import org.lwz.space.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Liaowz on 2015/10/16.
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    @Override
    public void save(User user) {
        this.userDao.save(user);
    }

    @Override
    public void delete(User user) {
        this.userDao.delete(user);
    }

    @Override
    public List<User> list() {
        return this.userDao.list();
    }

    @Override
    public void update(User user) {
        this.userDao.update(user);
    }
}
