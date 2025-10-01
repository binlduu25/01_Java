package edu.kh.ex2.model.dto;

public class Fish extends Animal{
	
		public Fish() {}
		
		public Fish(String eat, String eatType) {
			super(eat, eatType);
		}
	
	
	
		@Override
		public void eat() { System.out.println("입을 뻐끔");
		}
		@Override
		public void breath() { System.out.println("아가미 호흡");
		}
		@Override
		public void move() { System.out.println("헤엄");
		}

		@Override
		public String toString() {
		return "Fish : " + super.toString();
		}
}
