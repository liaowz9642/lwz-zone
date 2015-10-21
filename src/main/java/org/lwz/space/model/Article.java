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

    @ManyToOne
    @JoinColumn
    private User user;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(nullable = false)
    private ArticleType articleType;

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

    public ArticleType getArticleType() {
        return articleType;
    }

    public void setArticleType(ArticleType articleType) {
        this.articleType = articleType;
    }
}
