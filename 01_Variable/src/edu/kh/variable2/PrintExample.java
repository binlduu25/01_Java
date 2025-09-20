package edu.kh.variable2;

public class PrintExample {

	public static void main(String[] args) {

		// System.out.println(); 한 줄 출력용 메서드(출력 후 자동 줄바꿈)
		System.out.println("test 1");
		
		// System.out.print(); 단순 출력용 메서드, 줄바꿈 안 해줌
		System.out.print("test 2");
		System.out.print("test 3");
		
		// System.out.println(); 비어 있는 상태로 입력하게 되면 줄만 바꿈
		
		System.out.println();
		
		System.out.println("test333");
		
		// 10 + 5 = 15   	<- 해당 수식을 그대로 출력하고 싶을 때,
		
		int iNum1 = 10;
		int iNum2 = 5;
		int iNum3 = 2;
				
		System.out.println(iNum1+" + "+iNum2+" = "+(iNum1+iNum2));
		// 위의 방법은 너무 복잡하기에,
		
		// System.out.printf() 를 이용한다.
		// 다만, System.out.printf() 는 줄바꿈을 지원하지 않는다.
 
		System.out.printf("%d + %d = %d", iNum1, iNum2, iNum1 + iNum2);
		// System.out.printf("패턴", 패턴자리에 각각 들어갈 값/변수 나열) 
		// %d에 정수형이 아닌 다른 값을 입력 시 에러가 뜨진 않지만 출력 값이 오류
		
		/*
		 * %d : 정수형
		 * %o : 8진수
		 * %x : 16진수
		 * %c : 문자
		 * %s : 문자열
		 * %f : 실수(소수점 아래 6자리)
		 * %e : 지수형태 표현
		 * %g : 대입 값 그대로
		 * %A : 16진수 실수
		 * %b : 논리형
		 */
		System.out.println();
		System.out.printf("%d + %d * %d / %d = %d\n",iNum1,iNum1,iNum2,iNum3,iNum1+iNum1*iNum2/iNum3);
		
		System.out.println("--------------구분선--------------");

			
				// System.out.println() : 한 줄 출력용 메서드(출력 후 줄바꿈 수행)
				System.out.println("테스트1");
				System.out.println("테스트2");
				
				// System.out.print() : 단순 출력용 메서드(출력 후 줄바꿈 X)
				System.out.print("테스트3");
				System.out.println(); // 내용 없는 println() : 단순 줄바꿈
				System.out.print("테스트4");
				
				System.out.println();
				
				// 10 + 5 = 15
				int iNum5 = 101;
				int iNum6 = 51;
				System.out.println(iNum5 + " + " + iNum6 + " = " + (iNum5 + iNum6));
				
				System.out.printf("%d + %d = %d\n", iNum5 , iNum6, iNum5 + iNum6);
				// System.out.printf("패턴", 패턴자리에 각각 들어갈 값/변수 나열..)
				/*
				 * %d : 정수형 
				 * %f : 실수형
				 * %c : 문자, %s : 문자열
				 * %b : 논리형
				 * 
				 * */
				
				// 이스케이프 문자(escape character) 
				// : 특별한 의미를 갖도록 하는 용도로 사용.
				// \n : 줄바꿈

				// 10 + 10 * 5 / 2 = 35
				// 위에 만든 iNum1 과 iNum2 변수 사용하여 출력
				System.out.printf("%d + %d * %d / 2 = %d\n", 
								iNum1, iNum1, iNum2, iNum1 + iNum1 * iNum2 / 2 );
				
				
				// 공간확보 패턴연습
				int iNum10 = 3;
				System.out.printf("%d\n", iNum10);
				System.out.printf("%5d\n", iNum10); // 5칸 공간 확보 후 오른쪽 정렬
				System.out.printf("%-5d\n", iNum10); // 5칸 공간 확보 후 왼쪽 정렬
				
				// 소수점 자리 제어 (반올림 처리)
				System.out.printf("%f\n", 10 / 4.0); // 2.500000
				System.out.printf("%.2f\n", 10 / 4.0); // 2.50 (소수점 둘째자리까지)
				
				//     \ 
				System.out.println("\\");
				
				//    \o/
				System.out.println("\\o/");
				
				// \t : tab (한공간씩 표현 X, 한번에 공간차지)
				System.out.println("a\tb\tc\td");
				
				// 유니코드 이스케이프
				System.out.println("\u0041");
				// 65를 16진수로 표현
				// 65 나누기 16 몫 4 나머지 1

			}


		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		// \t : tab (한 공간씩 표현 x, 한번에 공간 차지)
		
		
		

		
	}

