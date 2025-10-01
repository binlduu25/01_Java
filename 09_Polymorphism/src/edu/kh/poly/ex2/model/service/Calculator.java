package edu.kh.poly.ex2.model.service;

// 계산기 인터페이스
// -> 모든 계산기에 대한 공통 필드, 기능명 제공하는 접점(interface)의 용도

public interface Calculator {
	
	// 인터페이스 : 추상클래스의 변형체(추상클래스보다 추상도가 조금 더 높다)
	 // - 추상클래스 : 클래스 내 일부만 추상메소드가 있으면 된다. 없어도 된다.
	 // - 인터페이스 : 인터페이스 내 모든메소드는 반드시 추상메소드여야 한다.
	
	 // 필드는 묵시적으로 public static final - 상수
	
	// 속성(필드)
	
	public static final double PI = 3.14;
	static final int MAX_NUM = 100;
	public int MIN_NUM = 1; // <- 이 변수의 경우 final 을 선언해주지 않았음에도 묵시적으로 final 로 선언된다.
	int ZERO = 0; // <- 마찬가지로 묵시적 선언
	
	// 모두 public static final 이라고 쓰지 않아도 인터페이스 필드 내에서 전부 상수로 선언된다.
	
	
	// 기능
	 // 메소드는 묵시적으로 public abstract
	 // 메소드지만 중괄호는 없다.
	public abstract int plus(int num1, int num2);
	int minus(int num1, int num2);
	public int multiple (int num1, int num2);
	public abstract int divide(int num1, int num2);
}
