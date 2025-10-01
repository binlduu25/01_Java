package edu.kh.oop.practice.view;

import java.util.Scanner;

import edu.kh.oop.practice.model.vo.Snack;

public class SnackMenu {
	
	Scanner sc = new Scanner(System.in);
	Snack sn = new Snack();
	
	public void menu() {
		
		System.out.println("스낵류를 입력하세요.");
		System.out.print("종류 : ");
		sn.setKind( sc.next() );
		System.out.print("이름 : ");
		sn.setName( sc.next() );
		System.out.print("맛 : ");
		sn.setFlavor( sc.next() );
		System.out.print("개수 : ");
		sn.setNumOf( sc.nextInt() );
		System.out.print("가격 : ");
		sn.setPrice( sc.nextInt() );
		
		System.out.println("저장 완료되었습니다.");
		System.out.print("저장한 정보를 확인하시겠습니까? (y/n)");
		String yn = sc.next();
		
		while( !(yn.equals("y")) && !(yn.equals("n")) ) {
			System.out.println("y 또는 n을 입력하세요.");
		}
		
		if(yn.equals("y")) {
			System.out.printf(sn.information(),sn.getKind(),sn.getName(),sn.getFlavor(),sn.getNumOf(),sn.getPrice());	
		}
		
				
	}
	
	
}
