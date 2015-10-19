package org.lwz.space.dao;

import org.lwz.space.model.Person;

import java.util.List;

/**
 * Created by xiaoQuan on 2014/12/21.
 */
public interface PersonDao {
    void save(Person person);
    List<Person> list();
    Person get(Integer id);
}
