package edu.kh.inheritance.practice.model.dto;

public class Phone {

	private String brand; // 브랜드
	private String model; // 모델
	private int year; // 출시연도
	private int price; // 가격

	public Phone() {
	}

	public Phone(String brand, String model, int year, int price) {
		this.brand = brand;
		this.model = model;
		this.year = year;
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void printInfo() {
		System.out.printf("브랜드 : %s\n모델 : %s\n출시연도 : %d\n가격 : %d원\n",brand,model,year,price);
	}

}
