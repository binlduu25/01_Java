package edu.kh.op.practice;

import java.util.Scanner;

public class OperatorPractice2 {
	
	Scanner sc = new Scanner(System.in);
			
	public void Practice4() {
		
		System.out.println("---연습 문제 4---");
		
		System.out.println();
		
			// 키보드로 나이를 입력받아 
			// 20세 이상이면 "저는 성인 입니다", 아니면 "저는 미성년 입니다" 출력.
			// 입력받은 값이 13세 이상이면서 19세 이하면 "청소년입니까? true"출력, 아니면 false 출력
		 	// 입력받은 값이 65세 이상이거나, 12세 이하면 
			// "노인이거나 어린이 입니까? true" 출력 아니면 false 출력
		
			System.out.printf("당신의 나이는? : ");
			int age = sc.nextInt();
		
			System.out.println();
						
				String ageResult1 = age>=20 ? "저는 성인입니다." : "저는 미성년입니다." ;
				System.out.println(ageResult1);
		
				String ageResult2 = ( (age>=13)&&(age<=19) )==true ? "청소년입니다." : "청소년이 아닙니다.";
				System.out.println(ageResult2);
			
				String ageResult3 = ( (age>=65)||(age<=12) )==true ? "노인 또는 어린이입니다." : "노인 또는 어린이가 아닙니다.";
				System.out.println(ageResult3);
	}
	
	public void Practice5() {
		
		// 마트에서 고객에게 할인 혜택을 제공하려고 한다
		// 물건의 총 가격과 회원 여부를 입력받아, 
		// 회원이라면 10% 할인을 적용하고, 그렇지 않다면 5% 할인을 적용한 최종 가격을 출력해라
		
		System.out.println("---연습 문제 5---");
		
		System.out.println();
			
			System.out.printf("가격을 입력하세요.");
			int price = sc.nextInt();
			
			sc.nextLine();
			
			System.out.printf("멤버십 있으세요?(true / false)");
			boolean whetherMembership = sc.nextBoolean(); // ★ true 또는 false 값을 받을 때는 sc.nexBoolean();으로 받는다.		
			
			double discountRate = whetherMembership == true ? 0.9 : 0.95;
			
			System.out.println("할인을 포함한 최종 금액 : "+(price*discountRate)+"원");
			
	}

	public void Practice6() {
		
		// ATM에서 사용자가 원하는 금액을 입력하면, 5만원, 1만원, 5천원, 1천원 단위로 최소 개수의 지폐로 돈을 인출하라
		// ex) 사용자가 123000원을 입력하면, 5만원 지폐 2장, 1만원 지폐 2장, 5천원 지폐 0장, 1천원 지폐 3장이 필요함
		
		System.out.println("---연습 문제 6---");
		
		System.out.println();
			
			System.out.printf("인출할 금액을 입력하세요. (1000원 단위 입력)");
			int moneyP = sc.nextInt();
			
			int money50000Ea = moneyP/50000;
			int money50000Rest = moneyP%50000;
			
			int money10000Ea = money50000Rest/10000;
			int money10000Rest = money50000Rest%10000;
			
			int money5000Ea = money10000Rest/5000;
			int money5000Rest = money10000Rest%5000;
			
			int money1000Ea = money5000Rest/1000;
			int money1000Rest = money5000Rest%1000;
			
				System.out.println();
			
			System.out.println("50,000원권 : "+money50000Ea+"장");
			System.out.println("10,000원권 : "+money10000Ea+"장");
			System.out.println("5,000원권 : "+money5000Ea+"장");
			System.out.println("1,000원권 : "+money1000Ea+"장");
			
			
			

		
		
	}
	
	public void Practice7() {
		
		// 사용자로부터 두 개의 정수를 입력받아, 
		// 첫 번째 수가 두 번째 수의 배수인지 확인하고 결과를 출력해라
		// 만약 배수라면 "배수입니다"를 출력하고, 아니라면 "배수가 아닙니다"를 출력
		
		System.out.println("---연습 문제 7---");
		
		System.out.println();
		
			System.out.printf("숫자 1을 입력하세요.");
			int num1 = sc.nextInt();
			System.out.printf("숫자 2를 입력하세요.");
			int num2 = sc.nextInt();
			
			int restNum = num1%num2;
			boolean checkNum = restNum == 0;
			
			String resultNum = checkNum == true ? "배수입니다." : "배수가 아닙니다.";
			System.out.println(resultNum);
		
	}
}
