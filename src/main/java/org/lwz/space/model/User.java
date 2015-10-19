package org.lwz.space.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by xiaoQuan on 2014/12/21.
 */
@Entity
@Table(name = "t_user")
public class User extends Domain {

    private String userName;

    private String password;



    public User(){}

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    @Column(name = "userName", nullable = true, length = 30)
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Column(name = "password", nullable = true, length = 20)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +super.toString() +
                '}';
    }
}
