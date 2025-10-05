package poppyplaytime.model.service;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import poppyplaytime.model.dto.Toy;
import sun.jvm.hotspot.tools.SysPropsDumper;

public class ToyFactory {

	Scanner sc = new Scanner(System.in);
	
	Set<Toy> toyList = new LinkedHashSet<>();
	
	Map<Integer, String> material = new HashMap<>();
	
	
	
	public ToyFactory() {
		
		toyList.add(new Toy("마미롱레그", 8, 36000, "분홍색", "19950805") );
		toyList.add(new Toy("허기워기", 5, 12000, "파란색", "19940312") );
		toyList.add(new Toy("키시미시", 5, 15000, "분홍색", "199400505") );
		toyList.add(new Toy("캣냅", 8, 27000, "보라색", "19960128") );
		toyList.add(new Toy("파피", 12, 57000, "빨간색", "19931225") );
	}
	
	public void Material() {
		material.put(1, "면직물");
		material.put(2, "플라스틱");
		material.put(3, "유리");
		material.put(4, "고무");
	}
	
	public void displayMenu() {
		
		System.out.println("<< 플레이타임 공장 >>");
		
		System.out.println("1. 전체 장난감 조회하기");
		System.out.println("2. 새로운 장난감 만들기");
		System.out.println("3. 장난감 삭제하기");
		System.out.println("4. 장난감 제조일 순으로 조회하기");
		System.out.println("5. 연령별 사용 가능한 장난감 리스트 조회하기");
		System.out.println("6. 재료 추가");
		System.out.println("7. 재료 삭제");
		System.out.println("0. 프로그램 종료");
	}
	
	public String addMaterial() {
		
		
	}
	
	public void test() {
		
		System.out.println(material);
	}
}
