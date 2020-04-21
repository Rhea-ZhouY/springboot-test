package com.Rhea.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
//    @Value("${name}")
//    private String name;
//    @Value("${age}")
//    private String age;
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getAge() {
//        return age;
//    }
//
//    public void setAge(String age) {
//        this.age = age;
//    }
    @RequestMapping("/person")
    public String Person(){
        return "hello Rhea";
    }
}
