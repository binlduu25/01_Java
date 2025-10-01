package edu.kh.oop.practice.view;

import java.util.Scanner;

import edu.kh.oop.practice.model.controller.SnackControllerTeacher;

// 사용자에게 보여줄 응답화면 관련 코드가 모인 패키지
public class SnackMenuTeacher {
	
	// 필드
	
	private Scanner sc = new Scanner(System.in);
	private SnackControllerTeacher scrt = new SnackControllerTeacher();
	
	// 메소드
	
	public void menu(){
		
		System.out.println("스낵류를 입력하세요.");
		System.out.print("종류 : ");
		String kind = sc.next();
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("맛 : ");
		String flaovr = sc.next();
		System.out.print("개수 : ");
		int numOf = sc.nextInt();
		System.out.print("가격 : ");
		int price = sc.nextInt();
		
		System.out.print(scrt.saveData(kind, name, flaovr, numOf, price));
		
	}

	
	
}
