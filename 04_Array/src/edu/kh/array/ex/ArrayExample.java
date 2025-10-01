package edu.kh.array.ex;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExample {

	Scanner sc = new Scanner(System.in);

	// 배열 : 같은 자료형의 변수를 하나의 묶음으로 만드는 것
	// 묶여진 변수들은 하나의 변수명으로 불려지고 각 방의 구분은 index를 이용
		// index 값은 무조건 0부터 시작하는 정수 값 (0, 1, 2, 3, ....)
	
	public void ArrayEx01() {
		
		// 변수 vs 배열
		
		
		
		
		
			
			// 1.1 변수 선언
			int num; 
			// "stack" 영역에 int 자료형을 저장할 수 있는 공간 4byte를 할당하고 그 공간에 num이라는 이름 부여
			
			// 1.2 변수 대입
			num = 10; 
			 // 생성된 num이라는 변수 공간에 10이라는 정수값 대입
			
			// 1.3 변수 사용
			System.out.println("num에 저장된 값 : "+ num);
		
			
			
			
			
			
			// 2. 배열 선언
			int[] arr;
			// stack 영역에 int[] 자료형 공간을 4bye 할당하고
			// 그 공간에 arr 이라는 이름을 부여
			// 해당 변수는 참조형으로 주소값만을 저장할 수 있다.**
		
			// 2.1 배열 할당
			arr = new int[3];
			// new : "new 연산자" 라고 하며, Heap 메모리 영역에 새로운 공간(배열, 객체)을 할당
			// int[3] : int 자료형 변수 3개를 하나의 묶음으로 나타내는 배열
			// new int[3] : heap 영역에 int형 변수 3칸짜리 int[]을 생성(할당)
			
			System.out.println(arr); // 주소값이 출력됨
			
			System.out.println(arr[0]);
			System.out.println(arr[1]);
			System.out.println(arr[2]);
			// 3개 모두 0이라고 출력되는 이유는 heap 영역에 생성된 공간은 절대 비어있을 수 없기 때문 (초기값 : 0)
			// JVM의 기본값
			
			
			
			
			// 2.2 배열 요소 값 대입
			
			arr[0] = 10;
			arr[1] = 40;
			arr[2] = 190;
			
			System.out.println(arr[0]);
			System.out.println(arr[1]);
			System.out.println(arr[2]);
			
			// 만약 3칸짜리 방에 4번째 방 값인 arr[3]번을 출력한다면
			// arr[3] = 200;
			// 출력 시 에러 나옴 (런타임 에러)
			// * 컴파일 에러 : 컴파일 시 나오는 에러
			
			
			
			
			// [10, 40, 190]을 한꺼번에 출력하고 싶을 때
			// 혹은 실제로 배열이 가진 모든 요소의 값을 알고 싶을 때
			// Arrays.toString(배열명); -> 기존의 메서드 활용, String 형태로 나온다.
			
			System.out.println(Arrays.toString(arr));
			 
		
		
		
	}
	public void ArrayEx02() {
		
		// 배열 선언 및 할당
		
		int[]arr = new int[4]; 
		// arr[0~3] 전부 JVM에 의해 0으로 초기화 되어 있는 상태
		
		arr[0] = 100;
		arr[1] = 200;
		arr[2] = 300;
		arr[3] = 400;
		
		// arr[4] = 500;
		// java.lang.ArrayIndexOutOfBoundsException : 배열의 인덱스 범위 초과
		// Index 4 out of bounds for length 4 : 길이 4칸짜리 배열에서 없는 인덱스 번호인 4에 접근
		
		// 배열과 for문
		// 배열의 길이 알아내는 메서드(배열명.length) 
	
		System.out.println("배열의 길이 : "+arr.length);
		
		for(int i =0; i < arr.length ; i++) {
			// i는 0부터 시작해 arr.length(arr 배열의 길이) 미만이 false가 될 때까지(3이 될 때까지) i++(1씩 더한다)
			// i는 배열 길이의 "<"(미만)까지 접근해야 한다. 배열의 인덱스 번호는 0부터 시작
			
			arr[i] = i*100; // for문 이용한 초기화 방법
			
			System.out.printf("arr[%d]에 저장된 값 : %d\n",i,arr[i]);
		
		}	
		System.out.println();
		
		// 선언과 동시에 초기화
		
		int[] arr2 = {1,2,3,4,5};
		// (풀이)
		// stack 영역에 int 4byte 할당
		// 해당 공간에 arr2라는 공간명 명명
		// heap 영역에 int 5칸 배열 생성
		// 0번부터 4번 인덱스 각 요소에 1~5까지 정수값 대입
		// int[] 주소값을 arr2의 참조변수가 참조함
		
		System.out.println(Arrays.toString(arr2));
	}
	public void ArrayEx03() {
		
		// 배열 예제 문제
		
		// 5명의 키(cm)를 입력 받고 평균 구하기
			// 1번 키 입력 : 
			// 2번 키 입력 : 
			// ...
			// 5번 키 입력 :
			// 평균 : 
		
		// 1. 변수 생성
		
		double[] height = new double[5];
		double sum = 0;
		
		// 2. 배열의 각 요소에 값을 대입하는 용도의 for 반복문 생성
			
			// 간단하지만 헷갈림 연습 필요
		 
		for (int i = 0; i < height.length; i++) {
		
		System.out.printf("%d번 키 : \n",i+1);
		height[i] = sc.nextDouble();	
		sum += height[i];

		
		}
	
		System.out.printf("\n평균 : %.2f cm",sum/height.length); // 평균 구하기
		
	}
	public void ArrayEx04() {
		
		// 입력 받은 인원 수 만큼의 점수를 입력받아 배열에 저장
		// 입력이 완료되면 점수의 합계와 평균 출력
		
		System.out.println("입력 받은 인원 수 : ");
		int num = sc.nextInt();
		
		int [] score = new int[num];
		int sum = 0 ;
	
		
		for(int i = 0 ; i < score.length ; i++) {
			System.out.printf("%d번의 점수 : ",i+1);
			score[i] = sc.nextInt(); // 배열 인덱스에 값을 입력하고 다시 다음을 반복  
			sum += score[i];
			
		}
		double avg = sum/num;
		System.out.printf("합계 : %d, 평균 : %.2f",sum,avg);
		
	}
	public void ArrayEx05() {
		
		// 점심 메뉴 뽑기 프로그램
		
		String[]arr = {"라면", "김밥", "샌드위치", "국밥", "삼겹살", "짬뽕"}; // 인덱스 0 ~ 5
		System.out.printf("오늘 점심 메뉴 : " + arr[ (int)(Math.random() * 6)]);
		
	}
	public void ArrayEx06() {
		
		// 배열을 이용한 검색
		
		// 입력받은 정수가 배열에 있는지 없는지 확인
		// 만약 있다면 몇번 인덱스에 존재하는지 출력
		
		// ex)
		// 정수 입력 : 500
		// 1번 인덱스에 존재 or 존재하지 않음
		
		int arr[] = {100, 200, 300, 400, 500, 600, 700, 800, 900, 1000};
		
		System.out.printf("정수 입력 : ");
		int input = sc.nextInt();
		
		// 찾음 여부를 표시하기 위한 변수
		boolean flag = false; // 검사 전에는 못 찾았다고 가정
		
		for ( int i = 0 ; i < arr.length ; i++) {
			if(input == arr[i]) {
				System.out.println(i+"번째 인덱스에 존재");
				flag = true; //(일치하는 값 찾았으므로 표시)
			}
		}
		
		if (!flag) {System.out.println("존재하지 않음");
		}
		
// 		내가 한 거
//		switch(input) {
//		case 100 : System.out.println("0번 인덱스에 존재"); break;
//		case 200 : System.out.println("1번 인덱스에 존재"); break;
//		case 300 : System.out.println("2번 인덱스에 존재"); break;
//		case 400 : System.out.println("3번 인덱스에 존재"); break;
//		case 500 : System.out.println("4번 인덱스에 존재"); break;
//		case 600 : System.out.println("5번 인덱스에 존재"); break;
//		case 700 : System.out.println("6번 인덱스에 존재"); break;
//		case 800 : System.out.println("7번 인덱스에 존재"); break;
//		case 900 : System.out.println("8번 인덱스에 존재"); break;
//		case 1000 : System.out.println("9번 인덱스에 존재"); break;
//		default : System.out.println("존재하지 않음");
//		}
		
	}
	public void ArrayEx07() {
		
		// 입력받은 값과 일치하는 값이 있으면 인덱스 번호 출력
		// 없으면 '존재하지 않음' 출력
		
		String[]arr = {"사과","딸기","멜론","키위","망고","귤"};
		
		System.out.printf("과일 입력 : ");
		String input = sc.next();
		
		boolean flag = false;
		
		for (int i = 0 ; i < arr.length ; i++) {
			if(input.equals(arr[i])) {
				System.out.println(i+"번째 인덱스에 위치");
				flag = true;
			}
		}
		if(!flag) {
			System.out.println("존재하지 않음");
		}
		
		
	}
	public void ArrayEx08() { // 복습 필요, 생소함
		// ex)
				// 문자열 입력 : hello
				// [h, e, l, l, o]
				// 검색할 문자 입력 : l
				// 2개 있음 / 존재하지 않음
				
				// 1. 문자열을 입력받아 한 글자씩 잘라내어 
				// 		char 배열에 순서대로 저장
				// 2. 문자 하나를 입력받아 일치하는 문자가 char 배열에
				// 		몇 개 존재하는지 확인
				// 3. 단, 일치하는 문자가 없을 경우 "존재하지 않습니다" 출력
				
				// 사용해야하는 기술, 기능
				// 1) 배열 검색
				// 2) 문자열의 길이 구하기 : String.length()
				//   ex)  "hello".length() -> 5 반환
				// 3) String.charAt(index) : 문자열에서 특정 index 에
				//    위치한 문자 하나를 얻어옴.
				//   ex) "hello".charAt(1) -> 'e' 반환
				//		  01234
				// 4) count (숫자세기)
				
				System.out.print("문자열 입력 : ");
				String input = sc.nextLine(); 
				// hello world -> [h,e,l,l,o, ,w,o,r,l,d]
				
				// 1. 입력받은 문자열을 한글자씩 잘라내어
				//   char 배열에 순서대로 저장
				// 1-1) 입력받은 문자열 길이만큼의 
				//      char 배열 선언 및 할당하기
				char[] arr = new char[input.length()]; // char 배열 선언 및 할당
				
				// 1-2) 입력한 문자열을 한글자씩 잘라내어 char 배열의
				//   모든 요소에 순서대로 값 대입하기
				for(int i = 0; i < arr.length; i++) {
					arr[i] = input.charAt(i); // input 값(예를들면 hello) 각 자릿수에 위치하는 문자를 배열(arr)에 삽입
											  // 즉, hello 는 h의 인덱스 값은 0이고 char [] arr 배열의 0번 인덱스에 h를 삽입
					// arr[0] = 'h';
					// arr[1] = 'e'; 
					// arr[2] = 'l';
					// arr[3] = 'l';
					// arr[4] = 'o';
				}
				
				System.out.println( Arrays.toString(arr) ); // 입력받은 문자열 나열하여 출력
				
				// 2. 문자 하나를 입력받아 일치하는 
				// 문자가 char 배열에 몇 개 존재하는지 확인
				System.out.print("검색할 문자 입력 : ");
				char ch = sc.next().charAt(0); // 문자 입력은 1글자만 받을 예정이므로 "sc.next()" -> 입력한 값의 -> .charAt(0) 0번째 인덱스에 위치한 값과 같다.
				
				// String.charAt(index) -> 문자형 ''
				// "e".charAt(0); -> 'e'
				// -> Scanner에는 char 형태를 입력받을 수 있는 
				//    메서드가 없다 
				// -> String으로 우선 입력받고, 입력받은 String에서
				// charAt(index) 메서드를 이용하여 해당 index 번째 존재하는
				// 문자 하나를 떼어 char 자료형 형태로 반환함.
				
				// arr이라는 배열에 입력한 문자가 몇개 존재하는지 
				// 0번 index부터 마지막 index까지 순회하며 검색하기 위함
				// [h,e,l,l,o]
				int count = 0; // 내가 찾는 글자 개수를 세기 위한 변수
				
				for(int i = 0; i < arr.length; i++) {
					if(ch == arr[i]) { // char 배열이므로 equals가 필요 없다>???
						count++;
						// arr[i] 값과 검색할 문자 ch가 같은 경우
						// 카운트를 늘려라!
					}
				}
				
				// 결과 출력
				if( count > 0 ) { // 일치하는 값 있을때
					System.out.println(count + "개 있음");
					
				} else { // 일치하는 문자가 없는 경우
					// 3. 단, 일치하는 문자 없을 경우 "존재하지 않음" 출력
					System.out.println("존재하지 않음");
				}	
	}
	public void ArrayEx09() { // 배열 복사_얕은 복사(Shallow Copy)
		
		// 얕은 복사란? 
		// 주소를 복사하여 서로 다른 두 참조변수가 하나의 배열(또는 객체)을 참조하는 상태를 만드는 복사법
		
		int [] arr = {1,2,3,4,5};
		int [] copyArr = arr;
		
		// 주소 확인
		System.out.println("arr 주소 : "+arr);
		System.out.println("copyArr 주소 : "+copyArr);
		
		// 변경 전
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(copyArr));
		
		// 변경 후
		copyArr[2] = 999;
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(copyArr));
		
		
	}
	public void ArrayEx10() { // 배열 복사_깊은 복사(Deep Copy)
		
		// 같은 자료형의 새로운 배열을 만들어서 기존 배열의 데이터를 모두 복사
		
		int [] arr = {1,2,3,4,5}; // 원본 배열
		
		// 방법 1
		int [] copyArr1 = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			copyArr1[i] = arr[i];
		}
		
			// 주소 확인
			System.out.println("원본 : "+arr);
			System.out.println("방법 1 : "+copyArr1);
			
			// 변경 전
			System.out.println(Arrays.toString(arr));
			System.out.println(Arrays.toString(copyArr1));
		
			// 변경 후
			copyArr1[2] = 200;
			System.out.println(Arrays.toString(arr));
			System.out.println(Arrays.toString(copyArr1));
			

		// 방법 2
			System.out.println();	
		//	- System.arraycopy(원본배열명, 원본 복사 시작 인덱스, 복사배열명, 복사배열의 삽입 시작 인덱스, 복사 길이);
		int [] copyArr2 = new int[arr.length]; // 길이가 같은 배열이 생성되어 있어야 함
		System.arraycopy(arr, 0, copyArr2, 0, arr.length); 
			
			// 주소 확인
			System.out.println("원본 : "+arr);
			System.out.println("방법 2 : "+copyArr2);
			
			// 변경 전
			System.out.println(Arrays.toString(arr));
			System.out.println(Arrays.toString(copyArr2));
		
			// 변경 후
			copyArr2[2] = 4200;
			System.out.println(Arrays.toString(arr));
			System.out.println(Arrays.toString(copyArr2));
			
			
		// 방법 3
			System.out.println();
		// 복사할 참조변수 = arrays.copyOf(원본배열명, 복사할 길이)
		int [] copyArr3 = Arrays.copyOf(arr, arr.length);
			
			// 주소 확인
			System.out.println("원본 : "+arr);
			System.out.println("방법 3 : "+copyArr3);
			
			// 변경 전
			System.out.println(Arrays.toString(arr));
			System.out.println(Arrays.toString(copyArr3));
		
			// 변경 후
			copyArr3[2] = 6540;
			System.out.println(Arrays.toString(arr));
			System.out.println(Arrays.toString(copyArr3));
		
	}
	public void CreatLotto() { // 로또 번호 생성기
		
		// 로또 번호 생성기
		
		// 배열을 이용한 중복데이터 제거 + 정렬
		// 1. 1 ~ 45 사이 중복되지 않는 난수 6개 생성
		// 2. 생성된 난수를 오름차순으로 정렬
		
		int [] arraylotto = new int[6]; // 1) 정수 6개 저장할 배열 선언 및 할당
		for (int i = 0; i < arraylotto.length; i++) { // 2) 생성된 배열을 처음부터 끝까지 순차접근하는 for문 생성
			int random = ((int)(Math.random()*45)+1); // 3) 1 ~ 45 사이 난수 생성
			arraylotto[i] = random; // 4) 랜덤 생성된 난수를 배열에 배치, 하지만 중복값이 있을 수 있다.
									// ex) lotto[0] 에 8이 있다고 가정 [8,0,0,0,0,0] > i = 0이다. (빈칸이 0인 이유는 배열의 기본값이기 때문)
										// 밑의 for문에서 x=0이므로, for문 자체를 수행하지 않는다.
										// 다시 위의 for문으로 올라가 i에 1을 더하고 난수 재생성, ex. 10 뽑았을 때, [8,10,0,0,0,0]
										// i = 1이고 밑의 for문에서 x=0이므로 수행, 이때, 현 단계에서의 random 난수는 arraylotto[0]의 8과 다르다
										// 이때, if문의 조건식이 false이므로 수행되지 않는다. 
										// 다시 처음으로 올라가서 위의 for문을 수행했을 때, i=2이고, 8을 뽑았다고 가정. 이때, 배열은 [8,10,8,0,0,0]
										// 밑의 for문을 수행하면 x=0부터 다시 처음부터 수행하게 되고 현 단계에서의 random 난수 8과 x=0일 때의 arraylotto[0]의 8과 같다.
										// 이때, i에서 -1을 해주고 break를 걸어 위의 for문으로 돌아가게 만든 뒤, 세번째 자리수를 위한 random난수를 새로 뽑는다.
			
			for (int x = 0; x < i; x++) { // 5) 중복 검사 위함 for문 작성
				if(random == arraylotto[x]) { // 6) 현재 생성된 난수와 같은 수가 이전 요소에 있는지 검사
					i--; // 7) 중복값 찾았을 때 다시 검사 위함
					break;
				}
				
			}
		}
		// 7) 정렬
		// 선택 정렬, 삽입 정렬, 버블정렬, 퀵 정렬 등등이 있다.
		// 추후 정렬에 대한 코딩을 직접할 수 있어야 함
		// 현 단계에서는 java 내 만들어진 기능을 이용한다.
		//  -> Arrays.sort(배열명) : 배열 내 요소값들이 오름차순 정렬됨
		
		Arrays.sort(arraylotto);
		
		System.out.println(Arrays.toString(arraylotto));
		
	}
	
}
