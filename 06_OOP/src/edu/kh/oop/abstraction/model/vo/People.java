package edu.kh.oop.abstraction.model.vo;
// === 순서 1 ===

// model : 프로그램 로직과 관련되어 있는 데이터를 저장하는 용도 + 비즈니스 로직
	// 	vo란? : value object
	//  - 값 저장용 객체를 만들기 위한 클래스를 모아두는 패키지

// * MVC 모델(Model View Controller)
		// Model : 데이터저장
		// View : 화면 	
		// Controller : 서버통신

/* 클래스란? 
- 개체의 특성을 정의한 것(★속성★과 ★기능★)
 -> 객체를 만들기 위한 "설계도"
- 클래스를 만들기 위해선 반드시 추상화 및 캡슐화를 진행해야 함 */

public class People{ // (예시) 국민(사람) 클래스
	
  /* 1. 클래스의 속성 ( -> 값 또는 data)
	 - 값을 저장하기 위한 변수 선언하는 구간
	  -> 대한민국 국민이라면 공통적으로 가지고 있는 속성만 작성(추상화)
	 - 이름, 성별, 주민번호, 주소, 연락처, 나이 등등..
	 - 이러한 변수는 필드에다 작성하며, 필드 == 필드 변수 == 멤버 변수
		
		1-1.추상화
		명명 순서 : 
		[접근제한자] 자료형 변수명; */
	
		private String name; // 이름
		private char gender; // 성별
		private String pNo; // 주민등록번호
		private String address; // 주소
		private String phone; // 전화번호
		private int age; // 나이
		
	/* 공통되지 않는 속성은 지정해선 안 된다.
	   접근제한자에 public 을 쓰게 되면 다른 클래스에서도 직접 접근이 가능하기에 private 을 사용하여 '캡슐화' 필요
	   -> 하단의 캡슐화 1원칙 위반
		
		 1-2.캡슐화
		  - 데이터(속성)와 기능을 하나로 묶어서 관리하는 기법
		  - 데이터의 직접적인 접근을 제한하는 것이 원칙
	      - 캡슐화 원칙 3가지
			1) 클래스 '멤버 변수'에 대한 접근 권한은 'private'이 원칙
			2) 클래스의 멤버 변수에 대한 연산처리를 목적으로 하는 '멤버 메소드는 클래스 내부'에 작성
			3) 멤버 메소드는 클래스 밖에서 접근할 수 있도록 'public'으로 작성
		 - 따라서 클래스 내부에 간접 접근 방법을 제공하는 기능(메서드)을 작성하여 사용
		   
		   * getter 와 setter (멤버 메소드)
			 - getter : 가져오고 싶을 때
			 - setter : 변수값을 새로 세팅하고 싶을 때 */ 
			
			// 데이터 직접 접근 제한
			// public
			// -> 같은 프로젝트 내라면 어디서든 접근 가능
			// private
			// -> people이란 클래스 내에서만 접근 가능 */
	
	// 2. 클래스의 기능 ( -> 값 또는 data)
		 // == 행동/동작 == 메서드(메서드)
		
		public void tax() {
			System.out.println("세금을 냅니다.");
		}	
		public void vote() {
			System.out.println("투표를 합니다.");
		}
			
		/* 
		캡슐화에서 사용할 간접 접근 기능 (getter / setter)
		 
		방식 : [접근제한자] 반환형 메서드명(){}
			- [접근제한자] : public, private ... etc. 
			- 반환형 : void(return 값 없음) ... etc.
		    - () : 소괄호 안은 매개변수가 들어가는 자리
			- {} : 중괄호 안은 메서드가 동작하는 기능 기술
		 	*/
	
	public String getName() {
		return name;
		/* 설명 : 
	 	- name 변수의 값을 호출한 쪽으로 돌려보내주는 간접 접근 기능. 즉, getter
		- name 이라는 반환값 있음!
		- 반환형 : 반환되는 값의 자료형 
		- 여기서 name 은 String 으로 위에서 지정했기 때문에 String 으로 바꾼다.
		- return; : return 만 사용했을 때는 현재 메서드를 종료하고 호출한 쪽으로 되돌아간다는 의미
		- 이를테면, 타 클래스에서 p1.getName(); 의 메소드를 사용하여 해당 메소드를 호출했을 때, return 을 통해 반환값을 반환할 필요가 있다.
		- 여기서는 name 에 저장되어 있는 값을 호출한 쪽으로 반환
		- return 값/변수; : 현재 메서드 종료 후 값/변수 가지고 호출한 쪽으로 되돌아간다.
		- return; 만 있을 때는 현재 메소드를 종료하고 호출한 쪽으로 코딩의 흐름을 돌린다는 의미이다.
		- 형식 : 통상 getName처럼 get 뒤에 변수 이름 붙여주는 것이 관례
		 */
	}
	public void setName(String name) { 
		this.name = name; 
		/* 설명 : 
		 - 
		- this 연산자 : 현재 객체
		- 이를테면, p1.setName("홍길동"); 의 메소드를 타 클래스에서 사용했다면, 해당 기능을 수행할 때
		- () 전달인자(홍길동)의 값이 매개변수로 들어오게 됨
		- 따라서 setName에서 '전달인자를 받아줄 준비가 필요함
		-  setter : 반환형 없다.
		- setter 는 전달인자에 저장된 값을 통해 매개변수로 들어온 값을 필드에 세팅하는 역할
		 -> 매개변수( () 안의 값)가 항상 있음(==전달인자 값)
		 -> 전달인자에는 자료형이 있음 -> 즉, 매개변수에도 자료형이 있음
		- 매개변수 작성법 :  (자료형 매개변수명)
		- 단순히 전달값으로 필드에 값을 세팅하는 역할이기 때문
		 -> 호출한 쪽으로 되돌려줄 값은 없음
		 -> 반환형도 없음(void)	
		- 단축키 : ALT + SHIFT + S 또는, 상단메뉴의 SOURCE */
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getpNo() {
		return pNo;
	}
	public void setpNo(String pNo) {
		this.pNo = pNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
	
	
	
	
}