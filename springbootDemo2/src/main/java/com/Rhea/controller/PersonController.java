package com.Rhea.controller;

import com.Rhea.config.CatConfig;
import com.Rhea.config.PersonConfig;
import com.Rhea.domain.Cat;
import com.Rhea.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
    @Autowired
    private PersonConfig personConfig;
    @Autowired
    private CatConfig catConfig;
//    @Value("${person.name}")
//    private String name;
//    @Value("${person.age}")
//    private Integer age;
    @RequestMapping("/person")
    public Person Person(){
        Person person = new Person();
//        person.setName(name);
//        person.setAge(age);
        person.setAge(personConfig.getAge());
        person.setName(personConfig.getName());
        return person;
    }
    @RequestMapping("/cat")
    public Cat Cat(){
        Cat cat = new Cat();
        cat.setName(catConfig.getName());
        cat.setAge(catConfig.getAge());
        cat.setGender(catConfig.getGender());
        return cat;
    }

}
