package edu.kh.inheritance.practice.model.vo;

public class Person {

	protected String name;
	private int age;
	private double height;
	private double weight;

	public Person() {
	}

	public Person(int age, double height, double weight) {

		// name 은 접근제한자 protected 로 선언되었기에 후손 클래스에서 접근 가능
		
		this.age = age;
		this.height = height;
		this.weight = weight;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public String information() {
		return String.format("이름 : %s / 나이 : %d / 신장 : %.1f / 몸무게 : %.1f", 
				name, age, height, weight);
		// printf 와 사용법 유사
	}

}
