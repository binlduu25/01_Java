package edu.kh.oop.practice.model.controller;

import edu.kh.oop.practice.model.vo.SnackTeacher;

	//Controller : 사용자의 요청을 받아서 처리하고, 그 입력에 따라
	// Model(데이터처리, 비즈니스 로직)과 View(화면 출력)를 연결해주는 역할
	// 미완성

public class SnackControllerTeacher {

	// 필드
	
	private SnackTeacher s = new SnackTeacher();
	
	// 기본 생성자
	
	public SnackControllerTeacher () {}
	
	// 메소드
	
	// 데이터를 setter 를 이용하여 저장하고, 저장완료 결과를 반환하는 메소드
	
	public String saveData(String kind, String name, String flavor, int numOf, int price) {
		return null;
	}
	
	
	
	
}
