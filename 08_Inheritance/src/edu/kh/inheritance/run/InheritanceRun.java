package edu.kh.inheritance.run;

import edu.kh.inheritance.model.service.InheritanceService;
import edu.kh.inheritance.practice.model.dto.BasicPhone;
import edu.kh.inheritance.practice.model.dto.SmartPhone;

public class InheritanceRun {

	public static void main(String[] args) {
		
		
		InheritanceService service = new InheritanceService();
		
		// service.ex1();
		// service.ex2();
		// service.ex3();
	
		BasicPhone bp = new BasicPhone("Nokia","3310",2000,100000,true);
		SmartPhone sp = new SmartPhone("samsung","galaxy 20", 2020,1200000,"Android",128);
		
		//		sp.printInfo();
		//		System.out.println();
		//		System.out.println("===============");
		//		bp.printInfo();
		
		// 향상된 for 문
		
			// - 자바에서 배열, 컬렉션과 같은 데이터를 순차적으로 간단하게 반복할 수 있는 구조 제공	
			// 반복 작업을 더 쉽게 작성할 수 있다
		
			// for(자료형 변수명 : 배열 또는 컬렉션){}
		
		for(Student std : students) {
			
		}
		
	}

}