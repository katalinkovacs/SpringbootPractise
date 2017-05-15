package com.kati.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HomeController {


    private String message = "Hello Kati2";

    @Value("${kati.message}")
    private String message2;


    @Value("${kati.message.new}")
    private String messageNew;




    @RequestMapping("/hello")
     public String home(){

        return "Hello Kati  /hello";
    }


    @RequestMapping("/hello2")
    public String home2(){

        return message;
    }



    @RequestMapping("/hello3")
    public String home3(){

        return message2;
    }


    @RequestMapping("/hellonewmessage")
    public String home4(){

        return messageNew;
    }



}
