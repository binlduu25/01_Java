package edu.kh.oop.method.run;

import edu.kh.oop.method.model.service.MemberService;
import edu.kh.oop.method.model.service.MethodExample;
import edu.kh.oop.method.model.vo.Member;

public class MethodRun {
public static void main(String[] args) {
	MethodExample run = new MethodExample(); // 객체 생성
	
		// run.method1();
		
	MemberService service = new MemberService(); // 회원가입 프로그램 예제	
		
		//service.displayMenu();
		
	
	//to.String 메소드 연습
	Member member = new Member("user01","pass01","김김",20);	
	System.out.println(member);	
	//  ↑ : to.String 재정의 전 결과 : edu.kh.oop.method.model.vo.Member@b4c966a
	//  ↑ : to.String 재정의 후 결과 : user01 / 20 / 김김
	
}
}
