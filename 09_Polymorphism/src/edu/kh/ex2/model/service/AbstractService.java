package edu.kh.ex2.model.service;

import edu.kh.ex2.model.dto.Animal;
import edu.kh.ex2.model.dto.Fish;
import edu.kh.ex2.model.dto.Person;

public class AbstractService {

	public void ex1() {
		
		// Animal 객체 생성
		Animal a1 = new Person("인간", "잡식", "홍길동"); 
		// 객체화 할 수 없다고 에러 발생
		// 하지만 부모 타입 참조변수로서의 역할은 가능하다.
		// Animal 을 상속 받아 미완성 부분을 구체적으로 구현한 자식클래스를 이용하여 객체 생성은 가능하다.
		// -> 다형성 중, 업캐스팅
		
		Animal a2 = new Fish("어류", "플랑크톤");
		
		a1.eat();
		a1.breath();
		a1.move();
		System.out.println(a1.toString());
		System.out.println("========");
		a2.eat();
		a2.breath();
		a2.move();
		System.out.println(a2.toString());
		
	}
	
	
}
