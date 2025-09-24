package edu.kh.oop.cls.model.vo;
//=== 순서 3 ===

public class Student { // 일반(public) 클래스로 선언됨
//접근제한자 [예약어] class 클래스명{}
	
	// 1. 필드(Field)
	 // 1-1. Field 접근제한자 예제
	
		public int v1 = 10;  // 전체에서 접근 가능
		protected int v2 = 20; // 후손 클래스까지 가능
		int v3 = 30; // (default), 같은 패키지 내 접근 가능
		private int v4 = 40; // 같은 클래스 내 접근 가능 // 현재 v4에서만 밑줄(경고)이 뜨는 이유는 getter / setter 가 필요하기 때문이다.
	
		public void ex1() { // 1) 필드 접근제한자 확인용
		// v1 ~ v4 는 전부 Student 클래스 내부에서 생성된 변수이기 때문에
		// v1 ~ v4 까지 전부 직접 접근 가능
		// System.out.println(v1); // public 이라 가능
		// System.out.println(v2); // protected 가능
		// System.out.println(v3); // (default) 다른 패키지는 불가, 현 클래스에서 가능
		// System.out.println(v4); // 해당 클래스 내부가 아닌 다른 클래스 불가
		}

	 // 1-2. 필드 예약어 - static
	  // 모든 객체가 공유하는 변수가 필요할 때 사용. 즉, 같은 타입의 여러 객체가 공유할 목적의 필드에 사용.
		public static String schoolName = "KH정보교육원"; 
		// ↑ 테스트용이기 때문에 public 으로 선언, private 도 가능하다.		
		// "기울임체 변수"는 전부 static 이다.
		// ex) Math.random()
		
		public void ex2() { // 2) static 필드 확인 예제
			
			// 학생 객체 2개 생성 (객체를 2개 만든다 -> new 연산자 2개 쓴다)
			Student std1 = new Student();
			Student std2 = new Student();
			System.out.println(std1.schoolName); 
			System.out.println(std2.schoolName); // std1, std2 모두 오류 없이 기능하기는 함.
			
			// schoolName에 노란 밑줄 뜨는 이유(경고)?
			// static 이 붙은 변수, 필드, 메소드는 
			// *** static이 붙은 변수(필드)/메서드는 
			// '클래스명.변수명'으로 사용함 ***
			
			// ↓ 제대로 된 작성
			
			System.out.println(Student.schoolName);
			
			// 결론
			// *** static 의 가장 큰 특징 : "객체를 만들지 않아도" 클래스 이름으로 값에 바로 접근 가능
			// ex)
			// Math.random();
			// Arrays.toString(null);
			
			// final 예약어
			// private final int TEMP2 = 100;
			// final은 상수이기 때문에 더 이상 값을 고칠 수 없다. (setter 불가능)
		}
	
	 // 1-3. 필드 예약어 - final
		private final int TEMP1 = 100;
		// 특이점 : final 은 getter 만 생성할 수 있다. setter 로 값을 재대입할 수 없기 때문.
					
		
		
	
	
}
