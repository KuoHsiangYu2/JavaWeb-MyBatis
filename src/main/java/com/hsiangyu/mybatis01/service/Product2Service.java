package com.hsiangyu.mybatis01.service;

import java.util.List;

import com.hsiangyu.mybatis01.model.Product2Dto;

public interface Product2Service {

    /* 依據 booknum 查出對應的 Products資料 */
    public List<Product2Dto> getByBooknum(int booknum);

    /* 查出所有 Products資料 */
    public List<Product2Dto> getAllBooknumData();
    
    /* 新增一筆 Products資料 */
    public boolean create(Product2Dto product2Dto);
    
    /* 依據 booknum 刪除對應的 Products資料 */
    public int delete(int booknum);
}
