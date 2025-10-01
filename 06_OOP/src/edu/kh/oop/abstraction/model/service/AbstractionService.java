package edu.kh.oop.abstraction.model.service;
// === 순서 2 ===

import edu.kh.oop.abstraction.model.vo.People; // People 클래스 import

// service : 특정 기능(비즈니스 로직)을 제공하는 패키지
// (예시 : 비밀번호 암호화, 유효 파일 검사 등등)

public class AbstractionService{
	
	// 속성 ( * 현재 클래스에서는 별도의 속성을 지정하지 않는다.)
	// 기능
	
	public void ex1() {
		
		// People 클래스를 이용하여 국민 객체 만들기
		
		People p1 = new People(); 
		
		// 메모리 구조 PPT 2쪽 확인!
		// 해석 : 
		// 왼쪽 항 : "People p1" => People 객체의 주소를 저장하여 참조하는 변수 p1(p1 : 참조 변수)
		// 	- 여기서의 People 은 "사용자 정의 자료형" (보통의 자료형은 int , String 등등..)
		// 오른쪽 항 : "new People" => 새로운 People 이라는 객체(instance)를 Heap 영역에 생성
		
		
		//  1. p1에 '직접 접근'하는 방식 (캡슐화 진행 안 했기 때문에 캡슐화 위반)
		
			//	p1.name = "홍길동";
			//	p1.gender = '남';
			//	p1.age = 29;
			//	p1.address = "관악구";
			//	p1.phone = "010-1010-0101";
			//	p1.pNo = "123213-2342333";
			//	
			//	p1.tax();
			//	p1.vote();
			//		
			//	System.out.println(p1.name);
			//	System.out.println(p1.address);
			//	System.out.println(p1.pNo);
			//	System.out.println(p1.phone);
			//	System.out.println(p1.age);
			//	System.out.println(p1.gender);
		
		
		// 값을 호출한 자리로 얻어온다 => getter
		// p1.getName(); // 메서드 호출
		
		// 전달한 값을 객체의 필드에 세팅 => setter
		// p1.setName("홍길동");
		// () : 전달인자
		
		
		// 전달하는 값(인자) : 전달인자 
		// p1에 홍길동 데이터 세팅하기
		p1.setAddress("동작구");
		p1.setAge(55);
		p1.setGender('남');
		p1.setName("김김김");
		p1.setPhone("010-0000-0000");
		p1.setpNo("주민번호 없음");
		
		System.out.println(p1.getName());
		System.out.println(p1.getAddress());
		System.out.println(p1.getPhone());
		System.out.println(p1.getpNo());
		System.out.println(p1.getAge());
		System.out.println(p1.getGender());
		
		System.out.println("===================");
		
		
		// 본인 객체 만들기

		People jh = new People();
		
		jh.setName("성종");
		jh.setAge(58);
		jh.setAddress("메가커피");
		jh.setPhone("34ㄴㄹㅇ");
		jh.setpNo("23432");
		jh.setGender('남');
		
		System.out.println(jh.getName());
		System.out.println(jh.getAddress());
		System.out.println(jh.getPhone());
		System.out.println(jh.getpNo());
		System.out.println(jh.getAge());
		System.out.println(jh.getGender());
		
		
		
		
	}
}