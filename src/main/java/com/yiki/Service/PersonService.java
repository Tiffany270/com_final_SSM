package com.yiki.Service;

import com.yiki.Dao.PersonMapper;
import com.yiki.Entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class PersonService {

 @Autowired
 private PersonMapper mapper;

 public Person getPersonById(Integer id){

  return mapper.getPersonById(id);

 }

 public List<Person> getAll(){

  return mapper.getAll();
 }

}
