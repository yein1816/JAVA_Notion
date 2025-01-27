package com.greedy.level02.normal.book.run;

import com.greedy.level02.normal.book.model.dto.BookDTO;

public class Application {
    public static void main(String[] args) {

        BookDTO bkdto = new BookDTO();
        System.out.print(bkdto.getTitle() + " ");
        System.out.print(bkdto.getPublisher() + " ");
        System.out.print(bkdto.getAuthor() + " ");
        System.out.print(bkdto.getPrice() + " ");
        System.out.println(bkdto.getDiscountRate());

        bkdto.Constructor("자바의 정석","도우출판","남궁성");
        bkdto.printlnformation();

        bkdto.setTitle("홍길동전");
        bkdto.setPublisher("활빈당");
        bkdto.setAuthor("허균");
        bkdto.setPrice(5000000);
        bkdto.setDiscountRate(0.5);

        bkdto.printlnformation();

//        System.out.print( bkdto.getTitle() + " ");
//        System.out.print( bkdto.getPublisher() + " ");
//        System.out.print( bkdto.getAuthor() + " ");
//        System.out.print( bkdto.getPrice() + " ");
//        System.out.print( bkdto.getDiscountRate());
    }
}
