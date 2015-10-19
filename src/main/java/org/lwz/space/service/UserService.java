package org.lwz.space.service;

import org.lwz.space.model.User;

import java.util.List;

/**
 * Created by xiaoQuan on 2014/12/21.
 */
public interface UserService {
    void save(User user);
    void delete(User user);
    List<User> list();
    void update(User user);
}
