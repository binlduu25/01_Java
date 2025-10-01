package edu.kh.control.loop;

import java.util.Scanner;
	
	// while문

	// 별도의 초기식, 증감식이 존재하지 않고
	// 반복 종료 조건을 자유롭게 설정하는 반복문
	// 주로 반복 횟수가 정해져 있지 않을 때 사용
	// 확실히 얼마만큼 반복 후 끝날지는 모르지만
	// 언젠가 반복조건이 false가 되는 경우 반복 종료

	public class LoopExampleWhile{
	
		Scanner sc = new Scanner(System.in);

			public void LoopWhile01(){
			
				int input = 9; // 정수 설정(여기서 9는 임의값) (첫 값은 0이 아니어야 함. 즉 true여야 함)
							   // true이기 때문에 밑의 while 반복문을 시작할 수 있기에
				
				while(input != 0) { // input이 0이 아니라면 반복하겠다는 뜻, 즉 inpu이 0이면 true 아니면 false
					
					System.out.println("---- 메뉴 선택 ----");
					System.out.println("1.떡볶이");
					System.out.println("2.라면");
					System.out.println("3.김밥");
					System.out.println("0.종료");
					System.out.printf("메뉴 선택 >> ");
					input = sc.nextInt(); // input 재대입 시 새로 변수 설정하지 않는다.
						
						switch (input) {
						case 1 : System.out.println("떡볶이 주문"); break;
						case 2 : System.out.println("라면 주문"); break;
						case 3 : System.out.println("김밥 주문"); break;
						case 0 : System.out.println("프로그램 종료"); break;
						default : System.out.println("잘못 입력하셨습니다"); // 잘못 입력한 경우
						}
					
				}
			
				
				
				
			
			
		}
			public void LoopDowhile01() {
				
				// 조건식에 대한 t/f 값을 판단하기 전 특정 코드 먼저 실행
				
				// 입력되는 모든 정수의 합 구하기
				// 단, 0이 입력되면 반복 종료 후 결과 출력
				// -> 0이 입력되지 않으면 계속 반복
				
				/*
				 * 형식: do{
				 * 반복수행할 코드; <- // 조건식 만나기 전 무조건 한번은 수행되는 코드
				 * }while(조건식);
				 * 
				 */
				
				int input = 0; // 입력받은 값을 저장할 변수
				int sum = 0; // 합계를 저장할 변수
				
			
				
				do { 	System.out.printf("정수 입력 : ");
						input = sc.nextInt();
						sum = input + sum; // sum += input; 형식으로 쓰는 게 더욱 깔끔하다.
						
						if( input != 0) { // 최종적으로 0 입력 시 누적 합계 문구는 출력되지 않게
						System.out.printf("누적 합계 : %d\n",sum);}
						
				}while (input != 0);
						
						System.out.println("최종 합계 : "+sum);
				
			}
		
	
	
}