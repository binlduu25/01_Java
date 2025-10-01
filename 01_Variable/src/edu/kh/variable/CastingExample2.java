package edu.kh.variable;

public class CastingExample2 {

	public static void main(String[] args) {
		
		// 형변환 연습 - 강제 형변환
		 // 값의 범위가 큰 것 -> 작은 것
		 // 데이터 손실이 발생할 수 있다. 
		
		// double -> int로 변환
		// 강제 형변환 시 변환하고자 하는 자료형에 괄호를 붙인다. ex. (int), (short) 등등
		
		double temp1 = 5.234924;
		int num1 = (int)temp1;
		
		System.out.println(temp1);
		System.out.println(num1);

		// int -> byte로 변환

		int iNum = 290;
		byte bNum = (byte)iNum;
		
		System.out.println(iNum);
		System.out.println(bNum);
		
		// byte 값이 34가 나오는 이유
		 // 같은 정수형끼리 변환 시에도 값의 범위 차이로 인해 데이터 손실 발생
		
		// int -> char로 변화
		char ch = 'Z';
		System.out.println((int)ch);
				
		// char -> int로 변환
		int iNum5 = 28334;
		System.out.println((char)iNum5);
		
		
		
		// 오버플로우
		 // 오버플로우 현상은 컴퓨터가 미리 예측 못하니, 개발자가 예상하고 있어야 한다.
		
		int iNum10 = 2147483647; // int범위의 최대값
		int result2 = iNum10 + 1; // int범위 최대값에 1을 더하면
		
		System.out.println(result2); // int범위 최소값인 -2147483648이 도출
		
			
	}

}
