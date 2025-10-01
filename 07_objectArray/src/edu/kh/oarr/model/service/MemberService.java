package edu.kh.oarr.model.service;

import java.util.Scanner;

import edu.kh.oarr.model.vo.Member;

public class MemberService {

	private Scanner sc = new Scanner(System.in);
	
	// 회원가입한 사람의 정보를 저장해둘 참조변수
	// Member 5칸짜리 객체배열 선언 및 할당
	private Member[] memberArr = new Member[5];
	
	// 현재 로그인한 회원의 정보를 저장할 참조 변수 선언
	private Member loginMember = null;
	
	// 기본생성자 이용하여 기회원 정보 생성
	public MemberService() { 
		// 기본생성자 내에 추가적으로 코딩 가능
		// memberArr 배열에서 0,1,2 인덱스를 초기화하여 회원 5명 중 3명의 정보를 미리 입력하려고 함
		memberArr[0] = new Member("user01","pass01","김철수",31,"서울"); 
		memberArr[1] = new Member("user02","pass02","계보린",24,"서울"); 
		memberArr[2] = new Member("user03","pass03","라라라",12,"부산"); 
	}
	
	// 기능
	
	public void displayMenu(){ // 1. 메뉴 호출
		int menuNum = 0;
		
		do {
			System.out.println("== 회원관리 프로그램 v2 ==");
			System.out.println("1. 회원가입");
			System.out.println("2. 로그인");
			System.out.println("3. 회원 정보 조회");
			System.out.println("4. 회원 정보 수정");
			System.out.println("5. 회원 검색(지역)");
			System.out.println("0. 프로그램 종료");
			
			System.out.print("메뉴 입력 : ");
			menuNum = sc.nextInt();
			sc.nextLine(); // 입력 버퍼에 남은 개행 문자 제거
			
			switch(menuNum) {
			case 1: System.out.println(signUp()); break;
			case 2: System.out.println(login()); break;
			case 3: System.out.println(selectMember());  break;
			case 4: 
				int result = updateMember(); // -1, 0, 1
			
				if(result == -1) {
					System.out.println("로그인 후 이용바람");
				} else if(result == 0) {
					System.out.println("회원 정보 수정 실패(비밀번호 불일치)");
				} else { // 1
					System.out.println("회원 정보가 수정되었습니다.");
				}
				break; 
			case 5: searchRegion(); break;
			case 0: System.out.println("프로그램 종료.."); break;
			default : System.out.println("잘못 입력하셨습니다.");
			}
			
		}while(menuNum != 0); // menuNum이 0이 되면 반복 종료
	}
	
	public String signUp() {
		// 먼저 memberArr(객체배열)에 남은 칸이 있는지 점검 필요
		// 빈 공간의 인덱스 번호를 얻어와야 함
		
		int index = emptyIndex(); // emptyIndex 메소드의 return 값을 받아 index 라는 변수에 저장한다.
		
		if(index == -1) { // -1일 시 return 값 반환 -> 
			return "회원가입 불가능(인원 수 초과)";
		}
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
			System.out.print("지역 : ");
			String memberRegion = sc.next();
		
			if( memberPw.equals(memberPwCheck) ) {
			// 새로운 Member 객체를 생성해서, 할당된 주소를 memberArr 의 빈 인덱스에 대입
			memberArr[index] = new Member(memberId, memberPw, memberName, memberAge, memberRegion);
			return "회원 가입 성공!";
			}
			else { // 비밀번호 불일치
			return "회원 가입 실패!!(비밀번호 불일치)";	
			}
	}
	
		public int emptyIndex() { // 아래 signUp 메소드의 사이드 메소드
			// 클린 코딩을 위함(= 헬퍼 메소드), 메인 기능은 아니나 다른 메소드의 기능 등을 수행하기 위한 메소드
			// memberArr의 비어 있는 인덱스 번호를 반환하는 역할
			// 단 빈 인덱스가 없다면 -1 반환
			
			for (int i = 0; i < memberArr.length; i++) { // memberArr에서 빈 인덱스 검색 -> 현재 인덱스 요소의 참조값이 null 인 겅우 인덱스 반환
				if(memberArr[i] == null) {
					return i;
					// return : 해당 메소드를 '종료'하고 호출한 곳으로 값을 가지고 돌아감
				}
			}
			return -1; // for 문이 끝날 때까지( = 모든 인덱스를 검색할 때까지) 비어 있는 인덱스를 찾지 못했을 때 -1 반환
		}
	
	public String login() {
		System.out.println("\n===== 로그인 =====");
		
		// 1. Id, Pw 입력 받기
		System.out.print("아이디 : ");
		String memberId = sc.next();
		System.out.print("비밀번호 :");
		String memberPw = sc.next();
		
		// 2. memberArr 배열 내 요소를 순서대로 접근하여,
		 // 2-1. 현재 접근한 요소가 null 이 아닌지 확인하고 (null 인 값에 접근하면 NullPointExeption 에러 발생)
		 // 2-2. null 이 아니라면 회원 정보를 확인한다.
		
		for(int i = 0; i < memberArr.length; i++) {
			
			if(memberArr[i] != null) { // 회원 정보가 있는 경우, 있다면 계속
				
				// 2-3. 아이디 및 비밀번호가 동시에 일치하는지 확인
				if( memberArr[i].getMemberId().equals(memberId) && memberArr[i].getMemberPw().equals(memberPw) ){
				
				// 2-4. 아이디 및 비번 일치할 시 ,
				//		로그인 회원 정보 객체를 참조할 변수 loginMember 에 현재 접근중인 memberArr[i] 요소 내
				// 		저장된 주소를 얕은 복사
					
				loginMember = memberArr[i]; 
				
				// 더 이상 같은 아이디 및 비번은 필요 없기에 break;
				break;
				
				}
			}
		} //for 문 종료
		
		// 3. 로그인 성공/실패 여부 따라 결과 값 반환
		
		if(loginMember == null) { // loginMember 가 null -> 아이디 및 비밀번호가 아무것도 일치하지 않았다는 뜻
			return "아이디 또는 비밀번호가 일치하지 않습니다";
		}
		
		else {
			return loginMember.getMemberName() + " 님. 환영합니다.";
		}
		
	}
	
	public void searchRegion() { // 반환값 없음
		
		// 회원 지역 검색하여 출력
		
		System.out.println("===회원 검색(지역)===");
		System.out.print("검색할 지역을 입력하세요 : ");
		String inputRegion = sc.next();
		
		// 1. memberArr 배열의 모든 요소에 순차 접근
		boolean flag = true; // 검색 결과 신호용 변수
		
		for(int i = 0; i < memberArr.length; i++) {
			
			// 2. memberArr[i] 요소가 null 인 경우 반복 종료, 밑의 3. 보다 먼저 실행되어야 한다.
			if(memberArr[i] == null) {break;
			}
		
			// 3. memberArr[i] 요소가 null 이 아니라면 memberArr[i] 요소에 저장된 지역(region)이 
			//	  입력받은 지역(inputRegion)과 같을 경우 memberArr[i] 요소에 저장된 객체의 아이디, 이름 출력
			if( memberArr[i].getRegion().equals(inputRegion) ) {
				System.out.printf("아이디 : %s, 이름 : %s\n", memberArr[i].getMemberId(), memberArr[i].getMemberName() );
				flag = false; // 찾았다는 신호
			}				
		}
		
		// 4. for 문 끝나고, 입력한 지역과 일치 회원이 없을 때
		if(flag) {
			System.out.println("일치하는 검색 결과가 없습니다.");
		}
	}
	
	// 회원 정보 조회 메소드
	public String selectMember() {
		System.out.println("\n=====회원 정보 조회=====");

		// 1. 로그인 여부 확인 - 필드 loginMember 가 참조하고 있는 객체 있는지 확인
		//	  loginMember == null 이라면 아직 로그인하지 않은 상태
		
		if(loginMember == null) {
			return "로그인 후 이용 바람"; // 아래 코드 거치지 않고 바로 되돌아감
		}
		
		// 2. 로그인 되어 있는 경우 - 현재 로그인한 회원 정보를 출력할 문자열 만들어서 반환
		String str = "이름 :" + loginMember.getMemberName();
		str += "\n아이디 :" + loginMember.getMemberId();
		str += "\n나이 :" + loginMember.getMemberAge();
		str += "\n지역 :" + loginMember.getRegion();
		return str;
	}
	
	public int updateMember() {
		System.out.println("\n=====회원 정보 수정=====");
	
		// 1. 로그인 여부 확인
		if(loginMember == null) {
			return -1;
		}	
		
		// 2. 로그인 되어 있을 때
			System.out.print("수정할 이름 입력 : ");
			String inputName = sc.next();
			
			System.out.print("수정할 나이 입력 : ");
			int inputAge = sc.nextInt();
			
			System.out.print("수정할 지역 입력 : ");
			String inputRegion = sc.next();


			
		// 3. 비밀번호를 입력 받아, 일치할 시, 로그인한 회원의 정보를 입력받은 값으로 변경 후 1 반환, 같지 않을 시 0 반환
			
			System.out.print("비밀번호 입력: ");
			String inputPw = sc.next();
			
			if( inputPw.equals(loginMember.getMemberPw())) {
				loginMember.setMemberName(inputName);
				loginMember.setMemberAge(inputAge);
				loginMember.setRegion(inputRegion);
				
				return 1;
				
			} else {
				return 0;
			}
		
		
	}
}
