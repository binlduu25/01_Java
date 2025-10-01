package practice00;

public class PracticeVariable1 {
	public static void main(String[] args) {
	
		//1.boolean : true와 false 판단 위한 변수
		
		// 예시1
		boolean rain = true;
		boolean noRain = false;

		System.out.println(rain);
		System.out.println(noRain);

		//예시2
		int a = 35;
		int b = 30;
		
		boolean aBetweenBCompare1 = (a>b);
		System.out.println(aBetweenBCompare1);
		
		boolean aBetweenBCompare2 = (a<b);
		System.out.println(aBetweenBCompare2);
		
		//2.String : 참조형이며 앞글자는 반드시 대문자로 시작
		String iphone = "아이폰17";
		String megaCoffee = "메가커피";
		
		System.out.println(iphone);
		System.out.println(iphone + " & " +megaCoffee);
		
		//3.예제문제
		
		int example1 = 7/2; //결과값 3
		double example2 = 7/2; //결과값 3.0 
		//7과 2가 int 형태의 정수값이기 때문에 연산을 먼저 하고 정수형태로 나타내기 때문에 잘못된 결과값이 도출
		
		System.out.println(example1);
		System.out.println(example2);
		
		double example3 = (double) 7/2; //결과값 3.5
		System.out.println(example3);
		
		
	}
}
