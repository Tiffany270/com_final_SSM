package com.yiki.Tests;

import com.yiki.Service.PersonService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class Tests {

 PersonService service;

 @Test
 public void test() throws IOException {
  ApplicationContext cxt = new ClassPathXmlApplicationContext("spring.xml");
  service = (PersonService) cxt.getBean("personService");

  System.out.println(service.getAll());

 }
}

