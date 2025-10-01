package edu.kh.oop.method.model.vo;

public class Member { // 회원 클래스
	
	// 속성 + 기능
	// 필드 (== 속성)
	
	private String memberId; // 아이디
	private String memberPw; // 비밀번호
	private String memberName; //이름
	private int memberAge; // 나이
	
	// 기능 (==메소드/생성자)
	
	public Member() {}
	
	
	// 4개짜리 매개변수 생성자
	public Member(String memberId, String memberPw, String memberName, int memberAge) {
		this.memberId = memberId;
		this.memberPw = memberPw;
		this.memberName = memberName;
		this.memberAge = memberAge;
	}


	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getMemberPw() {
		return memberPw;
	}
	public void setMemberPw(String memberPw) {
		this.memberPw = memberPw;
	}

	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public int getMemberAge() {
		return memberAge;
	}
	public void setMemberAge(int memberAge) {
		this.memberAge = memberAge;
	}	
	
	
	//원본 
	// @Override
	// public String toString() {
	//	return super.toString();
		
	// 재정의
	public String toString() {
		return memberId + " / " + memberAge + " / " + memberName;
		
		// 객체의 주소값을 리턴
		// super : 부모 객체
		// Object 클래스 : 모든 클래스의 최상위 부모
		// Object.toString 이 Object 클래스 내에 위치한다.
		// Object.toString : 객체의 위치 + 주소값을 해시코드 형태로 문자열(String)로 반환
		
		// 오버라이드(Override)란 ★★★★
		 // 부모가 가진 메소드를 자식이 재정의
		
		// @ : annotation : 컴파일러 인식용 주석(즉, 컴파일러가 읽는 주석)
		 // @ 하단의 메소드가 부모 클래스의 메소드를 정확히 재정의했는지(규칙 및 문법에 맞게 잘 작성되었는지) 검사
		
		// toString() 메소드
		 // : 객체가 문자열로 변환되어야 할 때 사용하는 메소드
		 // -> 보통 객체의 필드값을 출력하는 용도로 '오버라이딩'하여 사용
		 // 상단 source 메뉴에 있다. 
		
	}
}