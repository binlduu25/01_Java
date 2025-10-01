package edu.kh.collection.practice.model.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import edu.kh.collection.practice.model.dto.Animal;
import edu.kh.collection.practice.model.dto.Monkey;
import edu.kh.collection.practice.model.dto.Tiger;

public class Zoo {

	public Zoo() {}
	
	Scanner sc = new Scanner(System.in);
	
	private List<Animal> animals = new ArrayList<>();
	
	public void addAnimal(Animal animal) {
		
		animals.add( new Tiger("호랑이") );
		animals.add( new Monkey("원숭이") );	
	}
	
	public void displayMenu(){
		System.out.println("==== 컬렉션 예제 2 ====");
		System.out.println("원하는 작업을 선택하세요 : ");
		System.out.println("1. 동물들의 울음소리 듣기");
		System.out.println("2. 종료");
		System.out.print("선택 : ");
		int input = sc.nextInt();
		
		switch(input) {
		case 1 : showAnimals(); break;
		case 2 : System.out.println("프로그램을 종료합니다."); break;
		default : System.out.println("잘못된 입력입니다."); 
		}
	}
		public void showAnimals() {
			
			Animal ti = new Tiger();
			Animal mon = new Monkey();
			
			addAnimal(ti);
			addAnimal(mon);
			
			System.out.print( animals.get(0).getName() + "의 울음 소리 : "); 
			ti.sound();	
			System.out.print( animals.get(1).getName() + "의 울음 소리 : "); 
			mon.sound();	
		}

	/* 
	
	※ teacher
	
	import java.util.ArrayList;
	import java.util.List;
	import java.util.Scanner;

	import com.hw2.model.dto.Animal;

	public class Zoo {
	
		private List<Animal> animals; // <- 필드 초기화. 현재 상태는 null 값이다.
		
		public Zoo() {	// 1. 기본 생성자에서 컬렉션 생성?? // ※ 이해 필요
			animals = new ArrayList<Animal>(); 
		}
	
		public void addAnimal(Animal animal) { // 2. 생성된 컬렉션에서 각 객체 추가?? // ※ 이해 필요
			animals.add(animal); 
		}
		
		public void showAnimals() { // <- 향상된 for 문 이용하여 기 생성된 Animal 타입(자료형) 내 animal 각 객체를? animals 컬렉션 순서에 따라 나열
			System.out.println("동물들의 울음소리를 들어보세요~");
			for(Animal animal : animals) { 
				animal.sound();
			}
		}
		
		public void displayMenu() {
			
			Scanner sc = new Scanner(System.in);
			
			int menuNum = 0;
			do { // do while 사용
				System.out.println("***** KH 동물원 ******");
				System.out.println("원하는 작업을 선택하세요");
				System.out.println("1. 동물들의 울음소리 듣기");
				System.out.println("2. 종료");
				System.out.print("선택 : ");
				
				menuNum = sc.nextInt();
				
				switch(menuNum) {
				case 1 : showAnimals(); break;
				case 2 : System.out.println("프로그램 종료합니다"); break;
				default : System.out.println("잘못된 선택입니다. 다시 선택해주세요...");
				}
					
			} while( menuNum != 2);
			
		}
	
	}	 
	*/
		
		
		
}
	
	
	
	
	

