package practice00;

public class PracticeVariabe3 {
	public static void main(String[] args) {
		
		// 문제1
		int age = 35;
		System.out.println("나는 "+age+"살입니다.");
		
		// 문제2
		int score = 90;
		score = score + 10;
		// int score += 10;
		System.out.println("최종점수: "+score);
		
		// 문제3
		int a = 10;
		double b = a;
		System.out.println(b);
	
		// 문제4
		double pi = 3.14159;
		System.out.printf("pi = %.2f\n", pi);
		System.out.printf("pi = %.4f\n", pi);
		
		// 문제5
		char ch = 'A';
		int chA = ch;
		System.out.println("문자 : "+ch+", "+"코드값 : "+chA);
		// 오답 : System.out.println("문자 : %c, 코드값 : %d\n", ch,chA);
		
		// 문제6
		final int PRICE = 5000; //상수 대문자로
		int count = 3;
		
		System.out.println("물건 가격 : "+PRICE+"원, 개수 : "+count+"개, 총액 : "+(PRICE*count)+"원");
		
		//문제7
		
		int kScore = 95, eScore = 87, mScore =90;
		int sum = kScore+eScore+mScore;
		double avg = (double)sum/3; // 또는 sum/3.0
		
		System.out.printf("국어: %d, 영어: %d, 수학: %d\n총점: %d, 평균: %.2f\n",kScore,eScore,mScore,sum,avg);

		System.out.printf("\n");
		
		// 응용문제1
		
		String name1 = "영숙";
		int age1 = 28;
		double height1 = 165.7;
		
		System.out.printf("출연자 이름: %s\n나이: %d세\n키: %.1fcm\n",name1,age1,height1);
		
		System.out.printf("\n");
		
		double doubleAge = age1;
		
		System.out.printf("자동 형변환 나이: %.1f\n", doubleAge);
		
		
		
	}
}
