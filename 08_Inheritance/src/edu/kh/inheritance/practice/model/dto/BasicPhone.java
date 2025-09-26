package edu.kh.inheritance.practice.model.dto;

public class BasicPhone extends Phone {

	private boolean hasPhysicalKeyboard; // 물리적 키보드 보유 유무

	public BasicPhone() {
	}

	public BasicPhone(String brand, String model, int year, int price, boolean hasPhysicalKeyboard) {
		super(brand, model, year, price);
		this.hasPhysicalKeyboard = hasPhysicalKeyboard;
	}

	public boolean isHasPhysicalKeyboard() {
		return hasPhysicalKeyboard;
	}

	public void setHasPhysicalKeyboard(boolean hasPhysicalKeyboard) {
		this.hasPhysicalKeyboard = hasPhysicalKeyboard;
	}

	public void checkKeyboard() {
		if (hasPhysicalKeyboard) {
			System.out.println("물리적 키보드 보유");
		}else {
			System.out.println("물리적 키보드 미보유");
		}
	}
	
	@Override
	public void printInfo() {
		// TODO Auto-generated method stub
		super.printInfo();
		checkKeyboard();
	}

	

}
