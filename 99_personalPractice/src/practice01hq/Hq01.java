package practice01hq;

import java.util.Scanner;

public class Hq01{
	
	Scanner sc = new Scanner(System.in);
	
	public void selfPractice01BMI() { // 1.BMI 구하기
		
		// 체중과 신장을 실수로 입력받아, 체질량지수를 계산하고, 
		// 그 값에 따라 과체중, 정상, 저체중 중 하나를 출력
		// BMI = 체중/신장의 제곱
		// 25 이상 : 과체중
		// 18.5 이상 25 미만 : 정상
		// 18.5 미만 : 저체중

		System.out.printf("체중 : ");
		double weight = sc.nextDouble();
		System.out.printf("신장 : ");
		double height = sc.nextDouble();

		double bmi = weight/Math.pow (height, 2); //Math.pow(height,2) 도 가능
		
		String resultbmi; 
		
		if ( bmi >= 25.0) {
			resultbmi = "과체중";
		} else if ( bmi < 25.0 && bmi >=18.5) {
			resultbmi = "정상";
		} else { resultbmi = "저체중";
		}
		
		System.out.println("BMI : "+bmi+", 결과 : "+ resultbmi);
		
		
		
		
	}
	
	public void selfPractice02Noname() { // 2. 세 자리 정수 각 자리수 합
		
		// 세 자리 정수를 입력받아, 정수의 각 자리수를 더한 합 구하기
		
		System.out.printf("세 자리수 정수 입력 : ");
		int num = sc.nextInt();
		
		int numA = num / 100; // int이기 때문에 정수값만 출력
		int numB = (num % 100) / 10;
		int numC = num % 10;
		
		System.out.println("백의 자리 수 : "+numA);
		System.out.println("십의 자리 수 : "+numB);
		System.out.println("일의 자리 수 : "+numC);		
	}
	
	public void selfPractice03AnnualIntersestRate() { // 3. 연이율 계산
		
		// 복리 계산
		// 총 금액 = 원금 x (1+연이자율)^기간
		// 원금, 연이자율, 기간을 입력받는다.
		
		System.out.print("원금 : ");
		int principal = sc.nextInt();
		System.out.print("이자율 : ");
		double interest = sc.nextDouble();
		System.out.print("기간 : ");
		int year = sc.nextInt();
		
		double totalMoney = principal*Math.pow(1+(interest/100.0),year);
		
		System.out.printf("총 금액 : %.2f\n",totalMoney);
		
	}
	
	public void selfPractice04ElectricityBill() { // 4. 전기요금 계산
		
		// 100kWh 이하 : kWh 당 100원
		// 101kWh ~ 200kWh : 100kWh 사용량에 대해 10,000원 + 초과분 kWh 당 150원
		// 201kWh 이상 사용 시 : 200kWh에 대해 25,000원 + 초과분 kWh 당 200원
		// 기본요금 : 기본 요금 5,000원
		
		System.out.printf("전기 사용량 입력(kWh) : ");
		int elecUsed = sc.nextInt();
		int basicFee = 5000;
		int sumFee = 0;
		
		if (elecUsed <= 100) {
			sumFee = basicFee + (elecUsed * 100);}
		else if (elecUsed > 100 && elecUsed <= 200) {
			sumFee = basicFee + 10000 + ((elecUsed - 100) * 150);}
		else if (elecUsed > 200) {
			sumFee = basicFee + 25000 + ((elecUsed - 200) * 250);}
		
		
		System.out.printf("전기 요금은 %d원 입니다.\n",sumFee);
	
		
	}
	
	public void selfPractice05DiscerningTriangle() { // 5. 삼각형 판별기 (미완성)
		
		System.out.printf("1변 : ");
		double t1 = sc.nextDouble();
		System.out.printf("2변 : ");
		double t2 = sc.nextDouble();
		System.out.printf("3변 : ");
		double t3 = sc.nextDouble();
		
		boolean resultTr;
		String resultTrText = null;
		
		if (t1 < (t2 + t3) && t2 < (t1 + t3) && t3 < (t1 + t2)) { resultTr = true; }
		else { resultTr = false; }
		
		if (resultTr && ((t1 == t2) && (t2 == t3)) ) {resultTrText = "정삼각형";}
		else if ( resultTr && ((t1 == t2) || (t2 == t3) || (t3 == t1)) ) {resultTrText = "이등변삼각형";}
		else if ( resultTr && (( (t1 * t1) + (t2 * t2) == (t3 * t3) ) ||
									  ( (t3 * t3) + (t2 * t2) == (t1 * t1) ) ||
									  ( (t1 * t1) + (t2 * t2) == (t2 * t2) )) ) {resultTrText = "직각삼각형";}
			else if ( !resultTr ) {resultTrText = "삼각형이 아닙니다.";}
				  
		System.out.println(resultTrText);
		
		
		
	}
	
	public void printingStar() { // 6. 정수 입력 받아 별 찍기 (못 풂)
		
		System.out.printf("정수 입력 : ");
		int num = sc.nextInt();
		
		for( int i = 1 ; i <= num ; i++ ) {
			
			for( int j = 1 ; j <= i ; j++) {
				System.out.printf("*");
					
			}
			System.out.println();
			
		}
		
		
	}
	
	public void baseballgame() {
	
		// 7. 숫자 야구 게임
		
		// 컴퓨터가 1~9 사이의 서로 다른 숫자 3개를 랜덤으로 선택
		// 사용자가 숫자 3개를 입력
		// 자리와 숫자가 모두 맞으면 스트라이크(S)
		// 숫자는 맞고 자리는 다르면 볼(B)
		// 시도할 때마다 결과 출력 → 정답 맞히면 종료
		
		
	}
}