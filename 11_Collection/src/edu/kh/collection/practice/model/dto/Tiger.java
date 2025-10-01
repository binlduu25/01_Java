package edu.kh.collection.practice.model.dto;

public class Tiger extends Animal{

	public Tiger() {}
	public Tiger(String name) {
		super(name);
	}
	
	@Override
	public void sound() {
		System.out.println("호랑이는 어흥");
	
	// ※ teacher
	 // System.out.println(name + "가 어흥하며 포효합니다!");
	}
}
