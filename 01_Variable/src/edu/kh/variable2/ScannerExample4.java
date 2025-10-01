package edu.kh.variable2;

import java.util.Scanner;

public class ScannerExample4 {
	public static void main(String[] args) {
		
		// Scanner 사용 시 문제점 정리
		
		Scanner sc = new Scanner(System.in);
		
		// 1.1.문제점
		// nextInt(), nextDouble(), next() 모두 공백은 수집하지 않는다.
		 // -> 위 기능 사용 후 nextLine() 사용 시,
		 
		System.out.print("nextInt() 입력: ");
		int num1 = sc.nextInt();

		System.out.println(); // 한 줄 띄우기 용
		
		System.out.print("nextLine() 입력: ");
		String text1 = sc.nextLine(); //공백까지 포함(개행 포함)
		
		// 위 코드의 문제점은 정수만 입력되고 nextLine()은 입력되지 않는다.
		// nextInt에서 정수값과 공백문자가 입력버퍼에 들어가고, nextInt()에는 정수 부분만 들어가고 공백문자는 남은 상태
		// nextLine이 공백과 개행까지 포함하여 입력되기 때문에
		// 이미 \n을 입력한 것으로 처리되는 것
		
		System.out.println(); // 한 줄 띄우기 용
		System.out.println(); // 한 줄 띄우기 용
		
		// 1.2.해결법
		 
		System.out.print("nextInt() 입력: ");
		int num2 = sc.nextInt();

		System.out.println(); // 한 줄 띄우기 용
		
		sc.nextLine(); // ★ 중간에 nextLine을 한번 입력하게 만들어 문제를 해결한다
		
		System.out.print("nextLine() 입력: ");
		String text2 = sc.nextLine(); //공백까지 포함(개행 포함)
		

	}
}

