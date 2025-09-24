package edu.kh.oop.practice.model.service;
//연습 예제 1 - BOOK

import edu.kh.oop.practice.model.vo.Book;

public class BookService {

	public void bookPractice() { 
		
		// 1) 기본 생성자 이용한 객체 생성
		Book book1 = new Book(); 
		
		// 2) 매개변수 이용한 객체 생성
		Book book2 = new Book("자바의 정석",30000,0.2,"홍길동");
		
		// 3) to.String 이용한 출력
 		System.out.println(book1);
		System.out.println(book2);
		
		// 4) setter 이용해 첫 번째 객체 수정
		System.out.println("===수정된 결과 확인===");
		book1.setTitle("C언어");
		book1.setPrice(30000);
		book1.setDiscountRate(0.1);
		book1.setAuthor("남궁성");
		
		// 5) to.String 이용한 출력
 		System.out.println(book1);
		
 		// 6) 각 객체의 할인율 적용
 		int book1Price = 0;
 		int book2Price = 0;
 		book1Price =  (int)( book1.getPrice() * ( 1 - book1.getDiscountRate() ) );
 		book2Price =  (int)( book2.getPrice() * ( 1 - book2.getDiscountRate() ) );
 		
 		
 		// 7) 결과
 		System.out.println("=====결과=====");
 		System.out.println("도서명 : "+book1.getTitle());
 		System.out.println("할인된 가격 : "+book1Price+" 원");
 		System.out.println("도서명 : "+book2.getTitle());
 		System.out.println("할인된 가격 : "+book2Price+" 원");

 		
	}
}
