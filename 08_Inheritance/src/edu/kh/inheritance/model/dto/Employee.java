package edu.kh.inheritance.model.dto;

/*
 * Object
 * 	ㄴ Person
 * 		ㄴ Employee / Student 
 *		   (Employee 와 Student 둘 사이의 관계는 공통의 부모를 가졌을 뿐임) 
 * 
 * 
 */


public class Employee extends Person{

	// 필드
	
	private String company;
	
	public Employee() {}
	
	public Employee(String name, int age, String nationality, String company) {
		super(name, age, nationality);
		this.company = company;
	}
	
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	
	// 오버라이딩 TEST
	
	// 오버라이드(Override)란 ★★★★
	 // 부모가 가진 메소드를 자식이 재정의
	
	// @ : annotation : 컴파일러 인식용 주석(즉, 컴파일러가 읽는 주석)
	 // @ 하단의 메소드가 부모 클래스의 메소드를 정확히 재정의했는지(규칙 및 문법에 맞게 잘 작성되었는지) 검사
	
	@Override
	public void move() {
		System.out.println("OVERRIDE : 하지만 노동자는 움직이고 싶지 않다.");
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + " / " + company; 
	}
	
	
	// final 이 선언되면 오버라이딩으로 사용 불가, 그대로 가져가서 기능만 사용 가능
	public final void onlyEMployee() {
		System.out.println("파이널 입니다.");
	}
	
	
	
	
}
