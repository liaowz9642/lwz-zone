package org.lwz.space.service.impl;

import org.junit.Test;
import org.lwz.space.model.User;
import org.lwz.space.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by Liaowz on 2015/10/16.
 */
public class UserServiceImplTest {
    ApplicationContext applicationContext = new ClassPathXmlApplicationContext(new String[]{
            "classpath:applicationContext.xml"
    });



    @Test
    public void saveUserTest(){

        UserService userService = applicationContext.getBean("userService", UserService.class);
        userService.save(new User("liaowz", "lwz4688560"));
    }

    @Test
    public void searchUserTest(){

        UserService userService = applicationContext.getBean("userService", UserService.class);
        List<User> userList = userService.list();
        User user =  userList.get(0);
        System.out.println(user);
    }

    @Test
    public void updateUserTest(){

        UserService userService = applicationContext.getBean("userService", UserService.class);
        List<User> userList = userService.list();
        User user =  userList.get(0);
        System.out.println(user);
        user.setUserName("newliaowz");
        userService.update(user);
    }

    @Test
    public void deleteUserTest(){

        UserService userService = applicationContext.getBean("userService", UserService.class);
        List<User> userList = userService.list();
        User user =  userList.get(0);
        System.out.println(user);
        userService.delete(user);
    }
}
