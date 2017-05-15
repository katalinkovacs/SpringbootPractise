package com.kati.controller;

import com.kati.model.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class Controller2 {

    @RequestMapping("/sebi")
    public String home(){

        User user01 = new User();
        user01.setFname("Sebi");
        user01.setLname("Kovacs");

        return user01.getFname();

    }


    @RequestMapping("/sebi2")
    public String home2(){

        User user01 = new User("Sebastian", "Kovacs");


        return user01.getFname() + " " +user01.getLname();


    }

    @Value("${sebi.user}")
    private String user;

    @RequestMapping("/sebastian")
    public String home3(){

        return user;
    }


}
