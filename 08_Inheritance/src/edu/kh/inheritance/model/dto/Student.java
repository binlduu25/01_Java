package edu.kh.inheritance.model.dto;

/*
 * Object
 *    ㄴ Person
 *          ㄴ Student
 * */

// 			  자식   extends   부모
public class Student extends Person{
	// Student 클래스에 Person 클래스 내용을 확장한다/연장한다
	// == Student 클래스에 Person 클래스의 
	//    필드, 메서드를 추가하여 확장한다
	
	// 속성
//	private String name;
//	private int age;
//	private String nationality;
	private int grade; 		// 학년
	private int classroom; 	// 반
	
	public Student() {}
	
	
	
	
	
	public Student(String name, int age, String nationality, int grade, int classroom) {
		
		// super() 에 관해
		
		super(name, age, nationality); // -> // super : 부모인 person 의 생성자를 받아 student 객체 안에 생성해주고, 부모의 매개변수인 name, age, nationality 도 사용할 수 있게 해준다.
		
		// setName(name); 과 같이 부모의 setter 메소드를 이용해 초기화는 가능하나, 하나하나 모두 지정해줘야 하기에 비효율적이므로 super 를 사용
		// 또한 super 생성자는 생성자 구문 내 반드시 '첫 줄'에 위치하여야 함
		
//		this.name = name; // 오류가 뜨는 이유 -> 부모 것을 상속 받았다 해도 클래스 내에 별도로 정의되어 있지 않기 때문
						  // 즉, this 참조변수는 본인 자신만을 의미하기 때문 자기 자신에게 실제로 할당된 값만 참조 -> 직접 접근 불가
//		this.age = age;
//		this.nationality = nationality;
		this.grade = grade;
		this.classroom = classroom;
	}

//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public int getAge() {
//		return age;
//	}
//	public void setAge(int age) {
//		this.age = age;
//	}
//	public String getNationality() {
//		return nationality;
//	}
//	public void setNationality(String nationality) {
//		this.nationality = nationality;
//	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public int getClassroom() {
		return classroom;
	}
	public void setClassroom(int classroom) {
		this.classroom = classroom;
	}





	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	
	
	
	
}



