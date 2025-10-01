package edu.kh.variable; 

public class VariableExample2 {
public static void main(String[] args) {
	
	
	// 변수 값 대입 : 변수에 값을 집어 넣는 것. (== 초기화)
	
	
	//1.boolean
	boolean booleanDataTrue; // -> 변수의 선언
	boolean booleanDataFalse; 
	// 메모리에 논리값(t/f)을 저장할 공간을 1byte 할당하고
	// 할당된 공간의 이름을 booleanDataTrue 와 booleanDataFalse라고 정하겠다.
	
	// 값을 변수에 최초로 대입 : 초기화
	booleanDataTrue = true;
	booleanDataFalse = false;

	// 선언과 동시에 대입
	boolean abcabc = true;

	// 출력
	System.out.println("booleanDataTrue : "+booleanDataTrue);
	System.out.println("booleanDataFalse : "+booleanDataFalse);
	System.out.println("abcabc : "+abcabc);	
	
	
	// 2.byte
	byte byteData; // -> 변수의 선언
 	// 메모리에 정수값을 저장할 공간을 1byte 할당하고
	// 할당된 공간의 이름을 byteData라고 정하겠다.
	
	// 선언과 동시에 대입
	byte byteNumber1 = 127; // byte 값의 범위 : -128 ~ 127
	byte byteNumber2 = -128;
	
	System.out.println(byteNumber1);
	System.out.println(byteNumber2);
	
	// 3.short
	short shortNumber = 32767; // short 값의 범위 : -32768 ~ 32767)
	
	// 4.int
	int intNumber = 2147483647; 
	
	// 5.long
	long longNumber = 100000000000000l; //long 뒤에는 l또는 l을 붙여줘야 함
	 // 해당 값은 int의 범위 벗어났다고 에러가 뜸
	 // 리터럴 값 자체를 int로 인식하고 있다.
	 // int형 리터럴 표기법으로 해당 값을 나타냈기 때문
	 // 뒤에 l을 붙여줌으로써 long이 자료형인 것을 나타내줌.
	
	// 6.float
		// 소수점 아래 8번째 자리까지 연산 후 반올림하지만 정밀도가 낮다
	float floatNumber = 1.2345f;
	// f를 붙여주지 않으면 double 자료형으로 인식하기 때문에 변수 타입인 float과 일치하지 않아 type mismatch 에러 발생
	System.out.println(floatNumber);
	
	//7.double
		// 소수점 아래 16번째 자리까지 연산 후 반올림하지만 정밀도가 높다
	double doubleNumber = 8.549421;
	// 리터럴 표기법인 d를 써도 되고 안 써도 무방하다.
	System.out.println(doubleNumber);
	
	//8.char
	// 문자형(char) 리터럴 표기법 : ''(홑따옴표)
	
	char char1 = 'A';
	char char2 = 66;
	
	System.out.println(char1);
	System.out.println(char2);
	
	//유니코드 문자체계상 66 = B 이기 때문에 char 자료형에 숫자가 대입될 경우 해당 숫자에 맞는 문자 출력
	
	char char3 = 28564;
	char char4 = 53358;
	
	System.out.println(char3);
	System.out.println(char4);
	
	
	
	// 상수(final)
	
	int EXNUM1 = 100;
	// exNum1은 언제든 바꿀 수 있다.
	// 상수명은 대문자로, 구분은 '_' 사용
	// 상수를 사용하는 경우 
		// 1) 변하면 안 되는 고정값을 저장할 때
		// 2) 특정한 값에 의미를 부여하는 경우
		
	EXNUM1 = 20; //100에서 20으로 바꾸는 것 가능
	
	
	final int EXNUM2 = 50;
	// 상수로 선언
	//상수로 선언했기 때문에 바꿀 수 없다.
	
	
	}
}
