package edu.kh.oop.cls.model.vo;
//=== 순서 6 === 생성자(constructor)

public class User { // 필드(Field)
	
	// 필드에 사용자(User)라면 있어야 할 속성과 기능 정의
	
	// 1. 속성(필드에 정의)
	 // - ID, PW, 이름, 나이, 성별 (추상화 - 공통적인 것만 추출한다.)
	 // 클래스 외부에서 데이터에 직접 접근 불가 원칙 필요
	 // -> field 접근 제한자를 모두 private 으로 작성 (캡슐화)
	
	private String userId;
	private String userPw;
	private String userName;
	private int userAge;
	private char userGender;
	
	// 2. 기능(메서드)
	 // getter 및 setter
		public String getUserId() {
			return userId;
		}
		public void setUserId(String userId) {
			this.userId = userId;
		}
		public String getUserPw() {
			return userPw;
		}
		public void setUserPw(String userPw) {
			this.userPw = userPw;
		}
		public String getUserName() {
			return userName;
		}
		public void setUserName(String userName) {
			this.userName = userName;
		}
		public int getUserAge() {
			return userAge;
		}
		public void setUserAge(int userAge) {
			this.userAge = userAge;
		}
		public char getUserGender() {
			return userGender;
		}
		public void setUserGender(char userGender) {
			this.userGender = userGender;
		}
	
	// 생성자 (통상적으로는 메소드 상단에 위치한다)
	
		public User () {
		
		// ↑ 기본생성자 ( -> 매개변수 '()' 가 없는 생성자 )
		// 기본생성자 자동완성 단축키 : ctrl + space -> enter
		// 생성자 역시 일종의 메소드이다. (역할은 객체의 생성)
		// 다만 여타의 기능을 수행할 수도 있다. 예를 들면 출력 기능 ↓
		
		System.out.println("기본생성자로 User 객체 생성");
		
		// 만약, 생성자 안에서 필드를 초기화한다면,
			// 필드 초기화 
				 userId = "user01";
				 userPw = "pass01";
				 userName = "김철수";
				 userAge = 25;
				 userGender = '남';
			// 다만, 이 방식으로 필드에 초기화하면 각기 다른 객체에(이를테면 u1과 u2 모두에) 같은 정보가 들어가게 된다.( = 필드값이 모두 동일하다.)
			// 왜냐하면, u1과 u2를 만들 때 모두 기본생성자( User(){} )를 사용하기 때문이다.
			 // 기본생성자에 작성된 코드가 동일하게 적용
		 	// 따라서, 통상 이 방법으로는 초기화하지 않는다.
			// u1과 u2 각기 다른 객체에 다른 정보를 입력하고 싶을 때? -> ClsService 클래스 확인
	}
	 	
		// ClsService의 방법 2: 매개변수 생성자 이용하여 객체가 생성될 때부터 다른 값으로 필드를 초기화
		 
			// 매개변수 생성자
		 	 // ** 매개변수란? : 생성자나 메소드 호출 시 () 안에 작성되어 전달되는 값을 저장하고 있는 변수
				// 매개변수 생성자 자동완성
				// 상단 메뉴 -> Source -> Generate Constructor using Fields..
		
			public User(String userId, String userPw, String userName, int userAge, char userGender) {
			
			// 필드 초기화
			
			this.userId = userId; // 자기 자신의 집을 참조하여 userId(좌변)에 있는 값을 참조하여 매개변수의(userId, 우변) 값을 대입하겠다.
			this.userPw = userPw;
			this.userName = userName;
			this.userAge = userAge;
			this.userGender = userGender;
	
			
			// this -> this 참조변수
			// 객체가 자기 자신을 참조(자기 자신 객체의 주소값)할 수 있도록 하는 변수
			// 왜 사용?
			// -> this.userId = userId;에서, 앞의 userId 는 필드명, 뒤의 userId는 매개변수명
			// -> 따라서, 필드명과 매개변수명이 같을 때 이 둘을 구분하기 위해서 사용
			// this 는 자기 자신의 필드에 접근하겠다는 뜻. 자기 자신의 집주소를 Heap 에 저장 중
		
		}
			public User(String userId, String userPw) {
			}
			// 필드를 전부 초기화하는 목적의 매개변수 생성자
	

		
		

			
			
			// 같은 클래스 내 다른 생성자를 호출할 때 사용
			// 왜 사용?
			// 중복 코드 제거, 코드 길이 감소, 재사용성 증가.
			// 단점: 가독성 저하
			// 주의할 점 : 반드시 생성자 내 1번째 줄에 작성
	

	// 오버로딩 ★★★★
	 // 오버로딩이란? : 한 클래스 내 동일한 이름의 메소드를 여러 개 작성하는 기법
	 // 오버로딩 조건 
	  // 1. 메소드명은 동일해야 한다.
	  // 2. 매개변수의 자료형, 개수, 순서가 달라야 한다.
	  // 3. 리턴 타입은 같아도 되고, 달라도 된다.
      // 4. 변수명은 신경쓰지 않는다.
	
	
	
	
	public User(String userId, int userAge) {}
	// 매개변수의 개수와 동일한 것이 있으나 매개변수 중 하나의 타입이 다름
	// 오버로딩 성립
	
	public User(int userAge, String userId) {}
	// 매개변수의 개수 및 순서도 동일한 것이 이미 있으나 순서가 다름
	// 오버로딩 성립

	
	
	// public user(int age, String name) {}
	// 매개변수의 개수, 타입, 순서가 모두 같아서 불가
	// -> 변수명은 신경쓰지 않는다
	// 오버로딩 불가
	
	/* 생성자 정리
	 * 
	 * 생성자(Constructor)
	 * 
	 * - new 연산자를 통해 객체를 생성할 때, 
	 * 생성된 객체의 필드값 초기화 + 지정한 기능 수행하는 역할
	 * 
	 * - 생성자 작성 규칙
	 * 1) 생성자의 이름은 반드시 클래스와 같아야 한다.
	 * 2) 생성자는 반환형 존재하지 않는다.
	 * 3) 생성자 종류
	 *  3-1) 기본 생성자 (생성자가 하나도 없을 때, JVM(컴파일러)가 기본 생성자 자동 생성
	 *  3-2) 매개변수 생성자
	 *  
	 * 
	 * 
	 * */
	
}

