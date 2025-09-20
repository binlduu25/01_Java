package edu.kh.variable;

public class CastingExample1 {

	public static void main(String[] args) {
	
		// 형변환 연습 - 자동 형변환
		 // 값의 범위가 작은 것 -> 큰 것
		
		int Num1 = 10;
		double Num2 = 3.5;
		
		// 형변환 결과
		System.out.println("더하기-자동 형변환 결과 : "+(Num1+Num2));
		System.out.println("나누기-자동 형변환 결과 : "+(Num1/Num2));
		
		// int에서 long 변환
		
		int Num3 = 2_100_000_000; //긴 숫자 구분 시 ',(콤마)' 대신 '_(언더바)'사용 가능
		long Num4 = 10_000_000_000l;
		
		long result1 = Num3+Num4;
		
		// 형변환 결과
		System.out.println("long과 int 더하기 후 형변환 결과 : "+result1);
		
		// 특정 문자의 유니코드 값을 알고 싶을 때,
		char gag = '각';
		int gagInt = gag;
		System.out.println("'각'의 값 : "+gagInt);
		
		char dam = '담';
		int damInt = dam;
		System.out.println("'담'의 값 : "+damInt);
		
		System.out.println("각+담 = "+(gagInt+damInt));
	
		
	}

}
