package edu.kh.oop.practice.model.service;

import edu.kh.oop.practice.model.vo.Hero;

public class HeroService {

	public void heroPractice(){
		
	// 1,2) 매개변수 이용하여 객체 2개 생성	
	Hero hero1 = new Hero("이구역짱", "전사", 200, 20, 1, 0.0);
	Hero hero2 = new Hero("지존위저드", "마법사", 100, 100, 1, 0.0);
	
	System.out.println(hero1);
	System.out.println(hero2);

	hero1.attack((int)((Math.random() + 1) * 100));
	hero1.attack((int)((Math.random() + 1) * 100));
	hero1.attack((int)((Math.random() + 1) * 100));
	hero1.attack((int)((Math.random() + 1) * 100));
	hero1.attack((int)((Math.random() + 1) * 100));
	hero1.attack((int)((Math.random() + 1) * 100));
	hero1.attack((int)((Math.random() + 1) * 100));
	
		
		
	
	}
}
