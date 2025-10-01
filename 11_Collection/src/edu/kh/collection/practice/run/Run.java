package edu.kh.collection.practice.run;

import java.util.ArrayList;
import java.util.List;

import edu.kh.collection.practice.model.dto.Friend;
import edu.kh.collection.practice.model.service.Zoo;

public class Run {
	

	public static void main(String[] args) {
	
		/* 예제 1번
		 *  
		List<Object> friend = new ArrayList<>(); 

		System.out.println("==== 예제 1번 ====");
		
		friend.add( new Friend("짱구") );
		friend.add( new Friend("철수") );
		friend.add( new Friend("유리") );
		friend.add( new Friend("훈이") );
		friend.add( new Friend("맹구") );
		
		System.out.printf("떡잎마을 방법대 대장은 '%s'이다!\n", friend.get( (int)(Math.random()*friend.size()) ) );
				
		*/
		
		/* 예제 1번 teacher
		  
		// 1-1. Friend 객체만 넣을 수 있는 ArrayList 객체 생성

		List<Friend> friends = new ArrayList<Friend>();

		friends.add(new Friend("짱구"));
		friends.add(new Friend("철수"));
		friends.add(new Friend("유리"));
		friends.add(new Friend("훈이"));
		friends.add(new Friend("맹구"));

		// 
		// 방법 1-2. Collections.addAll()
		 // Collections.addAll( friends, new Friend("짱구"), new Friend("철수"), new Friend("유리") , new Friend("훈이"), new Friend("맹구") );
		

		// 방법 1-3. List.of() : Java 9 이상의 버전에서 사용 가능
		 // List<Friend> friends = List.of( new Friend("짱구"), new Friend("철수"), new Friend("유리"), new Friend("훈이"), new Friend("맹구") );
		 

		// 2. 랜덤으로 골목대장 뽑기
		
		 // * 랜덤 메소드 
		  // Random random = new Random();
		  // int n = random.nextInt(10); // 0~9 범위
		
		// 방법 2-1.
		
		 // Random random = new Random(); // <- 랜덤 난수 위한 객체(random) 생성
		 // int n = random.nextInt(friends.size()); // <- 임의의 int 형 변수 n에 [0 ~ friends 컬렉션의 크기] 사이의 랜덤한 난수 부여
		 // Friend leader = friends.get(n); // <- ※ 이해 필요 // Friend 내 leader 객체 생성??
		
		// 방법 2-2.
		
		 // int randomIndex = (int) (Math.random() * friends.size()); // <- 임의의 int 형 변수 randomIndex에 [0 ~ friends 컬렉션의 크기] 사이의 랜덤한 난수 부여
		 // Friend leader = friends.get(randomIndex); // <- leader 객체에 난수가 부여된 index 번호에 따라 특정 객체 대입
		 // leader.pickLeader(); // <- pickLeader 메소드 호출
		
		*/
	
		 
		
		new Zoo().displayMenu();
		
		
	}

}
