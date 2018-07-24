package com.yiki.Controller;
import com.yiki.Service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class PersonController {

 @Autowired
 PersonService service;

 @RequestMapping("/quer")
 public String quer(Map<String,Object> map) {
  map.put("all",service.getAll());
  System.out.println(service.getAll());
  return "succ";
 }

}
