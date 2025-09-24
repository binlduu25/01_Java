package edu.kh.oop.method.model.service;
public class MethodExample{
	
	// 메소드가 호출될 때마다 Stack 자료구조에 메소드를 실행한 이력이 쌓인다.
	// main -> method1 -> method2
	// 제일 마지막에 쌓인 순서대로 스택에서 나감
	// LIFO (후입선출)
	// method2 -> method1 -> main
	
	public void method1() { // 메소드 이름이 method1		
		int result = method2(3,5);
		System.out.println(result);
		// 해당 줄에 return; 이 있는 것과 마찬가지
		// return; 뜻 : 해당 메소드 종료 후 호출한 곳으로 되돌아감.
		// 메소드는 무조건 값을 반환해야 한다.
		// 반환값이 필요 없는 경우 메소드명에 void 작성 필요
	}
	
	public int method2(int a, int b) { 
		int sum = a + b;
		return sum;
		// 매개변수 a 와 b 를 더한 값을 sum 으로 반환하겠다.
	}
	
}