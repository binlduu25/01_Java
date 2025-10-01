package edu.kh.control.condition; // 조건문

import java.util.Scanner;

public class ConditionExample {
	
	Scanner sc = new Scanner(System.in); 
	
	// class 안의 공간을 field라고 함
	// field + 생성자 + 메서드 = class 구성 3요소
	
	public void ConditionExample01() { //if
		
		// if 문
		// 조건식이 true일 때만 내부 코드 수행
		
		// 입력 받은 정수가 양수인지 검사
		// 양수라면 "양수입니다." 출력
		
		System.out.printf("입력 : ");
		int num = sc.nextInt();
		String result;
		if (num>=0) {
			System.out.println("양수입니다");
		}
		
		
		
	}
	
	public void ConditionExample02() {
		
		// 중첨 if문
		
		// 홀짝 검사
		// 입력받은 정수값이 홀수이면 "홀수", 짝수이면 "짝수", 0이면 "0"
		
		System.out.printf("숫자 입력 : ");
		int num2 = sc.nextInt();
		
		if(num2%2 != 0) { // 홀수일 경우
			System.out.println("홀수입니다.");}
		else if(num2 == 0) {
			System.out.println("0입니다.");}
		else {
			System.out.println("짝수입니다.");}
						
	}
	
	public void ConditionExample03() {
		
		// 달(month)을 입력받아 해당 달에 맞는 계절 출력
		// 겨울(12,1,2월)과 여름(6,7,8)에는 온도도 입력 받는다.
		// -15도 이하 : "한파 경보", -12도 이하 "한파 주의보"
		// 35도 이상 : "폭염 경보", 33도 이상 "폭염 주의보"
		
		System.out.printf("달을 입력하세요.");
		int month = sc.nextInt();
		String season;
			
		if ( month == 12 || month == 1 || month == 2) {			
			season = "겨울";
			System.out.printf("온도를 입력하세요.");
			int temp = sc.nextInt();
			
				if (temp <= -15) {
					System.out.printf("%s입니다. 한파 경보",season);}
				else if(temp > -15 && temp <= -5) {
					System.out.printf("%s입니다. 한파 주의보",season);}
				else {System.out.printf("%s입니다.",season);}
		}
		
		else if (month >= 6 && month <= 8) {				
			season = "여름";
			System.out.println("온도를 입력하세요.");
			int temp = sc.nextInt();
			
				if (temp >= 35) {
					System.out.printf("%s입니다. 폭염 경보",season);}
				else if(temp >= 28 && temp < 35) {
					System.out.printf("%s입니다. 폭염 주의보",season);}	
				else {System.out.printf("%s입니다.",season);}
		}
		
		else if ( month >=3 && month <=5) {			
			season = "봄";
			System.out.printf("%s입니다.",season);				
		}
		
		else if ( month >=9 && month <=11) {			
			season = "가을";
			System.out.printf("%s입니다.",season);
		}
		
		else{		
			season = "잘못된 입력입니다.";
			System.out.println(season);		
		}
		
	}
	
	public void ConditionExample04() {
		
		// 나이를 입력 받아 
		// 13세 이하, "어린이입니다."
		// 13 초과 ~ 19 이하 "청소년입니다."
		// 19 초과 "성인입니다."
		
		System.out.printf("나이를 입력하세요.");
		int age = sc.nextInt();
		
		if (age <= 13) System.out.println("어린이입니다.");
		else if (age <=19) System.out.println("청소년입니다.");
		else System.out.println("성인입니다.");
			
	}
	
	public void ConditionExample05() {
		
		// 점수(100점 만점)을 입력 받아
		// 90 이상 : A등급
		// 80 이상 ~ 90 미만 : B
		// 70 이상 ~ 80 미만 : C
		// 60 이상 ~ 70 미만 : D
		// 60 미만 : F
		// 0 미만 또는 100 초과 : "잘못 입력"
		
		System.out.printf("점수 입력 : ");
		int score = sc.nextInt();
		String result2 = null;
		
		if (score < 0 || score > 100) {result2 = "잘못된 입력입니다.";}
		else if (score >= 90) {result2 = "A";}
		else if(score >= 80) {result2 = "B";}
		else if(score >= 70) {result2 = "C";}
 		else if(score >= 60) {result2 = "D";}
 		else if(score >= 0) {result2 = "F";}
		
		System.out.printf("결과 : %s\n",result2);
		
		
	}
	
	public void ConditionExample06() {
		
		// 놀이기구 탑승 제한 검사
		// 나이가 12세 이상, 키 140.0 이상일 경우에만 "탑승가능"
		// 나이가 12미만인 경우 : "적정 연령이 아닙니다"
		// 키가 140.0 미만 : "적정 키가 아닙니다"
		// 나이가 0세 미만, 100세 초과 시 : "잘못 입력하셨습니다" 
				
		// [실행화면]
		// 나이 입력 : 10
		// 키 입력 : 160
		// 적정 연령이 아닙니다
			
		// 나이 입력 : 15
		// 키 입력 : 110
		// 적정 키가 아닙니다
				
		// 나이 입력 : 15
		// 키 입력 : 160
		// 탑승 가능
				
		// 나이 입력 : 300
		// 잘못 입력하셨습니다
		
		System.out.printf("나이를 입력하세요.");
		int age = sc.nextInt();
				
		if (age < 0 || age > 120) {System.out.println("나이를 잘못 입력하셨습니다.");}
		else if (age < 12) {System.out.println("적정 연령이 아닙니다.");}
		else if (age >= 12)
			{
			System.out.printf("키를 입력하세요.");	
			double height = sc.nextDouble();
				if (height < 0 || height >= 230.0) {System.out.println("키를 잘못 입력하셨습니다.");}
				else if (height < 140.0) {System.out.println("적정 키가 아닙니다.");}
				else if (height >= 140.0) {System.out.println("탑승 가능");}			
			}
	}
	
	public void ConditionExample07() { //switch
		
		// 여러 case 중 하나를 선택하여 수행하는 조건문
		// 요일 번호 입력하기 (월(1) ~ 일(7))
		
		System.out.printf("1~7까지 입력하세요.");
		int day = sc.nextInt();
		String dayR = null;
		
		switch (day)
		{
		case 1 : dayR = "월"; break;
		case 2 : dayR = "화"; break;
		case 3 : dayR = "수"; break;
		case 4 : dayR = "목"; break;
		case 5 : dayR = "금"; break;
		case 6 : dayR = "토"; break;
		case 7 : dayR = "일"; break;
		default : dayR = "잘못된 입력";
		}
		
		System.out.println(dayR);
		
		
	}
	
	public void ConditionExample08() {
		
		// 0 ~ 100 사이 정수 입력 받아 10으로 나눈 몫이 
		// 10 또는 9 일 때 A등급
		// 8 일 때 B,
		// 7 : C
		// 6 : D
		// 5 ~ 0 : F
		
		System.out.printf("0에서 100사이 정수를 입력하세요.");
		int scoref = sc.nextInt();
		String numf = null;
		
		switch ( scoref / 10) {
		case 10, 9 : numf = "A"; break;
		case 8 : numf = "B"; break;
		case 7 : numf = "C"; break;
		case 6 : numf = "D"; break;
		case 5,4,3,2,1,0 : numf = "F"; break;
		default : numf = "잘못된 입력입니다."; 
		}
		
		System.out.println(numf);
	}
	
	
}

