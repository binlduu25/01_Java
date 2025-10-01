package edu.kh.collection.pack1.model.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
 
	// 1. java.util.List : List 에 반드시 필요한 필수 기능을 모아둔 "인터페이스"
	 // -> 인터페이스이기 때문에 new 를 통해 객체 생성 불가하다. 다만 부모로써 참조변수는 사용 가능
		
	// 2. java.util.ArrayList : 배열 형태 List (가장 대표적인 List 자식 클래스)
	 // -> 검색(조회)에 효율적임

	// 3. java.util.Vector : 동기화 제공하여 List 중 성능이 좋지 않다.
	 // -> 동기화 : 줄 세우기
	 // -> 비동기화 : 줄 세우지 않고 받아주기
	 // -> 비동기화가 효율적임

	// 4. java.util.LinkedList : 추가, 수정, 삭제가 효율적

public class StudentBasic {

	private List<Object> testList = new ArrayList<>(); 

	// <E> : 제네릭
	// 타입을 제한하는 문법
	// 제네릭은 객체(Reference Type, 참조형)만 허용
	// List, Map, Set -> 여러 타입을 저장할 수 있다.
	
	// * 자바 7 이상에서는 우변 제네릭 타입 생략 가능
	// 다이아몬드 연산자 : 컴파일러가 좌변을 보고 우변의 타입 추론
	
	// new ArrayList() : 기본생성자 형태임. -> 이대로 작성한다면 기본 크기 10의 리스트 생성
	// 하지만 리스트의 크기는 자동으로 증감이 가능하기 때문에 위의 형식대로 그대로 쓰는 것은 큰 의미가 없음
	
	public void ex1() { // List 테스트용 메소드
		
		// List.add(Object e) : 리스트에 객체를 추가
		// 매개변수 타입 Object == 모든 객체 타입을 매개변수로 전달할 수 있음
		
		testList.add("문자열"); // 문자형
		testList.add(100); // int 형 -> 하지만 자동으로 wrapper 클래스에 의해 Integer 로 변환된 상태임. 오토박싱(AutoBoxing)
		testList.add(new Scanner(System.in)); // 객체
		testList.add(new Object()); // 최상위 클래스인 Object
		
		// 컬렉션 특징 : 위처럼 하나의 컬렉션 여러 타입의 데이터를 저장할 수 있다.
		// 다만 제네릭을 <Object>로 설정해주어야 한다. 쓰지 않아도 되지만, 오류가 있을 수 있음
		
		// Object List.get(int index) : 리스트에서 index번째에 있는 객체 반환 메소드
		// 반환형이 Object == 모든 객체 반환 가능
		
		System.out.println(testList.get(0));
		System.out.println(testList.get(1));
		System.out.println(testList.get(2));
		System.out.println(testList.get(3));
		
		// 향상된 for 문 for ( 자료형 변수명 : 배열명)
		// 위와 아래의 결과는 같다.
		
		for(Object e : testList) {
			System.out.println(e);
		}
		
		
		
	}
	

}
