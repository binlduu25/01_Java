package edu.kh.ex1.model.dto;

public class Tesla extends Car {

	// 속성
	
		private int batteryCapacity;

	//기능
	
		// 기본 생성자
		
		public Tesla() {
		}
	
		// 매개변수 생성자
		
		public Tesla(String engine, String fuel, int wheel, int batteryCapacity) {
			super(engine, fuel, wheel); // 부모로부터 상속받은 변수
			this.batteryCapacity = batteryCapacity;
		}
	
		// getter / setter
		
		public int getBatteryCapacity() {
			return batteryCapacity;
		}
	
		public void setBatteryCapacity(int batteryCapacity) {
			this.batteryCapacity = batteryCapacity;
		}
		
		// 오버라이딩
		
		@Override
		public String toString() {
			return super.toString() // 해당 오버라이딩은 Object 클래스가 아닌 Car 클래스임 (부모가 Car)
					+ " / " + batteryCapacity;
		}

}
