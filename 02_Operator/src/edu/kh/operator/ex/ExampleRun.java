package edu.kh.operator.ex;

public class ExampleRun { // 실행용 클래스 (메인메서드 존재)


	public static void main(String[] args) {
		
		// 메서드를 '호출'해야 함
		// 메서드 호출 시 소괄호가 반드시 붙는다.
		// 이 부분에 OpExample의 메서드(설계도)를 불러오고자 할 때, 설계도를 반영한 '기계'가 필요하다
		// 즉, 변수 설정을 해줘야 함
		
		OpExample opEx = new OpExample();
		
		// 이제 기계를 만듦
		// Scanner sc = new Scanner(System.in);
		// Scanner 기능을 쓰기 위해서는 import로 불러와야 하지만
		// OpExample의 경우 같은 패키지 내에 있기 때문에 import하지 않아도 된다.

		// 이제 기능을 사용할 차례
		
		opEx.hi(); // 안녕! 을 불러오는 기능
		opEx.hungry(); // 배고프다 를 불러오는 기능

		System.out.println();
		
		System.out.println("---한 줄 띄우기---");
	
		System.out.println();
		
		opEx.testEx1(); // 증감 연산자 불러오기
		
		System.out.println();
		
		System.out.println("---한 줄 띄우기---");
	
		System.out.println();
		
		opEx.testEx2(); // 비교 연산자 불러오기

		System.out.println();
		
		System.out.println("---한 줄 띄우기---");
		
		System.out.println();

		opEx.testEx3(); // 논리 연산자 불러오기

		System.out.println();
		
		System.out.println("---한 줄 띄우기---");
		
		System.out.println();
		
		opEx.testEx4(); // 삼항 연산자 불러오기
		
		System.out.println();
		
		System.out.println("---한 줄 띄우기---");
		
		System.out.println();
		
		opEx.testEx5(); // 복합대입 연산자
		
		System.out.println();
		
		System.out.println("---한 줄 띄우기---");
		
		System.out.println();
		
		opEx.totalTest0912(); // 0912 테스트
		
	
	}
}
