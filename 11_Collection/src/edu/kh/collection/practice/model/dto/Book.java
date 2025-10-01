package edu.kh.collection.practice.model.dto;

public class Book {

	private int bookNo;
	private String title;
	private String author;
	private int price;
	private String publisher;
	
	public Book() {}
	public Book(int bookNo, String title, String author, int price, String Publisher) {
		this.bookNo = bookNo;
		this.title = title;
		this.author = author;
		this.price = price;
		this.publisher = publisher;
	}
	
	public int getBookNo() {
		return bookNo;
	}
	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
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
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	
	
}
