package edu.kh.variable2;

import java.util.Scanner;

// import : 다른 패키지에 존재하는 클래스를 얻어오는 구문
// java.util.Scanner 
// 설계도를 가져왔다고 생각하면 됨

public class ScannerExample {

	public static void main(String[] args) {
		
		// Scanner 개요
		
		// Scanner란,
		// 사용자로부터 입력되는 정수, 실수, 문자열을 처리하는 클래스
		// 즉, 프로그램 실행 중 키보드 입력을 받을 수 있게 하는 역할
		// Scanner 객체를 생성해야 함
		// 	-> 내 프로그램 내 스캐너라는 기계를 새로 만든다고 생각하면 됨.
		// Scanner는 자료형
		
		Scanner sc = new Scanner(System.in);
		
		// 단축키 : ctrl + shift + o : 현재 클래스 내 import 되지 않은 모든 클래스를 자동으로 불러오고, 사용되지 않는 클래스 역시 삭제
		//sc를 입력 후 ctrl+space하면 sc가 쓸 수 있는 기능이 뜸
		
		System.out.print("정수 1 입력: ");   
		// sc.nextInt();는 정수를 입력받는 기능
		// 해당 기능만 입력한다면 숫자를 입력할 수는 있지만 입력한 값을 어느 곳에서도 사용할 수 없다.
		// 이를 해결하기 위해 입력받은 정수를 다른 곳에서 쓰기 위한 변수 입력이 아래처럼 필요.
		int input1 = sc.nextInt(); 
		// test: System.out.println(input1);
		
		System.out.print("정수 2 입력: ");   
		int input2 = sc.nextInt(); 
		// test: System.out.println(input2);
		
		System.out.printf("%d + %d = %d\n", input1, input2, input1+input2);
		// 입력한 값을 토대로 계산 예시
		
		
	}

}
