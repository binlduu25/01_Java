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
		System.out.println(Arrays.toString(arr));
		System.out.printf("검색할 문자 : ");
		char input = sc.next().charAt(0);
		int count = 0;
		System.out.printf("%s에 %s가(이) 존재하는 위치(인덱스) : ",text,input);
		for(int i = 0; i < text.length(); i++) {
			if (input == arr[i]) {
				count++;
				System.out.printf("%d ",i);
				}
		}
		System.out.printf("\n%s의 개수 : %d",input,count);
	}
	public void arrayPractice06() {
		
		// 사용자가 배열의 길이를 직접 입력하여 그 값만큼 정수형 배열을 선언 및 할당하고
		// 배열의 크기만큼 사용자가 직접 값을 입력하여 각각의 인덱스에 값을 초기화하세요.
		// 그리고 배열 전체값을 나열하고 각 인덱스에 저장된 값들의 합을출력하세요.
		//  [실행화면]
		//		 정수: 5
		//		 배열0번째인덱스에넣을값: 4
		//		 배열1번째인덱스에넣을값: -4
		//		 배열2번째인덱스에넣을값: 3
		//		 배열3번째인덱스에넣을값: -3
		//		 배열4번째인덱스에넣을값: 2
		//		  4 -4 3 -3 2 
		//		 총합: 2
		
		System.out.printf("정수 입력 : ");
		int input = sc.nextInt();
		int [] arr = new int [input];
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			System.out.printf("배열 %d번째 인덱스에 넣을 값 : ",i);
			int input2 = sc.nextInt();
			arr[i] = input2;
			sum += arr[i];
		}
		System.out.println();
		System.out.println(Arrays.toString(arr));
		System.out.printf("\n총합 : %d",sum);
	}
	public void arrayPractice07() {
		
		// 주민등록번호를 입력받아 성별을 나타내는 숫자 이후부터 * 로 가리고 출력하세요.
		// [실행화면]
		// 주민등록번호 (-포함) : 123456-1234567
		// 123456-1******
		
		System.out.printf("주민등록번호(-포함) 입력 : ");
		String input = sc.next();
		
		char [] arr = new char [14];
		for(int i = 0; i < 14; i ++) {
			arr[i] = input.charAt(i);
		}
		for(int j = 0; j < 8; j++) {
			System.out.printf("%s",arr[j]);
		}
		System.out.printf("******");
	}
	public void arrayPractice08() {
		
		/*
		배열의 중간까지는 1부터 1씩 증가하여 오름차순으로 값을 넣고
		중간 이후부터 끝까지는 1씩 감소하여 내림차순으로 값을 넣어 출력하세요.
		단, 입력한 정수가 홀수가 아니거나 3 미만일 경우 “다시 입력하세요”를 출력하고 다시 정수를 받도록 하세요.
		
		[실행화면]
		정수: 4
		다시입력하세요.
		정수: -6
		다시입력하세요.
		정수: 5
		1, 2, 3, 2, 1
		
		*/
		
		System.out.printf("정수를 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num%2 == 0 || num < 3) {
			System.out.println("다시 입력하세요.");
		}
		else {
			int mid = (num/2)+1;
			int [] arr = new int [num];
			arr[num/2] = mid;
			for (int i = 0; i < (arr.length)/2; i++) {
				arr[i] = i+1;
			}			
			for (int j = 0; j < (arr.length)/2; j++) {
				arr[arr.length-(j+1)] = j+1;
			}
			for(int k = 0; k < arr.length; k++) {
				if (k == arr.length - 1 ) {
					System.out.print(arr[k]);
				}	
				else {System.out.print(arr[k]+", ");	
				}
			}
		}
		
	}
	public void arrayPractice09() {
		
		// 10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고,
		// 1~10 사이의 난수를 발생시켜 배열에 초기화한 후 출력하세요.
		//  [실행화면]
		// 발생한 난수 : 9 7 6 2 5 10 7 2 9 6
		
		int [] arr = new int [10];
		int random = 0;
		for(int i = 0; i < arr.length; i++) {
			random = (int)(Math.random()*10)+1;
			arr[i] = random;
		}
		System.out.println(Arrays.toString(arr));
	}
	public void arrayPractice10() {
		
		// 10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고,
		// 1~10 사이의 난수를 발생시켜 배열에 초기화 후
		// 배열 전체값과 그 값 중에서 최대값과 최소값을 출력하세요.
		//  [실행화면]
		// 발생한난수: 5 3 2 7 4 8 6 10 9 10 
		// 최대값: 10
		// 최소값: 2
		
		int [] arr = new int [10];
		int random = 0;
	
		
		for( int i = 0; i < 10; i++) {
			random = (int)((Math.random()*10)+1);
			arr[i] = random;
		}
		System.out.print("발생한 난수 : ");
		for( int i = 0; i < 10; i++) {
			System.out.print(arr[i]+" ");
		}
		int max = arr[0];
		int min = arr[0];
		for( int i = 0; i < 10; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		for( int i = 0; i < 10; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.printf("\n최대값 : %d",max);
		System.out.printf("\n최소값 : %d",min);
		
	}
	public void arrayPractice11() {
		
		// 10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
		// 1~10 사이의 난수를 발생시켜 중복된 값이 없게 배열에 초기화한 후 출력하세요.
		// [실행화면]
		// 4 1 3 6 9 5 8 10 7 2
		
		int [] arr = new int [10];
		int random = 0;
		for ( int i = 0; i < arr.length; i++) {
			random = (int)((Math.random()*10)+1);
			arr[i] = random;
			for ( int j = 0; j < i; j++) {
				if ( arr[j] == random) {
					i--;
				}
			}
		}
		System.out.println("실행 화면");
		System.out.println(Arrays.toString(arr));
	}
}
	
	

