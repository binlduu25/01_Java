package edu.kh.oop.abstraction.model.service;
//=== 순서 5 ===
//=== 접근제한제 test 위해 타 패키지 내에 작성됨 ===

import edu.kh.oop.cls.model.vo.Student;
import edu.kh.oop.cls.model.vo.User;

// import edu.kh.oop.cls.model.vo.Student;

// * ClsService 와 Student / TestVO 는 패키지가 다름

/* 클래스(class) 
	↓ 클래스 선언부
	[접근제한자] [예약어(생략 가능)] class 클래스명{}
	class 접근제한자 2개 : 
		1. public : 어디서든지 import 가능
		2. (default) : 외부 package 에서 사용 불가, 생략 가능
 	*/

public class ClsService /*extends Student*/ {
	
	/* 
	위 extends Student 는 Student class 의 필드 접근제한자 중 protected 시험 위함
	부모로 Student 클래스를 상속받음
	즉, protected 로 설정된 필드에 '직접 접근'이 가능하다.
	ClsService(자식) <- Student(부모)
	ClsService가 Student 의 후손 클래스가 된다.
	import 필요함 (7번 라인 참고)
	상속 받으면 부모의 것도 마치 내 것처럼 사용한다. 
	*/
	
	public void ex1() { // class 접근제한자 확인용 메소드
	// Student std = new Student(); // Student 는 public 으로 선언되어 접근 가능
	// TestVO test = new TestVO(); // TestVO 클래스는 default 로 선언되어 같은 패키지 내에서만 사용 가능, import 도 불가
	}
	public void ex3() { // 생성자 확인 테스트
		
		// User 클래스를 이용하여 u1 이라는 이름의 객체 생성
		User u1 = new User(); 
		// new 연산자 뒤의 User();는 기본생성자 
		 // User 클래스에 기본생성자 없어도 작동 된다.
		 // why? 기본생성자가 없다면 컴파일러에서 자동으로 만들어준다. 지금 역시 자동으로 만든 상태
		 // 공유 드라이브 메모리구조 3쪽 참고
		// 즉, 기본생성자가 Heap 영역에 User 라는 타입의 객체를 만들어주고 필드의 방들도 모두 나누어주고 
		// JVM 에서 지정하는 기본값들도 모두 배정해주는 일련의 과정을 수행한다.
		
		System.out.println( u1.getUserId() );
		System.out.println( u1.getUserGender() ); // char 의 JVM 기본값은 0이며 표시되지 않는다.
		System.out.println( u1.getUserAge() );
		System.out.println( u1.getUserName() );
		System.out.println( u1.getUserId() );
		
		User u2 = new User(); // u2 라는 새로운 객체 생성
		
		System.out.println( u2.getUserId() );
		System.out.println( u2.getUserGender() );
		System.out.println( u2.getUserAge() );
		System.out.println( u2.getUserName() );
		System.out.println( u2.getUserId() );
		
		// u1과 u2에 각기 다른 User 의 정보를 대입하고 싶을 때.
		
		System.out.println("=== 구분선 ===");
		
		// 방법 1: setter 이용하여 새로운 값 재대입
		
			u1.setUserId("oioioi");
			u1.setUserPw("3453g");
			u1.setUserName("신지");
			u1.setUserAge(32);
			u1.setUserGender('여');
			
			u2.setUserId("asdf123");
			u2.setUserPw("ii44");
			u2.setUserName("김종민");
			u2.setUserAge(30);
			u2.setUserGender('남');
			
			System.out.println( u1.getUserId() );
			System.out.println( u1.getUserGender() );
			System.out.println( u1.getUserAge() );
			System.out.println( u1.getUserName() );
			System.out.println( u1.getUserId() );
			System.out.println("===============");
			System.out.println( u2.getUserId() );
			System.out.println( u2.getUserGender() );
			System.out.println( u2.getUserAge() );
			System.out.println( u2.getUserName() );
			System.out.println( u2.getUserId() );
			
			System.out.println("=== 구분선 ===");
			
		// 방법 2: 매개변수 생성자 이용하여 객체가 생성될 때부터 다른 값으로 필드를 초기화
		
			User u3 = new User("u3id", "u3pw", "빽가", 12, '남');
	}
	public void ex4() { // 매개변수 생성자 예제
		
		User u1 = new User(); // 기본생성자
		User u2 = new User("user02","pw02"); // 매개변수 2개짜리 생성자를 이용한 객체 생성
		User u3 = new User("user03","pw03","넉살",42,'남'); // 매개변수 5개 생성자(전부 초기화)
		
		System.out.printf("u1 : %s / %s / $s / %d / %c\n",u1.getUserId(),u1.getUserPw(),u1.getUserName(),u1.getUserAge(),u1.getUserGender());
		System.out.printf("u1 : %s / %s / $s / %d / %c\n",u2.getUserId(),u2.getUserPw(),u2.getUserName(),u2.getUserAge(),u2.getUserGender());
		System.out.printf("u1 : %s / %s / $s / %d / %c\n",u1.getUserId(),u3.getUserPw(),u1.getUserName(),u3.getUserAge(),u3.getUserGender());
		

	}
	
}
