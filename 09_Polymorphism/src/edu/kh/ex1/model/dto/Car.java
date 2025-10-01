package edu.kh.ex1.model.dto;

public class Car /*extends Objects*/{

	// 속성
	
		private String engine;
		private String fuel;
		private int wheel; // 바퀴 갯수

	// 기능

		// 기본생성자
		
		public Car() {
		}
	
		// 매개변수 생성자
		
		public Car(String engine, String fuel, int wheel) {
			this.engine = engine;
			this.fuel = fuel;
			this.wheel = wheel;
		}
	
		// getter/ setter
		
		public String getEngine() {
			return engine;
		}
	
		public void setEngine(String engine) {
			this.engine = engine;
		}
	
		public String getFuel() {
			return fuel;
		}
	
		public void setFuel(String fuel) {
			this.fuel = fuel;
		}
	
		public int getWheel() {
			return wheel;
		}
	
		public void setWheel(int wheel) {
			this.wheel = wheel;
		}
	
		// to.String 오버라이딩
		
		@Override
		public String toString() {
			return engine + " / " + fuel + " / " + wheel;
		}
	
	
	
}