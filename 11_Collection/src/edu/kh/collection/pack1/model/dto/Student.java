package edu.kh.collection.pack1.model.dto;

public class Student implements Comparable<Student> {

	// 속성
	 private String name;
	 private int age;
	 private String region;
	 private char gender;
	 private int score;
	 
	 public Student() {}
	 public Student(String name, int age, String region, char gender, int score) {
		 this.name = name;
		 this.age = age;
		 this.region = region;
		 this.gender = gender;
		 this.score = score;
	 }
	 public String getName() {
		 return name;
	 }
	 public void setName(String name) {
		 this.name = name;
	 }
	 public int getAge() {
		 return age;
	 }
	 public void setAge(int age) {
		 this.age = age;
	 }
	 public String getRegion() {
		 return region;
	 }
	 public void setRegion(String region) {
		 this.region = region;
	 }
	 public char getGender() {
		 return gender;
	 }
	 public void setGender(char gender) {
		 this.gender = gender;
	 }
	 public int getScore() {
		 return score;
	 }
	 public void setScore(int score) {
		 this.score = score;
	 }
	 
	 @Override
	 public String toString() {
		return "Student [name=" + name + ", age=" + age + ", region=" + region + ", gender=" + gender + ", score="
				+ score + "]";
	 }
	 
	 @Override
	public int compareTo(Student o) {
		// compareTo() : 두 객체를 비교해 순서를 결정하는 메소드
		 // 반환값 : 
		 	// 1) 0(같음)
		 	// 2) 양수(왼쪽 객체가 더 큼)
		 	// 3) 음수(왼쪽 객체가 더 작음)
		 
		return this.age - o.age;
		
		// o 는 other 의 'o'
		// this는 현재 객체
		 // 즉 둘을 비교해 정렬해줌
		 // 현재는 나이를 기준으로 오름차순 정렬 (작 -> 큰)
		 // 내림차순 정렬을 하고 싶다면, 둘 순서를 바꿔주면 됨
		 // o.age - this.age;
	}
	 
	
	
}
