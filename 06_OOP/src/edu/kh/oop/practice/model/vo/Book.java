package edu.kh.oop.practice.model.vo;
// 연습 예제 1 - BOOK

public class Book {

	// 1. 속성
	
	private String title;
	private int price;
	private double discountRate;
	private String author;
	
	public Book () { // 기본 생성자
	}
	
	// 매개변수 생성자
	
	public Book(String title, int price, double discountRate, String author) {
		this.title = title;
		this.price = price;
		this.discountRate = discountRate;
		this.author = author;
	}
	
	// getter 와 setter
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public double getDiscountRate() {
		return discountRate;
	}
	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}

	// to.String
	@Override
	public String toString() {
		return "title :" + title + "\nprice : " + price + "\ndiscountRate : " + discountRate + "\nauthor : " + author + "\n";
	}
	

	
		
}
