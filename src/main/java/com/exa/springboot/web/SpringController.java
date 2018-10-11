package com.exa.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.DateFormat;
import java.util.Date;

@Controller
public class SpringController {

    @RequestMapping(value = "/hello",produces = "text/plain;charset=UTF-8")
    public String Hello(Model m) throws Exception {
        System.out.println("hello :::  @RequestMapping(\"/hello\") ");

        m.addAttribute("now", DateFormat.getDateTimeInstance().format(new Date()));

        return "hello";
    }

    @RequestMapping("/excTest")
    public String excTest(Model m) throws Exception {
        m.addAttribute("now", DateFormat.getDateTimeInstance().format(new Date()));
        if (true){
            throw new Exception("异常");
        }
        return "error";
    }



}
