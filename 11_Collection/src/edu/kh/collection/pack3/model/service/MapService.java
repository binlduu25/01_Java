package edu.kh.collection.pack3.model.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import edu.kh.collection.pack3.model.dto.Member;

public class MapService {
	
	// Map 이란
	 // Key 와 Value 한 쌍이 데이터가 되어 이를 모아둔 객체
	 // Key : Value
	 // Key 와 Value 한 쌍을 Entry 라 부른다.
	
 	 // - Key 를 모아두면 Set 의 특징을 지닌다. (중복 X)
	 // - Value 를 모아두면 List 의 특징을 지닌다. (중복 O)
	
	public void ex1() {
		
		// HashMap<K, V> : Map 의 자식 클래스 중 가장 대표되는 Map
		Map<Integer, String> map = new HashMap<Integer, String>(); // : K 에는 정수를, V에는 문자열을 받겠다.
		
		// Map.put(Integer Key, String Value) : 추가
		
		map.put(1, "홍길동"); // { 1=홍길동} <- 하나의 Entry
		map.put(2, "김길동");
		map.put(3, "홍민동");
		map.put(4, "홍길호");
		map.put(5, "홍로동");
		map.put(6, "방길동");
		
		// Key 중복 시 테스트
		
			map.put(1, "김랄랄");	
			// -> Key 는 중복되지 않지만, 대신 Value 값은 덮어씌어진다.
		
		// Value 중복 시 테스트
			
			map.put(7, "홍길동");
			// -> Key 값이 중복되지 않는 한 Value 의 중복은 허용된다.
		
		System.out.println(map);
		
	}
	
	public void ex2() {
		
		// Map 사용 예제
		 
		 // VO/DTO (값 저장용 객체)는 특정 데이터 묶음의 재사용이 많은 경우 사용
		  // -> 재사용이 적은 VO 는 오히려 코드 낭비
		  // -> Map 을 이용해서 VO 와 비슷한 코드를 작성 가능
		
			// 1) VO 버전 (기존에 하던 대로)
				
				Member member = new Member();
				
				member.setId("user01");
				member.setPw("pw01");
				member.setAge(22);
				
			// 2) Map 사용 버전 
				Map<String, Object> map = new HashMap<String, Object>();
				// Value 값이 Object 란 말은 == 어떤 객체든 들어올 수 있다.
				
				//값 세팅
				map.put("id", "user02");
				map.put("pw", "pass02");
				map.put("age", 25);
				
				// 값 출력
				 // Object(Value) Map.get(Key)
				 // : 매개변수로 전달받은 Key와 대응하는 Value 반환
				
				System.out.println(map.get("id"));
				System.out.println(map.get("pw"));
				System.out.println(map.get("age"));
			
		// Map 에 저장된 데이터에 순차적으로 접근하기
			
			// Map 에서 Key 부분만 보면 Set 의 특징을 지닌다.
			// -> 이를 활용한 Map 에서 keySet() 이란 메소드가 존재
			// keySet() : key 값만 모아서 Set 으로 반환
				
			Set<String> set = map.keySet(); // id, pw, age 라는 key 가 저장된 Set 반환
			
			System.out.println(" keySet() : " +  set);
			
			// 이를 향상된 for 문으로, key 에 대응되는 value 값을 출력할 수도 있다.
			for(String key : set) {
				System.out.println( map.get(key));
			}
			
			// keySet() + 향상된 for문 코드 사용 용이한 경우 
			 // 1) map 에 저장된 데이터가 많거나 (반복 필요)
			 // 2) 어떤 key 가 있는지 불분명할 때
			 // 3) map 에 저장된 모든 데이터에 접근해야 할 때
	}
	
	/**
	 * 컬렉션 안에 컬렉션 넣기
	 */
	public void ex3() {
		
		// List 에 Map 여러 개 추가하여 다루기
		
		// 1. List 객체 생성
		
		List< Map<String, Object> > list = new ArrayList<>();
		// List 객체 생성 후, 해당 list 에 Map 만 들어올 수 있도록 제한한 코딩
		 // 하지만 현 상태에서는 list 는 new 를 통하여 객체로 만들어졌지만, Map 객체는 생성 전
		 // 따라서 Map 객체 생성 필요하다
		
		for(int i = 0; i < 10; i++) {
			// Map 객체 생성
			Map<String, Object> map = new LinkedHashMap<>();
			// HashMap 은 순서를 보장하지 않지만, LinkedHashMap()은 put 순서대로 유지가 가능 
			
			// Map 에 데이터 추가
			map.put("id", "user0"+i);
			map.put("pw", "pass0"+i);
			
			// Map 을 list 에 추가
			list.add(map);
		}
		// for 문 종료 시 list 에 총 10개의 Map 객체가 추가된 상태
		
		System.out.println(list);
		
		// 향상된 for문 이용해서 key가 "id"에 대응되는 value 값 전부 출력하기
		for( Map <String, Object> temp : list){
			System.out.println( temp.get("id") );
		}
	}
}
