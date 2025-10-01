package edu.kh.poly.ex2.model.service;

public class SJHCalculator implements Calculator/* , TestInterface */ { // 부모가 인터페이스일 때는 extends 대신 implements 사용

	// extends : 확장
	// implements : 구현

	// 부모 클래스 - 자식 클래스 : extends
	// 부모 인터페이스 - 자식 인터페이스 : extends
	// 부모 인터페이스 - 자식 클래스 : implements
	// 부모 클래스 - 자식 인터페이스 : 상속 불가

	// 인터페이스는 다중 상속 가능하다.

	@Override
	public int plus(int num1, int num2) {

		return num1 + num2;
	}

	@Override
	public int minus(int num1, int num2) {

		return num1 - num2;
	}

	@Override
	public int multiple(int num1, int num2) {

		return num1 * num2;
	}

	@Override
	public int divide(int num1, int num2) {

		return num1 / num2;
	}
}
