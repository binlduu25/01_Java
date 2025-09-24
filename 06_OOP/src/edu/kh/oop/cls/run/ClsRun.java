package edu.kh.oop.cls.run;

import edu.kh.oop.abstraction.model.service.ClsService;
import edu.kh.oop.cls.model.vo.Student;

public class ClsRun {
public static void main(String[] args) {
	
	Student runStd = new Student();

		// runStd.ex1();
		// runStd.ex2();
	
	ClsService runUser = new ClsService(); // 생성자 테스트
		
		// runUser.ex3();
		runUser.ex4();
}
}
