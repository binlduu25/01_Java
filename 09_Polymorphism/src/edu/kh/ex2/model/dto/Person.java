package edu.kh.ex2.model.dto;

public class Person extends Animal {

	// 위 선언부에서, 추상 클래스인 Animal 을 부모로 두었으며, Animal 내 존재하는 미완성 메소드 3개를
	// 모두 오버라이딩 강제화 필요하다는 에러 메시지가 발생함
	// 현재는 아래 3개 메소드가 있으므로 발생하지 않는다.

		private String name;
	
		public Person() {
		}
	
		public Person(String type, String eatType, String name) {
			super(type, eatType);
			this.name = name;
		}
	
		public String getName() {
			return name;
		}
	
		public void setName(String name) {
			this.name = name;
		}
	
		// 상속받은 추상 메소드 3개를 구체화
	
		@Override
		public void eat() {
			System.out.println("사람의 식사방법은 도구를 사용");
		}
	
		@Override
		public void breath() {
			System.out.println("사람은 코와 입으로 숨 쉰다");
		}
	
		@Override
		public void move() {
			System.out.println("사람은 두발로 걷는다");
		}
		
		@Override
		public String toString() {
			return "Person : " + super.toString() + " / " + name;
		}

}
