package edu.kh.ex2.model.dto;

public abstract class Animal { // 클래스 선언부 접근제한자 앞에 abstract 선언하여 추상 클래스 작성

	// 1. 추상클래스란?
	// 1-1. 미완성 클래스
	// 1-2. 미완성 메소드(추상 메소드)를 보유하고 있는 클래스
	// 1-3. 객체로 만들 수 없는 클래스 ★★★ (new 연산자 통해 객체 만들 수 없다)
	// 1-4. 역할: 여러 타입들을 관리하기 위한 상위 타입의 목적으로 만들 수 있다.(부모 타입의 참조변수로서의 역할)
	// 1-5. 즉, 객체로 생성하여 사용하기 위한 목적의 클래스가 아님

	// 속성

	private String type; // 종 // 과
	private String eatType; // 식성

	public Animal() {
	}

	public Animal(String type, String eatType) {
		this.type = type;
		this.eatType = eatType;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getEatType() {
		return eatType;
	}

	public void setEatType(String eatType) {
		this.eatType = eatType;
	}

	// 동물의 공통 기능 추출(추상화)
	// -> 동물의 공통적 습성을 추출하지만, 어떤 동물이냐에 따라 구체적인 습성은 다르므로,
	// -> 해당 클래스에서 메소드 정의를 자세히 정의하기 불가하다.
	// 따라서 미완성 상태의 메소드를 작성해 상속받은 자식들이 해당 메소들을 본인에게 맞는 정의를 하도록 하는
	// 오버라이딩을 강제화 시키는 방법의 메소드 작성 필요
	// -> 추상메소드 (abstract method)
	
	// 일반적 메소드
	// public void eat() {} ( <- 일반적인 메소드는 몸체(중괄호:{})가 반드시 필요하다
	
	// 추상 메소드
	
		public abstract void eat(); // <- 몸체가 없다. 소괄호 옆에 ;을 붙인 점이 차이. 틀만 만들어둔 형태.
		public abstract void breath();
		public abstract void move();
		
		// ＠＠＠ 추상 클래스는 추상 메소드를 가지고 있지 않아도 괜찮다.
		// ＠＠＠ 다만 역은 성립하지 않는다. 추상 메소드는 반드시 추상 클래스에 위치해야 한다.
	
	// 추상 클래스는 일반 멤버(필드, 메소드도 작성 가능하다.)
		public void standardMethod() {}
		
		@Override
			public String toString() {
				return type + " / " + eatType;
			}
	
		
	
	
	
}
