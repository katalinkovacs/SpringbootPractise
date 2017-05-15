package com.kati.controller;

import com.kati.model.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controller3 {

    @RequestMapping("/html")
    public String home(){

        return "<!DOCTYPE html> <html> <body> <h1>My First Heading</h1> <p>My first paragraph.</p> </body> </html>";

    }

    @Value("${html.msg}")
    private String msg;

    @RequestMapping("/html2")
    public String home2(){

        return msg;
    }


}
