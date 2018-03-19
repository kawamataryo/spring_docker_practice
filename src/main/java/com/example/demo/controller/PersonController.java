package com.example.demo.controller;

import com.example.demo.entity.Person;
import com.example.demo.searvice.PersonService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/person")
public class PersonController {

  @Autowired
  PersonService service;

  @RequestMapping(value="/",method= RequestMethod.GET)
  public List<Person> index(){
    return service.findAll();
  }

}
