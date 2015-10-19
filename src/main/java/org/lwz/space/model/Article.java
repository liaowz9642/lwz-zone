package org.lwz.space.model;

import javax.persistence.*;
import java.io.UnsupportedEncodingException;

/**
 * Created by Liaowz on 2015/10/18.
 */
@Entity
@Table(name = "t_article")
public class Article extends Domain {
    public static final String encode = "UTF-8";

    @Column(name="title", nullable = false)
    private String title;

    @Column(nullable = false)
    private String content;

    @ManyToOne(cascade={CascadeType.MERGE})
    @JoinColumn
    private User user;  

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
