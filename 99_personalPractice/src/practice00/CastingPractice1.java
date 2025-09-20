package practice00;

public class CastingPractice1 {
	public static void main(String[] args) {
		
		// 변수 연습문제 25.09.11.
		
	
		int iNum1 = 10;
		int iNum2 = 4;
		
		float fNum = 3.0f;
		
		double dNum = 2.5;
		
		char ch = 'A';
		
		System.out.println("1번 : " + (iNum1/iNum2)); // 2
		System.out.println((iNum1/iNum2)==2);
		
		System.out.println("2번 : " + ((int)dNum)); // 2
		System.out.println((int)dNum==2);
		
		System.out.println("3번 : " + (dNum*iNum2)); // 10.0
		System.out.println((dNum*iNum2)==10.0); // 10.0
		
		System.out.println("4번 : " + ((double)iNum1)); // 10.0
		System.out.println((double)iNum1==10.0); // 10.0
		
		System.out.println("5번 : " + ((double)iNum1/iNum2)); // 2.5
		System.out.println(((double)iNum1/iNum2)==2.5); // 2.5
		
		System.out.println("6번 : " + (dNum)); // 2.5
		System.out.println((dNum)==2.5); // 2.5

		System.out.println("7번 : " + ((int)fNum)); // 3
		System.out.println((int)fNum==3); // 3
		
		System.out.println("8번 : " + ((int)(iNum1/fNum))); // 3
		System.out.println((int)(iNum1/fNum)==3); // 3

		System.out.println("9번 : " + (iNum1/fNum)); // 3.3333333
		System.out.println((iNum1/fNum)==3.3333333); // 3.3333333
		
		System.out.println("10번 : " + ((double)iNum1/fNum)); // 3.3333333333333335
		System.out.println(((double)iNum1/fNum)==3.3333333333333335); // 3.3333333333333335

		System.out.println("11번 : " + "'"+(ch)+"'"); // 'A'
		System.out.println("'"+(ch)+"'"=="'A'"); // 'A'
		
		System.out.println("12번 : " + ((int)ch)); // 65
		System.out.println((int)ch==65); // 65
		
		System.out.println("13번 : " + (iNum1+(int)ch));  // 75
		System.out.println((iNum1+(int)ch)==75);  // 75
		
		System.out.println("14번 : " + "'"+((char)(iNum1+(int)ch))+"'");  // 'K'
		System.out.println("'"+((char)(iNum1+(int)ch))+"'"=="'K'");  // 'K'
		

		
		
		
		
		
		
		
	}
	
}
