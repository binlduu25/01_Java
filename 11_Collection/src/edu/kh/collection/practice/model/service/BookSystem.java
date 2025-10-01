package edu.kh.collection.practice.model.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import edu.kh.collection.practice.model.dto.Book;

public class BookSystem {

	private Scanner sc = new Scanner(System.in);
	
	private List<Book> books = new ArrayList<>();
	
	public BookSystem() { // 필드 값 초기화
		
		books.add( new Book(1001, "세이노의 가르침", "세이노", 6480, "데이원") );
		books.add( new Book(2006, "문과 남자의 과학 공부", "유시민", 15750, "돌베개") );
		books.add( new Book(3008, "역행자", "자청", 17550, "웅진지식하우스") );
		books.add( new Book(4001, "꿀벌의 예언", "베르나르 베르베르", 15120, "열린책들") );
		books.add( new Book(4009, "도둑맞은 집중력", "요한 하라", 16920, "어크로스") );
	}
	
	public void displayMenu() {
		
		int menuNum = 0;
		do {
			System.out.println("=== 도서 목록 프로그램 ===");
			System.out.println("1. 도서 등록");
			System.out.println("2. 도서 조회");
			System.out.println("3. 도서 수정");
			System.out.println("4. 도서 삭제");
			System.out.println("5. 즐겨찾기 추가");
			System.out.println("6. 즐겨찾기 삭제");
			System.out.println("7. 즐겨찾기 조회");
			System.out.println("8. 추천도서 뽑기");
			System.out.println("0. 프로그램 종료");
			System.out.print("메뉴 입력 : ");
			menuNum = sc.nextInt();			
			
			switch(menuNum) {
			case 1 : /*bookRegister()*/ break;
			case 2 : /*bookInfo()*/ break;
			case 3 : /*bookUpdate()*/ break;
			case 4 : /*bookRemove()*/ break;
			case 5 : /*addBookmark()*/ break;
			case 6 : /*removeBookmark()*/ break;
			case 7 : /*infoBookmark()*/ break;
			case 8 : /*drawBookmark()*/ break;
			case 0 : System.out.println("프로그램을 종료합니다."); break;
			}
		}
			
		
		while(menuNum != 0);		
	}
	
	public void 
	
	
}
