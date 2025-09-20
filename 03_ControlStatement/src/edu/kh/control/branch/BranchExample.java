package edu.kh.control.branch;

import java.util.Scanner;

	class BranchExample{
	
	Scanner sc = new Scanner(System.in);
	
		public void branchExample01() {
			
			// break 
			
			// 1부터 10까지 1씩 증가하며 출력하는 반복문 작성
			// 단, 5를 출력하면 반복문 종료
			// 출력 형식 : 1 2 3 4 5
			
			for (int i = 1; i <= 10; i++) {
				
				System.out.printf(i + " "); // 해당 위치에 있을 경우 5까지 출력
				
				if (i == 5) {
					break;
				}
				
				// System.out.printf(i + " "); // 해당 위치에 있을 경우 4까지 출력
				
			}
	
		}
		
		public void branchExample02() {
			
			// 입력받은 모든 문자열을 누적
			// 단, "exit@" 라는 문자 입력 시 문자열 누적 종료 후 결과 출력
			
			// 자바에서 일반 비교 연산자 "==" 는 문자열 비교로는 사용 불가
			// equals() 메서드 사용
			 // 문자열1.equals(문자열2)
			 // 문자열1과 문자열2가 같은지 비교 -> true/false 값 반환
			
			String str = ""; // 변수 먼저 설정해 준다. 빈 문자열 
							  // 누적해줄 문자열
			
			while (true) {// 조건문은 true일 시 계속 반복하므로, true만 입력 시 계속 반복 
				System.out.printf("문자열 입력(exit@ 입력 시 종료): ");
				String input = sc.nextLine();
				
				if (input.equals("exit@")) { // 문자열을 ""로 가둔다
					break;
				}
				
				str += input + "\n"; // 문자열 누적 결과. 개행하기 위해 "\n" 추가
			}
			System.out.println("------ 최종 결과 --------");
			System.out.println(str);
		}
		
		public void branchExample03() {
			
			// continue 반복문
			// 다음 반복으로 넘어간다.
			
			// 1 ~ 10 까지 1씩 증가하며 출력
			// 단, 3의 배수 제외
			// 1 2 4 5 7 8 10
			
			for (int n = 1; n <= 20; n += 2) {
				
				if (n%3 == 0) {
					continue;
				}
			System.out.printf(n + " ");
				
			}
			
		}
		
		public void branchExample04() {
			
			// 1 ~ 100까지 1씩 증가하며 출력하는 반복문
			// 단, 5의 배수는 건너뛰고
			// 증가하는 값이 40이 되었을 때 반복 멈춤
			
		for (int i = 1; i <= 100; i++) {
			if (i == 40) {
				break;
			}
			if(i%5 == 0) {
				continue; //continue 가 break 보다 위에 있을 경우, 40 역시 5의 배수이기 때문에 
						  // break를 건너뛰고 끝까지 계산하게 됨
			}
	
			System.out.printf(i + " ");
			
		}
			
			
		}
		
		public void branchExampleRspGame() {
			
			// 가위바위보 게임
			
			// 먼저, 몇 판 진행할지 입력받아야 함 >> for
			// 입력받은 판 수만큼 반복
			
			// 컴퓨터가 가위,바위,보 셋 중 하나를 랜덤으로 선택해야 함
			// Math.random()을 이용 >> 0.0 부터 1.0 사이 난수 생성 (실수 값)
			// 1 ~ 3 사이 난수 생성해야 함
			// 1이면 가위, 2면 바위, 3이면 보
			// 컴퓨터와 플레이어 사이 가위바위보 결과 판별
			// 이겼습니다! // 졌습니다ㅠㅠ // 비겼습니다 
			// 매판마다 0승 0무 0패 출력
			
			System.out.println("[가위바위보 게임]");
			System.out.printf("몇 판?");
			int round = sc.nextInt();
			
			int win = 0; // 승패 기록용 변수
			int draw = 0; // 승패 기록용 변수
			int lose = 0; // 승패 기록용 변수
			
			for(int i = 1; i <= round; i++) { // 입력받은 판수만큼 반복
				System.out.println("\n"+i+"번째 게임");
				System.out.printf("가위, 바위, 보 중 하나 입력 : ");
				String input = sc.next(); // 가위, 바위, 보 3개 중 하나라 next로 해도 무방
				
				int random = (int)(Math.random()*3+1); 
				// (int)로 강제 형변환
				// Math.random()은 0.0에서 1.0까지 실수 랜덤으로 나오고
				// 0.0 <= x < 1.0 의 범위이며 해당 범위에 3곱한 후 1 더하면
				// 1.0 <= x < 4.0 사이의 값이 나오게 된다.
				// 1 이상 4 미만 정수 랜덤 출력 >> 1,2,3
				
				String com = null; // null은 아무것도 참조하고 있지 않음이란 뜻이며 참조형에서 사용
				
				/*
				 * String은 참조형
				 * 참조형 : 메모리(heap) 공간에 있는 값의 주소를 참조하는 것
				 * 
				 * 1. String com = null;
				 * 2. String com;
				 * 3. String com = "";
				 * 	- 세 가지의 경우는 모두 다르다.
				 * 	 - 3번의 경우 com이라는 이름의 상자만 메모리에 생성함(선언만 한 상태이며 초기화되지 않음)
				 *   - 1번의 경우 null이라는 값으로 초기화를 한 것
				 *   - 2번의 경우 빈 문자열 객체로 초기화된 상태
				 *    - com 변수에 ""로 값이 실제로 들어간 상태  
				 */
						
				switch(random) {
				case 1 : com = "가위"; break;
				case 2 : com = "바위"; break;
				case 3 : com = "보"; break;
				}
				System.out.printf("컴퓨터는 [%s]를 선택했습니다.\n",com);
				
				if(input.equals(com)) { // 조건식이 true일 때
					System.out.println("비겼습니다.");
					draw++; //무승부 기록 
				}	
					
					else { // 조건식이 false일 때
						boolean win1 = input.equals("가위") && com.equals("보");
						boolean win2 = input.equals("바위") && com.equals("가위");
						boolean win3 = input.equals("보") && com.equals("바위");
					
						if(win1 || win2 || win3) {
							System.out.println("플레이어 승");
							win++; // 승 기록
						}
							else {System.out.println("졌습니다.ㅜㅜ");
							lose++;	// 패 기록
							}
							
					}
				
				System.out.printf("현재 기록 : %d승 %d무 %d패\n",win,draw,lose);
			
		}
}
}