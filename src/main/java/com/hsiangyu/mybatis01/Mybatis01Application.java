package com.hsiangyu.mybatis01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// @SpringBootApplication(scanBasePackages = { "com.hsiangyu.mybatis01.dao" })
@SpringBootApplication()
public class Mybatis01Application {

    public static void main(String[] args) {
        System.out.println("start main");
        SpringApplication.run(Mybatis01Application.class, args);
        System.out.println("end main");
    }

}

// https://ithelp.ithome.com.tw/articles/10331969
// https://juejin.cn/post/7201831345415749692
// https://ithelp.ithome.com.tw/articles/10272581
// https://stackoverflow.com/questions/42907553/field-required-a-bean-of-type-that-could-not-be-found-error-spring-restful-ap
// https://mybatis.org/mybatis-3/zh_CN/configuration.html
// https://zh.wikipedia.org/zh-tw/MyBatis
// MyBatis
