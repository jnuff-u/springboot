package com.exa.springboot.web;

import com.exa.springboot.pojo.Book;
import org.junit.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @program:
 * @Author: Zhang Qiang
 * @Date: 2018/9/27 10:20
 * @Description:
 */
@Controller
public class BookController {

    @Autowired
    private Book book;

    @RequestMapping(value = "/book",produces = "text/plain;charset=UTF-8")
    public String swithBook(Model m){
        System.out.println("book : ::  book ");

        m.addAttribute("author", book.getAuthor());
        m.addAttribute("name",book.getName());
        m.addAttribute("pinyin",book.getPinyin());

        return "book";
    }


}
