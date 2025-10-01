package edu.kh.exception.model.service;


// 사용자 정의 예외 클래스
// 사용자 정의 예외 클래스를 작성할 땐 Exception 무조건 상속받아야 함

public class UserException extends Exception{ 

	public userException() {
		
	}

	public UserException(String message) {
		super(message);
	}
	
}
