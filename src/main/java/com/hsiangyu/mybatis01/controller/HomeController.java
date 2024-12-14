package com.hsiangyu.mybatis01.controller;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hsiangyu.mybatis01.model.Product2CreateRq;
import com.hsiangyu.mybatis01.model.Product2CreateRs;
import com.hsiangyu.mybatis01.model.Product2DeleteRs;
import com.hsiangyu.mybatis01.model.Product2Dto;
import com.hsiangyu.mybatis01.model.Product2Rs;
import com.hsiangyu.mybatis01.service.Product2Service;

@RestController
public class HomeController {

    @Autowired
    private Product2Service product2ServiceImpl;

    @GetMapping(value = "/")
    public Map<String, String> getHomePage() {
        System.out.println("controller /");
        Map<String, String> response = new LinkedHashMap<String, String>();
        response.put("page-name", "home page 測試");
        response.put("page-time", (new java.util.Date()).toString());
        response.put("page-time-GMTString", (new java.util.Date()).toGMTString());
        response.put("page-time-toLocaleString", (new java.util.Date()).toLocaleString());
        return response;
    }

    @GetMapping(value = "/home/product2/{booknum}")
    public Product2Rs getByBooknum(@PathVariable("booknum") int booknum) {
        System.out.println("controller /home/product2/{booknum}");
        Product2Rs response = new Product2Rs();
        List<Product2Dto> product2List = product2ServiceImpl.getByBooknum(booknum);
        response.setProduct2List(product2List);
        return response;
    }

    @GetMapping(value = "/home/product2/")
    public Product2Rs getAllBooknumData() {
        System.out.println("controller /home/product2/");
        Product2Rs response = new Product2Rs();
        List<Product2Dto> product2List = product2ServiceImpl.getAllBooknumData();
        response.setProduct2List(product2List);
        return response;
    }

    @PostMapping(value = "/home/product2/create/")
    public Product2CreateRs create(@RequestBody Product2CreateRq request) {
        System.out.println("controller /home/product2/create/");
        Product2CreateRs response = new Product2CreateRs();
        Product2Dto product2Dto = convertProduct2CreateRq(request);
        boolean createStatus = product2ServiceImpl.create(product2Dto);
        System.out.println("createStatus [" + createStatus + "]");
        response.setCreateStatus(createStatus);
        return response;
    }

    private Product2Dto convertProduct2CreateRq(Product2CreateRq input) {
        Product2Dto result = new Product2Dto();
        result.setBooknum(input.getBooknum());
        result.setBookname(input.getBookname());
        result.setBooktype(input.getBooktype());
        result.setAuthor(input.getAuthor());
        result.setPrice(input.getPrice());
        return result;
    }

    @PostMapping(value = "/home/product2/delete/{booknum}")
    public Product2DeleteRs delete(@PathVariable("booknum") int booknum) {
        System.out.println("controller /home/product2/delete/{booknum}");
        Product2DeleteRs response = new Product2DeleteRs();
        int deleteCount = product2ServiceImpl.delete(booknum);
        System.out.println("deleteCount [" + deleteCount + "]");
        response.setDeleteCount(deleteCount);
        return response;
    }

}