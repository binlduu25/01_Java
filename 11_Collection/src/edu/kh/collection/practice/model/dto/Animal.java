package edu.kh.collection.practice.model.dto;

public abstract class Animal { // 실습예제 2

	private String name;
	
	public Animal() {}
	public Animal(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public abstract void sound();

}
