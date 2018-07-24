package com.yiki.Dao;

import com.yiki.Entity.Person;

import java.util.List;

public interface PersonMapper {

 public Person getPersonById(Integer id);
 public List<Person> getAll();

}
