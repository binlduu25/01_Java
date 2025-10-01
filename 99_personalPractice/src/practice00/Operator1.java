package practice00;


public class Operator1 {
	public static void main(String[] args) {
	
		// 연산자
		
		
		// 1. 논리 부정 연산자 !
		
		boolean ex1 = true;
		boolean ex2 = !ex1;
		System.out.println(ex2);
		
		// 2. 증감 연산자 '1'을 더하거나 뺀다
		
			// 2.1. 전위 연산
		
			int a1 = 100;
			int b1 = ++a1;
			
			// b1이 이미 a1에서 1을 더한 값이 됨

			System.out.println(a1+", "+b1);
			
			// 2.2. 후위 연산
		
			int a2 = 100;
			int b2 = a2++;

			// b2는 아직 a1에서 1을 더하지 않았음
			
			System.out.println(a2+", "+b2);
			
			// 2.3. 연습
			
			int a = 3;
			int b = 5;
			int c = a++ + --b;

			// 순서
			// 1. b 1 감소(전위)
			// 2. a + b = 7
			// 3. a 1 증가(후위)
			// 4. 출력 시 4, 4, 7
			
			System.out.printf("%d , %d , %d",a,b,c);

			
		
	}
}
