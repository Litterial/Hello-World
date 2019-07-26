package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.xml.ws.RequestWrapper;

@Controller
@RequestMapping("hello")
public class HelloController {
    @RequestMapping(value ="")
    @ResponseBody
    public String index()
    {
        return "Hello World";
    }
    @RequestMapping(value="Jibbs")
    @ResponseBody
    public String Jibbs()
    {
        return "My name is Kenn Jibbs";
    }

}
