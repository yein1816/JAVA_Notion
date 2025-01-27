package com.greedy.level02.normal.book.model.dto;

public class BookDTO {
    private String title;
    private String publisher;
    private String author;
    private int price;
    private double discountRate;

    // 기본 생성자 필드 3가지를 초기화 하는 생성자, 모든 필드를 초기화 하는 생성자 작성
    public void Constructor(String title, String publisher,String author){
        this.title = title;
        this.publisher = publisher;
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public String getTitle(){
        return this.title;
    }

    public void setPublisher(String publisher){
        this.publisher = publisher;
    }
    public String getPublisher(){
        return this.publisher;
    }

    public void setAuthor(String author){
        this.author = author;
    }
    public String getAuthor(){
        return this.author;
    }

    public void setPrice(int price){
        this.price = price;
    }
    public int getPrice(){
        return this.price;
    }

    public void setDiscountRate(double discountRate){
        this.discountRate = discountRate;
    }
    public double getDiscountRate(){
        return this.discountRate;
    }

    public void printlnformation(){
        System.out.println(this.title + " " + this.publisher +  " " + this.author + " " + this.price + " " + this.discountRate);
    }
}

