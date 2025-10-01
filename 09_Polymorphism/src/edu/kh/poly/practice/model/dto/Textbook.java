package edu.kh.poly.practice.model.dto;

public class Textbook extends Book {

	private String textbook;

	public Textbook() {
	}

	public Textbook(String title, String author, String textbook) {
		super(title, author);
		this.textbook = textbook;

	}

	public String getTextbook() {
		return textbook;
	}

	public void setTextbook(String textbook) {
		this.textbook = textbook;
	}

	@Override
	public void displayInfo() {
		System.out.printf("[전문 서적] 제목 : %s / 저자 : %s / 과목 : %s\n", getTitle(), getAuthor(), textbook);

	}

}
