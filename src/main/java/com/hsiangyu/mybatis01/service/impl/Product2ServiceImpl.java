package com.hsiangyu.mybatis01.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hsiangyu.mybatis01.dao.Product2Dao;
import com.hsiangyu.mybatis01.model.Product2Dto;
import com.hsiangyu.mybatis01.service.Product2Service;

@Service
public class Product2ServiceImpl implements Product2Service {

    @Autowired
    private Product2Dao product2Dao;

    @Override
    public List<Product2Dto> getByBooknum(int booknum) {
        List<Product2Dto> product2List = product2Dao.getByBooknum(booknum);
        System.out.println("product2List");
        System.out.println(product2List);
        return product2List;
    }

    @Override
    public List<Product2Dto> getAllBooknumData() {
        List<Product2Dto> product2List = product2Dao.getAllBooknumData();
        System.out.println("product2List all");
        System.out.println(product2List);
        return product2List;
    }

    @Override
    public boolean create(Product2Dto product2Dto) {
        boolean resultBoolean = product2Dao.create(product2Dto.getBooknum(), product2Dto.getBookname(),
                product2Dto.getBooktype(), product2Dto.getAuthor(), product2Dto.getPrice());
        System.out.println("resultBoolean [" + resultBoolean + "]");
        return resultBoolean;
    }

    @Override
    public int delete(int booknum) {
        int deleteCount = product2Dao.delete(booknum);
        System.out.println("deleteCount [" + deleteCount + "]");
        return deleteCount;
    }

}
