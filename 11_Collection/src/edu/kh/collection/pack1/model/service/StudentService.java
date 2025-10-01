package edu.kh.collection.pack1.model.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import edu.kh.collection.pack1.model.dto.Student;

public class StudentService {

	private Scanner sc = new Scanner(System.in);
	
	public StudentService() { // 기본 생성자 // run 에서 기본생성자 객체 생성 시 바로 불러올 수 있는 용도
		studentList.add( new Student("홍길동", 23, "서울시 중구,", 'M', 100) );
		studentList.add( new Student("유병재", 25, "서울시 관악구,", 'M', 95) );
		studentList.add( new Student("장동민", 38, "용인시 처인구,", 'M', 28) );
		studentList.add( new Student("오미나", 25, "부산시 북구,", 'F', 65) );
		studentList.add( new Student("강하늘", 28, "경기도 안산,", 'F', 99) );
	}
	
	// 학생 정보를 저장할 List 생성
	private List<Student> studentList = new ArrayList<>(); // Student 내 정의된 것만 List에 포함시키겠다.
	
	/**
	 * 메뉴 출력용 메소드
	 * 해당 메소드에 대한 설명을 여기에 기록한다.
	 * alt + shift + j : 메소드 설명용 주석 만드는 단축키
	 * @author : 해당 메소드 만든 사람의 정보 등 기록
	 * 아래 'displayMenu 위에 마우스 올려놓으면 팝업창 생성되고, 해당 부분이 보인다.
	 */
	public void displayMenu() {
		int menuNum = 0; // 메뉴 선택용 변수
		
		do {
			
			try {
				System.out.println("\n======학생 관리 프로그램=======");
				System.out.println("1. 학생 정보 추가");
				System.out.println("2. 학생 정보 전체 조회");
				System.out.println("3. 학생 정보 수정");
				System.out.println("4. 학생 정보 제거");
				System.out.println("5. 이름으로 검색(완전 일치)");
				System.out.println("6. 이름으로 검색(포함)");
				System.out.println("7. 나이순으로 정렬"); // comparable 사용
				System.out.println("8. 이름순으로 정렬"); // comparator 사용
				System.out.println("0. 프로그램 종료");
				System.out.print("메뉴 번호 선택 : ");
				menuNum = sc.nextInt();
				sc.nextLine(); // 입력버퍼 개행문자 제거용
				
				switch (menuNum) {
				case 1 : System.out.println( addStudent() ); break; // String 반환이므로 프린트 구문 안에서 호출
				case 2 : selectAll(); break;
				case 3 : System.out.println(updateStudent()); break;
				case 4 : System.out.println(removeStudent()); break;
				case 5 : searchName1(); break;
				case 6 : searchName2(); break;
				case 7 : sortByAge(); break;
				case 8 : sortByName(); break;
				case 0 : System.out.println("프로그램 종료");break;
				default : System.out.println("메뉴에 작성된 번호만 입력하세요.");
				}
				
			}catch (InputMismatchException e) { // try, catch 를 통한 예외 처리
				System.out.println("\nerror : 입력형식이 유효하지 않습니다.\n다시 시도해주세요.");
				sc.nextLine(); // 입력버퍼 남아 있는 잘못된 코드 + 개행문자 제거
				menuNum = -1; // 첫 반복 시 잘못 입력하는 경우, menuNum 이 초기값 그대로인 0을 가지고 있기에
							  // 아래 while 문이 종료되는 것을 방지하기 위해 임의 값 -1 을 대입한다.
			}
		}
		while(menuNum != 0);
		
	}
	
	/**
	 * 1. 학생 정보 추가 메소드
	 * 
	 * @return 삽입 성공 시 "성공", 실패 시 "실패" 문자열 반환
	 */
	public String addStudent() {
		// 만약 해당 메소드에서 아래 int 형 입력란에 String 등을 입력 시, displayMenu() 메소드의 try catch 예외 발생전파가 발생한다.
		
		// UncheckedException : 강제 처리 x, 예외 발생 시
		 // 자동으로 상위 호출 메소드로 예외가 전파됨.
		 // 즉, InputMismatchException, NullPointerException.. 등
		
		// CheckedException : 반드시 throws 구문이나 try-catch 로 처리를 강제해야 한다.
		 // IOException, SQLException.. 등
		
		System.out.println("======학생 정보 추가=======");
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		sc.nextLine(); // int 형 입력 다음 String 입력이므로 개행문자 제거
		
		System.out.print("지역 : ");
		String region = sc.nextLine();
		
		System.out.print("성별(M/F) : ");
		char gender = sc.next().charAt(0); // 'M' OR 'F
		
		System.out.print("점수 : ");
		int score = sc.nextInt();
		
		// Student 새 객체 생성 후 StudentList에 추가
		
		// 방법1.
			// Student std = new Student(name, age, region , gender, score);
			// studentList.add(std); // <- 이때, add 메소드는 boolean 값이다.
			// 위에서, 성공 또는 실패를 반환해야 하므로, if 문으로 또 변수값을 만들어 사용하면 된다.
			// 하지만 코드가 길어지므로 아래처럼 한 줄로 가능한 형태로 변환
		
		// 방법2.
			if(studentList.add( new Student(name, age, region , gender, score))) { // 객체를 생성하고, 추가하고, if 문에서 성공 여부까지 한꺼번에 검사
				// 객체 배열이었다면 배열에 남은 공간이 있는지 검사부터 했어야 하지만 List 를 사용하면 바로 사용 가능
				return "성공";
			}
			else { 
				return "실패";
			}
		
		
	}
	
	/**
	 * 2. 학생 정보 전체 조회 메소드
	 * 반환 타입 없음
	 * List 가 비어 있는 경우 "학생 정보가 없습니다" 출력
	 * 비어 있지 않은 경우 전체 학생 출력 
	 */
	public void selectAll() {
		
		System.out.println("=====학생 전체 조회=====");
		
		// 먼저 List 가 비어 있는지 확인한다.
		// List 에 저장된 데이터 개수를 반환하는 메소드가 있다. 
		 // int List.Size()
		  // 방법 1. if(studentList.size() == 0) 
		  // 방법 2. boolean List.isEmpty() : 컬렉션이 비어 있다면 true 반환
		
		if(studentList.isEmpty()) {
			System.out.println("학생 정보가 없습니다");
			return; // 현재 메소드 종료 후 호출한 곳으로 돌아감
		}
		
		// 위 if 문에서 false일 시 아래 코드로 도달
		// 반복문 이용하여 studentList 내 전체 학생 정보 출력
		
		 // 방법 1. 일반 for 문
		
			// for(int i = 0; i < studentList.size(); i++) { // 배열과 달리 .length 사용하지 않는다
			//	System.out.println( studentList.get(i));
			//	}
		 
		 // 방법 2. 향상된 for 문
			// - 컬렉션, 배열의 모든 요소를 순차적으로 반복접근할 수 있다.
		
			int index = 1;
			for(Student std : studentList) {
				System.out.print( ++index + "번 : " + std);
			}
		
	}
	
	/** 
	 * 3. 학생 정보 수정 메소드
	 * - 학생 정보가 studentList에 하나라도 있는지 검사 후 없다면
	 *  "입력된 학생정보가 없습니다" 문자열 반환 
	 *  
	 * - 인덱스 번호로 선택하여 학생을 수정
	 * 입력된 숫자가 0보다 작은지 검사, 작다면 "음수는 입력할 수 없습니다" 반환
	 * 
	 * - studentList 범위 내 인덱스번호인지 검사 후 이상이라면
	 * "범위를 넘어선 값을 입력할 수 없습니다" 반환
	 * 
	 * - 수정할 때
	 * 3-1. index 번째에 저장된 학생정보를
	 * 수정 전에 한번 출력
	 * 
	 * 3-2. 이름, 나이, 사는 곳, 성별, 점수 의 수정할 값 입력 받기
	 * 
	 * 3-3. 수정 완료 시, "000의 정보가 변경되었습니다" 반환
	 * 
	 * @return
	 */
	public String updateStudent() {
		
		System.out.println("=====학생 정보 수정=====");
		if(studentList.isEmpty()) {
			return "입력된 학생정보가 없습니다.";
		}
		
		System.out.print("인덱스 번호 : ");
		int index = sc.nextInt();
		
			if( index < 0 ) { 
				return "음수는 입력할 수 없습니다.";
			}
			if ( index > studentList.size() ) {
				return "범위를 넘어선 값을 입력할 수 없습니다.";				
			}
			
			// 수정 코드 작성
			 
			 // 1. index 번째에 저장된 학생 정보 출력
				System.out.println(index + "번째에 저장된 학생 정보");
				System.out.println(studentList.get(index));
				
			 // 2. 수정할 내용 입력받기	
				System.out.print("이름 : ");
				String name = sc.nextLine();
				
				System.out.print("나이 : ");
				int age = sc.nextInt();
				sc.nextLine(); // int 형 입력 다음 String 입력이므로 개행문자 제거
				
				System.out.print("지역 : ");
				String region = sc.nextLine();
				
				System.out.print("성별(M/F) : ");
				char gender = sc.next().charAt(0); // 'M' OR 'F
				
				System.out.print("점수 : ");
				int score = sc.nextInt();
				
				// 입력받은 index 번째에 수정할 학생정보를 세팅
				 // 새 객체 생성하여 해당 인덱스에 덮어씌움
				Student temp = studentList.set(index, new Student(name, age, region, gender, score)); 
				// E(객체) List.set(int index, E e)
				 // -> 주어진 index 번째에 주어진 객체로 덮어씌움 + 기존 객체 반환
				 // -> 반환된 기존 객체의 정보(temp)를 이용
				return temp.getName() + "의 정보가 변경되었습니다.";
				
				
	}
	
	/**
	 *  4. 학생 정보 제거용 메소드
	 *  3의 학생 정보 수정 메소드와 동일한 검사 진행
	 *  그 후, 삭제 시 "정말 삭제하시겠습니까?(y/n)" 진행
	 *  y 입력 시 해당 인덱스 객체 삭제 후
	 *  "000님의 정보가 삭제되었습니다" 문자열 반환
	 *  n 입력 시 "취소" 반환
	 * @return
	 */
	public String removeStudent() {
		System.out.println("=====학생 정보 제거=====");
		if(studentList.isEmpty()) {
			return "입력된 학생정보가 없습니다.";
		}
		
		System.out.print("인덱스 번호 : ");
		int index = sc.nextInt();
		
			if( index < 0 ) { 
				return "음수는 입력할 수 없습니다.";
			}
			if ( index > studentList.size() ) {
				return "범위를 넘어선 값을 입력할 수 없습니다.";				
			}
			
		System.out.print("정말 삭제하시겠습니까? (Y/N) : ");
		char ch = sc.next().toUpperCase().charAt(0);
		// 문자열(String)으로 입력 받아, 대문자로 일괄 바꾸어, char 형태로 변환
		
		if(ch == 'Y') {
			// E List.remove(int index)
			// : 리스트에서 index 번째 요소 제거
			// 이 때 제거된 요소가 반환됨
			// * List 중간에 비어 있는 인덱스가 없게 하기 위해 remove() 동작 시 뒤쪽 요소를 한 칸씩 자동으로 당겨옴.
			
			Student temp = studentList.remove(index);
			return temp.getName() + "의 정보가 삭제되었습니다.";
		}
		return "취소";
	}
	
	/** 
	 * 5. 이름 일치하는 학생 찾아 조회하는 메소드(완전 일치)
	 * - 검색할 이름 입력 받아 studentList에서 꺼내온 Student 객체의 name 값 같은지 비교
	 * - 일치하는 경우 Student 객체 출력
	 * - 일치하는 게 없다면 검색결과 없다고 출력
	 */
	public void searchName1() {
		
		System.out.println("=====학생 검색(이름 완전 일치)=====");
		
		System.out.print("검색할 이름 입력 : ");
		String input = sc.next();
		
		boolean flag = true;
		
		// 향상된 for 문
		for(Student std : studentList) { 
			if(input. equals(std.getName())) {
				System.out.println(std);
				flag = false;
			}
		}
		
		if(flag) {
			System.out.println("검색 결과가 없습니다.");
		}
		
	}
	
	/**
	 * 6. 이름에 특정 문자열 포함되는 학생 찾아 조회하는 메소드
	 */
	public void searchName2() {
		
		System.out.println("=====학생 검색(이름 부분 일치)=====");
				
		System.out.print("검색할 이름 입력 : ");
		String input = sc.next();
		
		boolean flag = true;
		
			for(Student std : studentList) {
				
				// boolean String.contains(문자열)
				// String 에 문자열이 포함되어 있으면 true/false
				// std.getname() 안에 input 이 포함되어 있는가 ? true/false 
				if(std.getName().contains(input)) {
				flag = false; 	
				}
			}
			
			if(flag) System.out.println("검색 결과가 없습니다.");
	}
	
	/* List를 정렬하는 방법
	*
	* 방법 1: Comparable 인터페이스 상속받아 compareTo() 메서드 재정의
	* Student에 Comparable 인터페이스를 상속받아
	* 오버라이딩한 compareTo()에 정의한 대로 정렬됨 (나이 오름차순, 내림차순..)
	*
	* 방법 2: Comparator 클래스에 의한 정렬 compare() 사용 (익명 내부 클래스 이용)
	*
	* 익명 내부 클래스란?
	* 이름이 없는 클래스를 즉석에서 선언해서 한 번만 사용할 목적으로
	* 작성 객체를 생성하면서 바로 구현 내용을 정의할 수 있음
	*
	* <익명 내부클래스 장점>
	* 코드 간결화(별도로 클래스를 만들지 않아도 될 때 사용)
	* 즉시 사용(한 번만 사용할 Comparator 등을 정의할 때 유용함)
	* 지역화(특정 메서드 안에서만 필요할 때)
	*/

	
	/**
	 * 7. 나이에 따라 오름차순 정렬(Comparable 인터페이스 사용
	 */
	public void sortByAge() {
		
		Collections.sort(studentList); // 이 메소드를 이용하기 위해 Student 클래스에서 정렬 위한 작업이 필요함(해당 클래스 참고)
		
		for(Student std : studentList) {
			System.out.println(std);
		}
	}
	
	/**
	 * 8. 이름에 따라 오름차순 정렬
	 */
	public void sortByName() {
		
		Collections.sort(studentList, new Comparator<Student>() { // 중괄호 안의 내용으로 클래스를 정의하고 바로 객체를 생성한다는 의미
			
			@Override
			public int compare(Student o1, Student o2) {
				// 둘의 이름 비교
				 // name 은 String 형이라 compareTo()로 비교
				 // String.compareTo() : 자바에서 객체를 비교할 때 사용하는 메소드
				  // String 이 Comparable 을 상속받아 재정의해 둔 compareTo() 메소드를 이용하는 것
				  // -> 두 객체 비교 후 문자열 순서 결정
				return o1.getName().compareTo(o2.getName());
			}
		});
		
		for(Student std : studentList) {
			System.out.println(std);
		}
		
	}
	
	
	
	
	
}
