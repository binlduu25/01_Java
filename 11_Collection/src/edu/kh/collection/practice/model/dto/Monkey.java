package edu.kh.collection.practice.model.dto;

public class Monkey extends Animal{
	
	public Monkey() {}
	public Monkey(String name) {
		super(name);
	}
	
@Override
	public void sound() {
	System.out.println("원숭이는 우끼끼");
	// ※ teacher
	 // System.out.println(name + "가 우끼끼 소리를 냅니다.");
	}

	
	
}
