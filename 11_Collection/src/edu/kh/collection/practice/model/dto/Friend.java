package edu.kh.collection.practice.model.dto;

public class Friend { // 실습예제 1

	private String name;
	
	public Friend() {}
	public Friend(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public void pickLeader() { // 왜 필요한지 답에서 보기
	}
	
		// * teacher
	
			//	public void pickLeader() {
			//		System.out.println(name + "가 떡잎방범대 대장이다!");
			//	}
	
	@Override
		public String toString() {
		return name;
		}
	
	
}
