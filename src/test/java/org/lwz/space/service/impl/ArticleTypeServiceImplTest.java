package org.lwz.space.service.impl;

import org.junit.Test;
import org.lwz.space.model.Article;
import org.lwz.space.model.User;
import org.lwz.space.service.ArticleService;
import org.lwz.space.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.List;

/**
 * Created by Liaowz on 2015/10/18.
 */
public class ArticleTypeServiceImplTest {

    ApplicationContext applicationContext = new ClassPathXmlApplicationContext(new String[]{
            "classpath:applicationContext.xml"
    });


    @Test
    public void ArticleTypeSaveTest(){

        UserService userService = applicationContext.getBean("userService", UserService.class);
        List<User> userList = userService.list();
        User user =  userList.get(0);
        System.out.println(user);

        ArticleService articleService = applicationContext.getBean("ArticleService", ArticleService.class);
        Article article = new Article();
        article.setTitle("中文");
        article.setContent("這噢乖我");

        article.setUser(user);
        articleService.save(article);
    }

    @Test
    public void ArticleDeleteTest(){

        ArticleService articleService = applicationContext.getBean("ArticleService", ArticleService.class);
        Article article = articleService.list().get(0);
        articleService.delete(article);
    }











    @Test
    public void test(){
        System.out.println("Default Charset=" + Charset.defaultCharset());
        System.out.println("file.encoding=" + System.getProperty("file.encoding"));
        System.out.println("Default Charset=" + Charset.defaultCharset());
        System.out.println("Default Charset in Use=" + getDefaultCharSet());
    }
    private static String getDefaultCharSet() {
        OutputStreamWriter writer = new OutputStreamWriter(new ByteArrayOutputStream());
        String enc = writer.getEncoding();
        return enc;
    }
}
