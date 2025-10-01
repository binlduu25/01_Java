package edu.kh.exception.test;

public class ExceptionTest {

	public static void main(String[] args) {
		
		// 컴파일 에러 : 개발자의 코딩 오류로 발생 
		 // ex) int a = 99.9; 
		
		// 런타임 에러 : 프로그램 수행 중 발생 에러
		 // 주로 if 문으로 처리 가능
		 // ex3) java.lang.ArrayIndexOutOfBoundsException : Index 3 out of bounds for lengt
		 // 배열 범위를 초과해서 값을 대입했을 때 발생
		 
		// -> 해결법
		int [] arr = new int[3];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		
		if ( 3>=arr.length) {
			System.out.println("배열범위초과");
		}else {
			arr[3]=40;
			System.out.println("배열 범위 안정적");
		}
		
	}
	
	
}
