package com.hsiangyu.mybatis01.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Product2Dto {

    @JsonProperty("booknum")
    private int booknum;

    @JsonProperty("bookname")
    private String bookname;

    @JsonProperty("booktype")
    private String booktype;

    @JsonProperty("author")
    private String author;

    @JsonProperty("price")
    private int price;

    public int getBooknum() {
        return booknum;
    }

    public void setBooknum(int booknum) {
        this.booknum = booknum;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public String getBooktype() {
        return booktype;
    }

    public void setBooktype(String booktype) {
        this.booktype = booktype;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}
