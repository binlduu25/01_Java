package edu.kh.control.practice;

import java.nio.file.spi.FileSystemProvider;
import java.util.Scanner;

public class ControlPractice {
	
	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		
		// 키보드로 입력 받은 정수가 양수이면서 짝수일 때만 “짝수입니다.”를 출력하고
		// 짝수가 아니면 “홀수입니다.“를 출력하세요.
		// 양수가 아니면 “양수만 입력해주세요.”를 출력하세요.
		
		System.out.printf("숫자를 입력하세요.");
		int num = sc.nextInt();
		String result = null;
		
		if ( num <= 0 ) {result = "0 초과 양수만 입력해주세요.";}
		else if ( num % 2 == 1) {result = "홀수입니다.";}
		else if ( num % 2 == 0) {result = "짝수입니다.";}
		
		System.out.println(result);
	}
	
	public void practice2() {
		
		// 국어, 영어, 수학 세 과목의 점수를 키보드로 입력받고 합계와 평균을 계산하고
		// 합계와 평균을 이용하여 합격/ 불합격 처리하는 기능을 구현하세요.
		// (합격조건: 세과목 점수 각각 40점 이상이면서 평균이 60점 이상일 경우)
		// 합격했을 경우 과목별 점수와 합계, 평균, “축하합니다, 합격입니다!”를 출력하고
		// 불합격인 경우에는 “불합격입니다.”를 출력하세요
	
		System.out.printf("국어 : ");	
		int krSco = sc.nextInt();
		System.out.printf("영어 : ");	
		int enSco = sc.nextInt();
		System.out.printf("수학 : ");	
		int mtSco = sc.nextInt();
		
		int tSco = krSco+enSco+mtSco;
		double aveSco = tSco/3.0;
		
		if ( (krSco < 40 || enSco < 40 || mtSco < 40) || aveSco < 60 )
			{System.out.printf("불합격입니다.\n");}
		else { System.out.printf("국어 : %d\n영어 : %d\n수학 : %d\n합계 : %d\n평균 : %.1f\n축하합니다. 합격입니다.",krSco,enSco,mtSco,tSco,aveSco);}
	}
	
	public void practice03() {
		
		 // 1~12 사이의 수를 입력받아 해당 달의 일수를 출력하세요.(2월 윤달은 생각하지 않습니다.)
		 // 잘못 입력한 경우 “OO월은 잘못 입력된 달입니다.”를 출력하세요. (switch문사용)
		
		System.out.printf("달을 입력하세요.");
		int month = sc.nextInt();
		int day = 0;
		
		switch (month) {
		case 1 : day = 31; System.out.println(day);break;
		case 2 : day = 28; System.out.println(day);break;
		case 3 : day = 31; System.out.println(day);break;
		case 4 : day = 30; System.out.println(day);break;
		case 5 : day = 31; System.out.println(day);break;
		case 6 : day = 30; System.out.println(day);break;
		case 7 : day = 31; System.out.println(day);break;
		case 8 : day = 31; System.out.println(day);break;
		case 9 : day = 30; System.out.println(day);break;
		case 10 : day = 31; System.out.println(day);break;
		case 11 : day = 30; System.out.println(day);break;
		case 12 : day = 31; System.out.println(day);break;
		default : System.out.println(month+"월은 잘못 입력된 달입니다."); 
		}
		
		
		
	}
	
	public void practice04() {
	
		// 중간고사, 기말고사, 과제점수, 출석횟수를 입력하고 Pass 또는 Fail을 출력하세요.
		// 평가비율은 중간고사 20%, 기말고사 30%, 과제 30%, 출석20%로 이루어져 있고
		// 이때, 출석횟수는 총 강의횟수 20회 중에서 출석한 날만 따진 값으로 계산하세요.
		// 70점 이상일 경우 Pass, 70점 미만이거나 전체강의에 30% 이상 결석 시 Fail을 출력하세요
		
		System.out.printf("중간고사 : ");
		double mid = sc.nextInt();
		System.out.printf("기말고사 : ");
		double fin = sc.nextInt();
		System.out.printf("과제점수 : ");
		double work = sc.nextInt();
		System.out.printf("출석횟수 : ");
		double att = sc.nextInt();
		
		mid *= 0.2;
		fin *= 0.3;
		work *= 0.3;
		att *= 1.0;
		
		double sum = mid + fin + work + att;
		String result = null;
		
		if( att <= 14 || sum < 70) {
			result = "FAIL";
		}
		else { result = "PASS";}
		
		System.out.println("--- 결과 ---");
		System.out.printf("중간고사 조정 점수: %.1f\n",mid);
		System.out.printf("기말고사 조정 점수: %.1f\n",fin);
		System.out.printf("과제 조정 점수: %.1f\n",work);
		System.out.printf("출결 조정 점수: %.1f\n",att);
		System.out.printf("결과: %s\n",result);
		
		
		
	}
	
	public void practice05() {
	}
	
	public void practiceATM() {
		
		// ATM 프로그램 만들기
		
		int cash = 10000;
		int deposit, withdraw = 0;
		int input = 0;
		
		System.out.println("** ATM 프로그램 **");
		System.out.printf("현재 잔액 : %d원\n",cash);
		
		while(input != 4) {
		
		System.out.println("\n메뉴를 선택하세요.");
		System.out.println("1. 입금하기");
		System.out.println("2. 출금하기");
		System.out.println("3. 잔액조회");
		System.out.println("4. 종료");
		System.out.printf(">> ");
		input = sc.nextInt();
		
			switch(input) {
			
			case 1 : 
				System.out.printf("입금할 금액을 입력하세요.\n");
				System.out.printf(">> ");
				deposit = sc.nextInt();
				cash += deposit;
				System.out.printf("%d원 입금되었습니다. 현재 잔액 : %d원\n",deposit,cash);
				break;
				
			case 2 : 
				System.out.printf("출금할 금액을 입력하세요.\n");
				System.out.printf(">> ");
				withdraw = sc.nextInt();
				
					if(cash<withdraw) {
					System.out.printf("잔액이 부족합니다. 현재 잔액 : %d원\n",cash);
					continue;
					}
					else{cash -= withdraw;
					System.out.printf("%d원 출금되었습니다. 현재 잔액 : %d원\n",withdraw,cash);
				}
				break;
				
			case 3 : 
				System.out.printf("현재 잔액은 %d원입니다.\n",cash);
				break;
			
			case 4 : 
				System.out.println("프로그램을 종료합니다.");
				break;
			
			default : 
				System.out.println("잘못된 입력입니다.");
			
			}
		}
	}	
	
	public void practiceDice() {
		
		// 컴퓨터와 주사위 게임
		
		int comDice = ( (int)( (Math.random()*6)+1 ) );
		int count = 0;
		int answer = 0;
		boolean Exit = true;
			
			System.out.println("** 주사위 맞히기 게임 시작 **");
			System.out.println("1에서 6까지 숫자를 맞혀보세요.(종료를 원하면 '종료' 입력)");
			
			while(Exit) {
				
					System.out.printf("\n숫자 입력 >> ");
					if(sc.hasNextInt()) { // 1. 정수인 경우
						int input = sc.nextInt();
						if(input < 1 | input > 6) { // 1.1 정수이지만 1~6 벗어날 때
						System.out.println("잘못된 입력입니다. 1~6 사이의 숫자를 입력하세요.");
						continue;
						}
						else { // 1.2 정수이면서 1~6 충족할 때	
							if(comDice > input) {System.out.println("틀렸습니다. 더 큰 수를 입력하세요."); // 1.2.1 작은 수 입력 
								count++;
								continue;
							}
							else if(comDice < input) {System.out.println("틀렸습니다. 더 작은 수를 입력하세요."); // 1.2.2 큰 수 입력
								count++;
								continue;
							}
							else if(comDice == input) {System.out.printf("\n정답입니다!\n새로운 주사위가 생성되었습니다.\n"); // 1.2.3 일치할 시
								comDice = ( (int)( (Math.random()*6)+1 ) );
								count++;
								answer++;
								continue;
							}
						}	
					}
					
					else { // 2. 텍스트일 때
						String text = sc.next(); 
						boolean isTextMeansExit = text.matches("종료");			
							if(isTextMeansExit) { // 2.1 텍스트이면서 종료일 때
								if(count == 0) {
									System.out.printf("\n=== 게임 종료 ===\n게임을 플레이하지 않았습니다.");
									Exit = false;
								}
								else {double winningRate = ((answer*100.0)/count);
									System.out.printf("\n=== 게임 종료 ===\n총 시도 횟수 : %d번\n정답 횟수 : %d번\n정답률 : %.1f%%\n",count,answer,winningRate);
									Exit = false;
								}
							}
					
							else {System.out.println("잘못된 텍스트입니다. 다시 입력하세요."); // // 2.2 종료 외 다른 텍스트
							continue;
							}
					}		
			}		
	}
}
	
