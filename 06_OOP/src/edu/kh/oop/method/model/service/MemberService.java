package edu.kh.oop.method.model.service;

import java.util.Scanner;

import edu.kh.oop.method.model.vo.Member;

public class MemberService { // 회원가입 프로그램 예제

	// 속성 (필드)
	private Scanner sc = new Scanner(System.in); // Scanner 에 private 을 붙임으로써 'MemberService' 클래스에서만 사용가능하도록
	
	private Member memberInfo = null; // 가입한 회원의 정보를 저장할 변수 
									  // 당장은 memberInfo에 1명분밖에 저장할 수밖에 없지만, 추후 객체배열 배운 후 여러 명 저장 가능
	private Member LoginMember = null; // 로그인한 회원의 정보를 저장할 변수
	
	
	// 기능 (생성자 / 메소드)
	
	/* 
	 	- C R U D - : 웹 개발자가 주로 하는 일

		Create 
			Read
				Update
					Delete
	 	
	 			*/
	
	/* 
	 - 클린 코드의 규칙 (깔끔하고 가독성 좋은 코드)
	   하나의 메소드 당 하나의 기능 
	 */
	
	// 1. 메뉴화면 출력 기능
	public void displayMenu() {
		
		int menuNum = 0; // 메뉴 화면에서 메뉴를 선택하는 변수
		
		// 무조건 한 번은 실행하는 do while 사용
		
		do {
			System.out.println("=== 회원 정보 관리 프로그램 ===");
			System.out.println("1. 회원가입");
			System.out.println("2. 로그인");
			System.out.println("3. 회원 정보 조회");
			System.out.println("4. 회원 정보 수정");
			System.out.println("0. 프로그램 종료");
			System.out.print("메뉴 입력 : ");	
			menuNum = sc.nextInt();
			sc.nextLine(); // 입력 버퍼의 개행 문자 제거용
						   // 다음 메뉴를 선택하고 문자를 입력할 수도 있기 때문에
			
			switch(menuNum) {
			case 1 : System.out.println( signUp() );  break; // signUp 메소드의 결과를 프린트 구문 안에서 호출한다.
			case 2 : System.out.println( login() ); break;
			case 3 : System.out.println( selectMember() ); break;
			case 4 : int result = updateMember();
					 
					 switch(result) {
					 case 1: System.out.println("회원정보가 수정되었습니다."); break;
					 case 0: System.out.println("회원정보 수정 실패. 비밀번호 불일치"); break;
					 case -1: System.out.println("로그인 후 이용 바람");break;
					 }break;
					 										
			case 0 : System.out.println("프로그램 종료..."); break;
			default : System.out.println("메뉴에 있는 번호만 입력하세요.");
			}
			
			} while(menuNum != 0); // menuNum이 0이 되면 반복 종료
		
	}
	
	// 2. 회원가입 기능 -> Member 클래스의 필드(속성) 4가지의 정보를 입력받아야 한다.
	public String signUp() { // 비밀번호 불일치 시 String 반환 위해 반환형 설정
							 // 메소드 정의(작성) 후 수행시키기 위해 해당 메소드가 호출되어야 한다.
		
		System.out.println("\n***** 회원 가입 *****");
		
		System.out.print("아이디 : ");
		String memberId = sc.next();
		
		System.out.print("비밀번호 : ");
		String memberPw = sc.next();
		
		System.out.print("비밀번호 확인 : ");
		String memberPwCheck = sc.next();
		
		System.out.print("이름 : ");
		String memberName = sc.next();
		
		System.out.print("나이 : ");
		int memberAge = sc.nextInt();
		
		// 비밀번호와 비밀번호 확인이 일치하면 회원가입 진행, 불일치 시 실패
		
			if(memberPw.equals(memberPwCheck)) { // 비밀번호 서로 일치할 경우
				
				// 새로운 회원 '객체'가 생성되어야 한다.
				 // 즉, Member 클래스 이용해서 새로운 객체를 생성하고,
				 // Member 클래스의 매개변수 생성자를 이용하여
				 // 회원가입한 정보를 가진 객체의 주소값을 memberInfo 라는 필드변수에 참조시킨다. 
				 // 이후 더이상 memberInfo 는 null 값을 가지지 않는다.
				
				memberInfo = new Member(memberId,memberPw,memberName,memberAge); // memberInfo 에 Member 객체의 속성들을 대입한다. (주소값을 참조시킴)
				
				return "회원 가입 성공!!😎😎"; // 이모지 : " window + . "	
			} 
			else { // 비밀번호 서로 일치하지 않을 경우
				return "회원 가입 실패. (비밀번호 불일치)";
			}
		
		
	}
	
	// 3. 로그인 기능
	public String login() {
		// 회원가입 되어 있는 사람이 있는지 없는지 검사
		// 입력한 아이디와 비밀번호로 가입한 사람의 정보가 있는지 확인
		
		System.out.println("\n*****로그인*****");
		
		// 먼저, 회원가입을 했는지부터 확인한다. 즉, memberInofo 가 객체를 참조하고 있는지 확인
		 // -> null 인지 아닌지 확인한다. (* null : 아무것도 참조하지 않은 상태)
		
		if(memberInfo == null) { // 회원가입을 하지 않은 경우
			return "회원가입부터 진행해주세요!";
		}
		
		// 이미 회원가입을 진행한 상태라면 위 if 문을 거치지 않고 여기로 진입한다.
		
		System.out.print("아이디 : ");
		String memberId = sc.next();
		System.out.print("비밀번호 : ");
		String memberPw = sc.next();
		
		// 위 단계에서 입력한 아이디 및 비밀번호가 "memberInfo 가 참조하는 Member 객체"에 저장된 아이디 및 비밀번호와 같은지 검사
		
		if( ( memberId.equals(memberInfo.getMemberId()) ) && ( memberPw.equals(memberInfo.getMemberPw()) ) ) {
			
			// 이제, 현재 로그인한 사람의 정보를 다른 공간에 기억시켜야 한다.
			// Field 내 LoginMember 변수를 만들어놓았다.
			
			LoginMember = memberInfo;
			
			// LoginMember에 memberInfo 가 참조하고 있는 객체의 주소 대입
			// memberInfo 가 가진 주소값을 LoginMember 로 얕은복사 발생
			// 따라서, 로그인한 상태에서 LoginMember 의 정보를 변경하면 memberInfo 의 정보 역시 변경된다. (얕은 복사이기 때문)
			
			return LoginMember.getMemberName() + "님 환영합니다!";
		}
		else {
			return "아이디 또는 비밀번호가 일치하지 않습니다.";
		}
	}
	
	// 4. 회원정보 조회
	public String selectMember() {
		
		// 먼저 로그인했는지부터 확인한다.
		// 로그인 확인 후, 로그인한 사람의 정보를 저장한 객체에서 정보를 가져온다. (이름, 아이디, 나이)
		
		System.out.println("\n*****회원정보 조회*****");
		
		if(LoginMember == null) { // 로그인하지 않았을 시
			return "로그인 후 이용해주세요.";
		}
		
		// 로그인 되어 있는 경우
		
		String temp = "이름 : " + LoginMember.getMemberName(); // 문자열을 출력하기 위한 임시 변수를 하나 만든다.
		temp += "\n아이디 : " + LoginMember.getMemberId(); // 문자열끼리 += 등 가능하다.
		temp += "\n나이 : " + LoginMember.getMemberAge();
		
		return temp;
	}
	
	// 5. 회원정보 수정
	public int updateMember() { // 반환형을 int 로 받아서 정리
		
		// 먼저 로그인했는지부터 확인한다.
		 // 로그인이 되어 있지 않으면 -1 을 반환한다고 설정하고,
		
			if( LoginMember == null) {
				return -1; // 로그인 되어 있지 않을 때
			}
		
		// 로그인이 되어 있을 때
		 // 1) 수정할 회원 정보 입력 받기 (이름과 나이만)
		
			System.out.println("수정할 이름 입력 : ");
			String inputName = sc.next();
			System.out.println("수정할 나이 입력 : ");
			int inputAge = sc.nextInt();
			
		 // 2) 비밀번호를 입력 받아 현재 로그인한 회원의 비밀번호와 일치하는지 확인
			
			System.out.println("비밀번호 입력 : ");
			String inputPw = sc.next();
			
			if ( inputPw.equals(LoginMember.getMemberPw()) ){ // 비밀번호 일치할 경우
			
			// 로그인한 회원의 이름과 나이 정보를 수정하기 위해 입력 받은 값으로 변경 후 1 반환

			LoginMember.setMemberName(inputName);
			LoginMember.setMemberAge(inputAge);
			
			return 1; // 수정 완료 시
			}
			
			else { return 0; // 비밀번호 오입력 시	
			}
	
	}	
	
}
