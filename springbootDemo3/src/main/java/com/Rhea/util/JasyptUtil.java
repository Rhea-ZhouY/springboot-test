package com.Rhea.util;

import org.jasypt.util.text.BasicTextEncryptor;

public class JasyptUtil {
    public static void main(String[] args) {
        BasicTextEncryptor encryptor =new BasicTextEncryptor();
        encryptor.setPassword("12345@#");
        String username = encryptor.encrypt("root");
        String userpassword = encryptor.encrypt("root123");
        System.out.println(username);
        System.out.println(userpassword);
        //09UumHhFIPAu0QFInesS5A==
        //YFIIwYaHhVH71OUuh0UTuw==
    }
}
