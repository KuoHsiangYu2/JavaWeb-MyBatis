package com.hsiangyu.mybatis01.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.hsiangyu.mybatis01.model.Product2Dto;

@Mapper
public interface Product2Dao {

    public List<Product2Dto> getByBooknum(int booknum);

    public List<Product2Dto> getAllBooknumData();

    public boolean create(int booknum, String bookname, String booktype, String author, int price);

    public int delete(int booknum);

}
