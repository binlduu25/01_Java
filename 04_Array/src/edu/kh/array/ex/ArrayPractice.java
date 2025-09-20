package edu.kh.array.ex;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {

	Scanner sc = new Scanner(System.in);
		
	public void arrayPractice01() {
			
			// 길이가 9인 배열을 선언 및 할당하고, 1부터 9까지의 값을 반복문을 이용하여
			// 순서대로 배열의 각 인덱스 요소에 대입하고 출력한 후
			// 짝수번째 인덱스 값의 합을 출력하세요. (0번째 인덱스는 짝수로 취급)
			//  [실행화면]
			//  1 2 3 4 5 6 7 8 9
			//  짝수번째인덱스합: 25
			
			System.out.printf("정수 입력 : ");
			int num = sc.nextInt();
			
			int [] array = new int [num];
				for (int i = 0; i < array.length; i++) {
				array[i] = i+1;
				}
			
				System.out.println("배열 결과");
			
				System.out.println(Arrays.toString(array));
			
			int sum = 0;
			
			for (int j = 0; j < array.length; j++){
				if(j%2 == 0) { 
					sum += array[j];
				}
			}
			
			System.out.println("합 결과 : " + sum);
			
	}
	public void arrayPractice02() {
		
		// 길이가 9인 배열을 선언 및 할당하고, 9부터 1까지의 값을 반복문을 이용하여
		// 순서대로 배열의 각 인덱스 요소에 대입하고 출력한 후
		// 홀수번째 인덱스 값의 합을 출력하세요. (0번째 인덱스는 짝수로 취급)
		//  [실행화면]
		// 9 8 7 6 5 4 3 2 1 
		// 홀수번째 인덱스 합: 20

		System.out.printf("정수 입력 : ");
		int num = sc.nextInt();
		
		int [] array = new int [num];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = num - i;
		}
		
		System.out.println("배열 결과");
		System.out.println(Arrays.toString(array));
		
		int sum = 0;
		for (int j = 0; j < array.length; j++) {
			if(j%2 == 1) {
				sum += array[j];
			}
		}
		System.out.println("합 결과 : " + sum);
		
	}
	public void arrayPractice04() {
		
		// 정수 5개를 입력 받아 배열을 초기화하고
		// 검색할 정수를 하나 입력 받아 배열에서 같은 수가 있는 인덱스를 찾아 출력.
		// 배열에 같은 수가 없을 경우 “일치하는 값이 존재하지 않습니다“ 출력
		
			// [실행화면1]
			//	입력0: 5
			//	입력1 : 8
			//	입력2 : 9
			//	입력3 : 10
			//	입력4 : 4
			//	검색할값: 8
			//	인덱스: 1
	
		System.out.printf("입력 0 : ");
		int n0 = sc.nextInt();
		System.out.printf("입력 1 : ");
		int n1 = sc.nextInt();
		System.out.printf("입력 2 : ");
		int n2 = sc.nextInt();
		System.out.printf("입력 3 : ");
		int n3 = sc.nextInt();
		System.out.printf("입력 4 : ");
		int n4 = sc.nextInt();
		
		int [] array = {n0,n1,n2,n3,n4};
		
		System.out.println("검색할 값 : ");
		int search = sc.nextInt();
		boolean flag = false;
		
		for (int i = 0; i < array.length; i++) {
			if(search == array[i]) {
				System.out.printf("인덱스 : %d\n",i);
				flag = true;
			}
		}
		if(!flag) {
			System.out.println("일치하는 값이 없습니다.");
		}
		
			
	}
	public void arrayPractice05() {
		
		// 문자열을 입력 받아 문자 하나하나를 배열에 넣고 검색할 문자가 문자열에 몇 개 들어가 있는지
		// 개수와 몇번째 인덱스에 위치하는지 인덱스를 출력하세요.
		// [실행화면]
		// 문자열: application
		// 문자: i
		// application에 i가 존재하는 위치(인덱스) : 4 8 
		// i개수: 2
	
		System.out.printf("문자열 입력 : ");
		String text = sc.nextLine();
		
		char [] arr = new char [text.length()];
		
		for(int i = 0; i < text.length(); i++) {
			arr[i] = text.charAt(i);
		}
		
	
	
	
	}
	
	
}
