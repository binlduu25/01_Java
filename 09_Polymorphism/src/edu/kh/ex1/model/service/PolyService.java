package edu.kh.ex1.model.service;

import edu.kh.ex1.model.dto.Car;
import edu.kh.ex1.model.dto.Spark;
import edu.kh.ex1.model.dto.Tesla;

public class PolyService {

	// 다형성 확인 예제

	public void ex1() {

		// Car 객체 생성 -> 1-1)
		Car car = new Car();
		// Car(부모타입) car(참조변수) = new Car(부모객체주소);

		Tesla tesla = new Tesla(); // -> 1-2)
		// Tesla(자식타입) tesla(참조변수) = new Tesla(자식객체주소);

		// =========== 다형성 =================

		// 부모타입 참조변수 = 자식객체주소

		Car car2 = new Tesla(); // 오류 발생하지 않는다 // -> 1-3)
		// Tesla 객체를 참조하는 변수 타입이 Car(부모)이기 때문에
		// Tesla 객체가 Car(부모) 객체로 변화
		// - > 업 캐스팅

		Car car3 = new Spark(); // -> 1-4)
		// Spark 객체를 참조하는 변수 타입이 Car(부모)이기 때문에
		// Spark 객체가 Car(부모) 객체로 변화
		// -> 업 캐스팅

		// 1) 자식 객체가 부모 객체로 변화하였기 때문에, 자식만의 고유한 필드, 메소드를 사용할 수 없다.

		// 1-1) car ( 부모 = 부모 )
		car.setEngine("엔진");
		car.setFuel("휘발유");
		car.setWheel(3);
		// Car 본인의 메소드 모두 사용 가능

		// 1-2) tesla (자식 = 자식 )
		tesla.setEngine("전기"); // 부모 것 사용 가능
		tesla.setBatteryCapacity(10); // 본인 것 사용 가능

		// 1-3) car2 ( 부모 = 자식(Tesla))
		// car2.setBatteryCapacity; // <- 오류남. 현재 car2는 부모 객체로 변화했기 때문에 자식 객체인 Tesla 의
		// 필드 설정 불가
		car2.setEngine("엔진엔진"); // <- 반면 부모 본인의 필드는 가능

		// 1-4) car3 ( 부모 = 자식(Spark))
		// car3.setDiscountOffer(0.5); <- 오류남. 위와 같은 이유
		car3.setEngine("엔진어어");
		car3.setWheel(12); // 사용 가능

		// 즉, -> car2, car3 는 부모타입 참조변수(car)이기 때문에 Tesla , Spark와 같은 자식객체의 고유 필드, 메소드 사용
		// 불가
		// 컴파일러가 car 라고 인식하고 있기 때문

		// 2) 다형성을 이용한 객체배열

		Car[] arr = new Car[3];

		arr[0] = car; // Car 주소
		arr[1] = car2; // Car 타입 참조변수 = 자식(Tesla) 객체주소
		arr[2] = car3; // Spark 주소

		for (int i = 0; i < arr.length; i++) {
			System.out.println(i + "번째 인덱스의 엔진" + arr[i].getEngine());
		}

		// 상속 + 다형성
		// 상속 특징 : Car 상속 클래스는 get(Engine) 메소드를 이용할 수 있다.
		//

	}

	public void PrintCar(Car temp) { // 전달받은 Car 또는 자식객체의 엔진, 연료, 바퀴갯수 등을 출력하는 메소드

		// Car temp = c(Car)
		// Car temp = t(Tesla)
		// Car temp = s(Spark)

		// 부모타입 참조변수 = 자식타입객체
		// 다형성의 업캐스팅 모양과 똑같다
		// -> Car와 Spark / Tesla는 상속관계이기 때문에
		// 'temp' 라는 Car 타입 (부모타입) 매개변수를 지정해주고, 이에 Car, Tesla, Spark 주소 참조 가능

		System.out.println("엔진 : " + temp.getEngine());
		System.out.println("연료 : " + temp.getFuel());
		System.out.println("바퀴 : " + temp.getWheel());

	}

	public Car creatCar(int num) { // 매개변수로 전달받은 정수값에 따라 Car, Tesla, Spark 중 객체를 만들어 반환하는 메소드

		Car result = null; // 초기화 (참조형은 null)

		switch (num) {
		case 1:
			result = new Car();
			break;
		case 2:
			result = new Tesla();
			break;
		case 3:
			result = new Spark();
			break;
		}

		return result;
	}

	// 다형성(업캐스팅)]을 이용한 매개변수 사용법

	public void ex2() {

		Tesla t = new Tesla("전기모터", "전기", 6, 20030);
		Spark s = new Spark("경차엔진", "휘발유", 20, 5745);
		Car c = new Car("경유엔진", "경유", 12);

		PrintCar(t);
		PrintCar(s);
		PrintCar(c);

		// 다형성을 이용한 반환형 사용법
		// Car [] arr = { new Car(), new Tesla(). new Spark() };

		Car[] arr = { new Car(), new Tesla(), new Spark() };
					  // Car    //Car(Tesla)  //Car(Spark)

		// 객체가 어떤 타입(자료형)인지 검사하는 연산자
		// instanceof
		// -> 객체의 자료형 검사 연산자
		// -> 참조하는 객체가 특정 자료형이거나 상속관계인지 확인

		System.out.println(arr[1] instanceof Tesla); // true 자기 본인 맞음
		System.out.println(arr[1] instanceof Spark); // false -> Tesla 와 Spark 는 아무 관계 아님
		System.out.println(arr[1] instanceof Car); // Car인척하고 있으니까 true
	}

	public void ex3() { // 다형성 다운캐스팅 예제

		// 다운캐스팅이란?
		// 부모타입 참조변수가 자식객체를 참조하는 기술(업캐스팅)이 적용된 상태에서만 진행할 수 있다.
		// 부모타입을 자식타입으로 "강제 형변환" 해서
		// 자식객체의 본래 필드, 메소드를 사용 가능하게 한다.
		// 자식객체의 본래 필드, 메소드를 사용 가능하게 한다.

		Car c1 = new Tesla("전기모터", "전기", 4, 5000);
		// 현재는 업캐스팅 상태
		// 자식인 Tesla 가 부모인 Car 로 변환된 상태

		// 다운캐스팅

		// 방법 1.
		System.out.println(((Tesla) c1).getBatteryCapacity());
		// 주의사항
		// - "."은 연산자(Tesla)보다 우선순위가 높기에 Tesla와 c1을 소괄호로 묶어준 다음 진행한다.

		// 방법2.
		Tesla t1 = (Tesla) c1;
		System.out.println(t1.getBatteryCapacity());

	}

	public void ex4() { // 다운캐스팅 주의사항 확인 예제

		Car c1 = new Tesla();
		// 업캐스팅 상태 -> Tesla 객체를 만들어 Car 타입 참조변수 c1에 담음

		// Spark s1 = (Spark) c1;
		// c1 을 관계없느 Spark 로 다운캐스팅하려고 함
		// 하지만 다운캐스팅은 잘못 작성해도 컴파일 에러 발생 x - > 실행시 runtime 에러 발생
		// ClassException : 형변환 예외

		// 해결방법 : instanceof 와 같이 사용
		// 예외처리
		if (c1 instanceof Spark) { // c1이 Spark 이거나 상속관계인가?
			// 맞다면
			Spark s1 = (Spark) c1; // 다운캐스팅
			System.out.println("성공");

		} else { // 아니라면
			System.out.println("실패. c1은 Spark 타입/상속관계 아님");

		}

	}

	// 바인딩 확인 예제
	public void ex5() {
		// 바인딩(Binding)
		// 실제 실행할 메서드 코드와 호출하는 코드를 연결시키는 것.

		Car c1 = new Car("경유엔진", "경유", 8);

		System.out.println(c1.toString());
		// String edu.kh.poly.ex1.model.dto.Car.toString()
		// 반환형 출처
		// Car 객체에 있는 toString() 메서드를 호출
		// 프로그램 "실행 전"
		// 컴파일러는 toString() 메서드가 Car에 있는걸로 인식해서
		// c1.toString() 호출코드와
		// edu.kh.poly.ex1.model.dto.Car.toString() 메서드 선언부 코드를 연결
		// -> 정적 바인딩

		// ** 다형성 적용 시 바인딩 **
		Car c2 = new Spark("경차엔진", "휘발유", 4, 0.5);
		// 업캐스팅 적용 상태 -> 부모 부분만 참조 가능 상태

		System.out.println(c2.toString());
		// String edu.kh.poly.ex1.model.dto.Car.toString()
		// c2가 Car타입이므로 toString() 호출부가
		// Car.toString() 메서드와 연결
		// -> 정적바인딩
		
			
		// 실행해보면 자식(Spark)의 toString() 호출되는 것을 확인
		// -> 컴파일 시에는 부모(Car)와 바인딩 == 정적바인딩
		// -> "실행 시"에는 Spark에 오버라이딩된 toString()이
		// 우선시 되어 Spark 메서드와 바인딩
		// == 동적바인딩

	}

}
