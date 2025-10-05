package edu.kh.collection.pack2.model.service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

import edu.kh.collection.pack2.model.dto.Person;

public class SetService {

	
	public void method() {
		
		// HashSet 객체 생성
		Set<String> set = new HashSet<>();
		
		// 1. boolean add (E e) : 추가
		set.add("네이버");
		set.add("카카오");
		set.add("라인");
		set.add("쿠팡");
		set.add("배달의민족");
		set.add("당근마켓");
		set.add("토스");
		set.add("직방");
		set.add("야놀자");
		
		System.out.println(set);
		
		// 중복 저장x 확인
		
		set.add("배달의민족");
		set.add("배달의민족");
		set.add("배달의민족");
		
		System.out.println(set);
		
		// TreeSet 은 null 저장 지원 안 함
		// 자동 저렬 위해 내부적으로 compareTo() 라는 메소드 이요 시
		// NullPointerException 방지하기 위해
	}
	
	
	// 2. int size() : Set 에 저장된 객체 수 반환
	
	public void method2() {
		
		
		
		
		// Set 에 저장된 객체 이용해서 List 생성
		
		List<String>List = new ArrayList<>(set);
		// Set -> List 로 변환
		
		
		
		
	}
	
	
	/**
	 * 직접 만든 클래스(Person)를 이용해 만든 객체를 Set 에 저장하기 위한 메소드
	 * 중복 제거 확인 
	 */
	public void method3() {
		
		// *********************************************************************
		// Hash 라는 단어가 포함된 컬렉션 이용 시, 
		// HashCode(), equals() 오버라이딩 메소드가 필수적으로 진행되어야 함!
		// *********************************************************************
		
		Person p1 = new Person("홍길동", 25, '남');
		Person p2 = new Person("홍길동", 25, '남');
		Person p3 = new Person("홍길동", 30, '남');
		Person p4 = new Person("김씨", 20, '여');
		
		// Set 객체 생성 후 p1 ~ p4 추가
		
		Set<Person> personSet = new HashSet<Person>();
		personSet.add(p1);
		personSet.add(p2);
		personSet.add(p3);
		personSet.add(p4);
		
		for(Person p : personSet) {
			System.out.println(p);
			
			// -> HashCode(), equals() 오버라이딩 하지 않았을 시 중복제거 되지 않음
			
		// 오버라이딩 후,
		// 같은 필드 값을 가진 객체는 해시코드 번호가 같다
			
			System.out.println("p1 :" + p1.hashCode());
			System.out.println("p2 :" + p2.hashCode());
			System.out.println("p3 :" + p3.hashCode());
			System.out.println("p$ :" + p4.hashCode());
			
		// A.equals(B) : 
		}
	}
	
	
	/**
	 * TreeSet 이용하여 로또번호 생성기 만들기
	 * -> 기본 오름차순 정렬
	 * 
	 * TreeSet 안에 저장되는 객체는 Comparable 인터페이스 상속 필수!
	 * -> 컬렉션에 저장될 수 있는 형태는 객체만!
	 * -> int 형은 객체타입이 아니기 때문에 Integer 라는 Wrapper 클래스 사용해서 저장해야 한다
	 * -> 즉. TreeSet<Integer> 형태를 취해야 하고, Integer 안에 Comparable 이 상속되어 있어야 한다
	 * -> 하지만 이미 상속되어 있기에 바로 사용 가능 (자동 정렬이 된다)
	 * 
	 */
	public void method4() {
		// Integer 를 저장할 TreeSet 객체 생성
		Set<Integer> lotto = new TreeSet<Integer>();
		
		// 난수 생성 방법
		 // 방법 1. Math.random()
		 // 방법 2. Random.nextInt(10) : 0 ~ 9 범위 내 정수 반환
		
		// Random 객체 생성
		Random random = new Random();
		
		// lotto 저장된 값이 6개 미만이면 반복
		 // == 6개에서 멈춤
		while(lotto.size()<6) { // 현재 저장된 lotto 의 크기가 6 초과 시 멈춘다( 인덱스는 0부터 시작하므로)
			lotto.add(random.nextInt(45) + 1 );
		}
		System.out.println(lotto);
	}
	
	
	
}
