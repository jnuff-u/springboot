package com.exa.springboot.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @program:
 * @Author: Zhang Qiang
 * @Date: 2018/9/27 10:15
 * @Description:
 */
@Component
@PropertySource(value = "classpath:book.properties")
@ConfigurationProperties(prefix = "book.threekingdoms")
public class Book {

    private String author;

    private String name;

    private String pinyin;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPinyin() {
        return pinyin;
    }

    public void setPinyin(String pinyin) {
        this.pinyin = pinyin;
    }
}
