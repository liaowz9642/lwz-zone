package org.lwz.space.model;

import javax.persistence.*;

/**
 * Created by Liaowz on 2015/10/18.
 */
@Entity
@Table(name = "t_articleType")
public class ArticleType extends Domain {
    public static final String encode = "UTF-8";

    @Column(name="name", nullable = false)
    private String name;

    @Column(name="count", nullable = false)
    private int count;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
