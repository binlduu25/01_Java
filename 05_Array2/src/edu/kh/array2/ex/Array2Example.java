package edu.kh.array2.ex;

import java.util.Arrays;

class Array2Example{
	
	// 2차원 배열이란
	// 자료형이 같은 1차원 1배열을 묶음으로 다룬 것
	// -> 행, 열 개념 추가
	
	public void arrayex01() {
		
		// 1. 2차원 배열 선언
			
			int [][] arr ;
			// int arr [][];
			// int [] arr []; 
			// 3가지 모두 동일
		
		// 2. 2차원 배열 할당
			// ->new 자료형 [행][열];
			
			arr = new int[2][3];
			// heap 영역에 int 2차원 배열 2행 3열 공간 할당
			// 그 공간의 주소를 arr 참조변수에 대입
			
		// 3. 2차원 배열의 초기화
			// 1) 행, 열 인덱스 이용해 직접 초기화
		
			/*
			arr[0][0] = 10;
			arr[0][1] = 20;
			arr[0][2] = 30;
			
			arr[1][0] = 40;
			arr[1][1] = 50;
			arr[1][2] = 60;
			*/
			
			// 2) 2중 for문 이용한 초기화
			
			int num = 10; //배열 요소 초기화에 사용할 변수
			System.out.println(arr.length); // 결과는 2가 나온다. 왜? -> 행의 길이
			System.out.println(arr[0].length); // 결과는 3 왜? -> 0열의 길이
			System.out.println(arr[1].length); // 결과는 3 왜? -> 1열의 길이
			
			for(int row = 0; row < arr.length; row++) { // 행 반복(0,1)
				for(int col = 0; col < arr[row].length; col++) { // 열 반복 (0,1,2)
					
					arr[row][col] = num;
					num += 10;
						
				}
			}
		
			// Arrays.toString은 참조하고 있는 1차원 배열의 값을 문자열로 반환하는 메서드
			System.out.println(Arrays.toString(arr));
			// 따라서, 이럴 땐 다른 메서드 사용
			// Arrays.deepToString(); 
			// 참조하고 있는 배열의 실제 데이터가 나오는 부분까지
			// 깊게 파고들어 모든 값을 문자열로 반환
			System.out.println(Arrays.deepToString(arr));
			
			
			// 3) 선언과 동시에 초기화
			
			// int [][] arr2 = {{1,2,3},
			//				{4,5,6}};
			
		
		
	}
	
	public void arrayex02() {

		
		
		// 2차원 배열 선언과 동시에 초기화
		// 3행 3열 짜리 정수형태 2차원 배열
		// 1~9까지 초기화
		
		int[][]arr = { {1,2,3},
					   {4,5,6},
					   {7,8,9} };
			
			// 행별로 합 구하기
			// 열별로 합 구하기
		
			// 0행의 합 : 6
			// 1행의 합 : 15
			// 2행의 합 : 24
	
			for(int row = 0; row < arr.length; row++) { //행반복
					
				int sum = 0; // 첫 번째 for문 바깥에 있으면 안된다. 각 행을 합을 구할 때마다 초기화해줘야 하기 때문
				
				for(int col = 0; col < arr[row].length; col++) { //열반복
					// 처음
					// row == 0
					// col == 0
					// sum == 0
					sum += arr[row][col];
					
				}
				System.out.printf("%d행의 합 : %d\n",row,sum);
				
			}
			System.out.println("=============");
			
			// 열의 합
			
			for(int col2 = 0; col2 < arr[0].length; col2++) {
				int sum = 0;				
				for(int row2 = 0; row2 < arr.length; row2++) {
					sum += arr[row2][col2];
					
				}
				
				System.out.printf("%d열의 합 : %d\n",col2,sum);
				
				
			}
			
			
		
	}
	
	public void arrayex03(){
		
		// 가변 배열
		// 2차원 배열 생성 시 마지막 배열 차수(열)을 지정하지 않음
		// 나중에 서로 크기가 다른 배열을 생성하여 참조
		
		char[][]arr= new char[4][];
		
		// 0행에 2열짜리
		// 1행에 3열짜리
		// 2행에 6열짜리
		// 3행에 4열짜리 를 만들고 싶을 때
		
		arr[0] = new char[2]; // a, b
		arr[1] = new char[3]; // c. d. e
		arr[2] = new char[6]; // f, g, h, i, j, k
		arr[3] = new char[4]; // l, m, n ,o
		
		char ch = 'a';
		
		for(int row = 0; row < arr.length; row++) {
			for(int col = 0; col <arr[row].length; col++) { // 반드시 arr[row].length로 해야 열마다 행의 길이가 다른 데에 따른 문제를 해결
				arr[row][col] = ch++;	
			}
		}
		
		System.out.println(Arrays.deepToString(arr));
		
		
	}
	
}