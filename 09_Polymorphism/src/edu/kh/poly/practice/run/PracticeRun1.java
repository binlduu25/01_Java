package edu.kh.poly.practice.run;

import edu.kh.poly.practice.model.dto.Book;
import edu.kh.poly.practice.model.dto.Novel;
import edu.kh.poly.practice.model.dto.Poetry;
import edu.kh.poly.practice.model.dto.Textbook;

public class PracticeRun1 {

	public static void main(String[] args) {
		
		Book [] arr = new Book [3];
		
		arr[0] = new Novel("해리 포터","JK 롤링","판타지");
		arr[1] = new Textbook("자바 프로그래밍", "제임스 고슬링", "컴퓨터과학");
		arr[2] = new Poetry("우리들의 사랑시", "김소월", 30);
		
		arr[0].displayInfo();
		arr[1].displayInfo();
		arr[2].displayInfo();
		
		
	}
	
}
