package edu.kh.variable2;

import java.util.Scanner;

public class ScannerExample3 {
	public static void main(String[] args) {
		
		// 문자열 스캐너 기능 사용
		
		Scanner sc = new Scanner(System.in);
		
		// 문자열을 3번 입력받아 한줄로 출력
		// nextLine();과 next(); 의 두 가지가 있지만 후자의 경우 띄어쓰기나 줄 바꿀 경우 자동으로 입력 중단
		// nextLine은 공백을 모두 수집한다
		
		System.out.print("첫 번째 텍스트: ");
		String text1 = sc.nextLine();
		System.out.println();
		System.out.print("두 번째 텍스트: ");
		String text2 = sc.nextLine();
		System.out.println();
		System.out.print("세 번째 텍스트: ");
		String text3 = sc.nextLine();
		System.out.println();
		
		System.out.printf("출력되는 문장: %s? %s! %s.....",text1,text2,text3);
		System.out.println();

		
	}

}
