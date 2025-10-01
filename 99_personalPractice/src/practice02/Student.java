package practice02;
// 종합 예제 - 학생 성적 관리

public class Student {

	/*
	 * 1. 문제
	 * 
	 * 1-1. 클래스 설계 (OOP)
	 * 
	 * Student 클래스를 작성한다. 멤버 변수: 이름(String), 점수(int[] 과목별 점수)
	 * 
	 * 1-2. 메소드
	 * 
	 * setScore(int index, int score) : 특정 과목 점수 입력 getTotal() : 총점 반환 getAverage()
	 * : 평균 반환 printInfo() : 학생 이름, 점수 목록, 총점, 평균 출력
	 * 
	 * 1-3. 변수 & 배열
	 * 
	 * 프로그램 시작 시 사용자로부터 학생 수, 과목 수를 입력받는다. Student[] (객체 배열)을 사용하여 모든 학생 객체를 저장한다.
	 * 또한 int[][] (2차원 배열)을 사용하여 전체 학생들의 점수를 저장한다.
	 * 
	 * 1-4. 입력 (제어문 활용)
	 * 
	 * 반복문(for)을 이용해 모든 학생의 이름과 점수를 입력받는다. 조건문(if)을 이용해 평균 점수에 따라 성적 등급(A~F)을 판정한다.
	 * 90점 이상: A 80점 이상: B 70점 이상: C 60점 이상: D 그 외: F
	 * 
	 * 1-5. 출력 모든 학생의 이름, 점수, 총점, 평균, 등급을 출력한다. 전체 학생 중 평균이 가장 높은 학생의 이름과 평균을 출력한다.
	 * 
	 * 1-6. 기본 연산자 총점 계산 시 +, 평균 계산 시 /, 최고 평균 비교 시 > 연산자를 활용한다.
	 * 
	 * 2. 실행 예시
	 * 
	 * 학생 수 입력: 3 과목 수 입력: 2
	 * 
	 * 1번째 학생 이름: Alice Alice의 1번째 과목 점수: 90 Alice의 2번째 과목 점수: 80
	 * 
	 * 2번째 학생 이름: Bob Bob의 1번째 과목 점수: 70 Bob의 2번째 과목 점수: 65
	 * 
	 * 3번째 학생 이름: Carol Carol의 1번째 과목 점수: 100 Carol의 2번째 과목 점수: 95
	 * 
	 * ===== 성적표 ===== 이름: Alice | 점수: 90 80 | 총점: 170 | 평균: 85.0 | 등급: B 이름: Bob |
	 * 점수: 70 65 | 총점: 135 | 평균: 67.5 | 등급: D 이름: Carol | 점수: 100 95 | 총점: 195 | 평균:
	 * 97.5 | 등급: A
	 * 
	 * 최고 평균 학생: Carol (97.5점)
	 */

	// 속성

	private String name;
	private int stdnum;
	private int kscore;
	private int escore;
	private int mscore;
	private char grade;
	private boolean isGraduate;

	// 기본 생성자

	public Student() {
	}

	// 매개변수 생성자

	public Student(String name, int stdnum, int kscore, int escore, int mscore, char grade, boolean isGraduate) {
		this.name = name;
		this.stdnum = stdnum;
		this.kscore = kscore;
		this.mscore = mscore;
		this.grade = grade;
		this.isGraduate = isGraduate;
	}

	// getter / setter

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStdnum() {
		return stdnum;
	}

	public void setStdnum(int stdnum) {
		this.stdnum = stdnum;
	}

	public int getKscore() {
		return kscore;
	}

	public void setKscore(int kscore) {
		this.kscore = kscore;
	}

	public int getEscore() {
		return escore;
	}

	public void setEscore(int escore) {
		this.escore = escore;
	}

	public int getMscore() {
		return mscore;
	}

	public void setMscore(int mscore) {
		this.mscore = mscore;
	}

	public char getGrade() {
		return grade;
	}

	public void setGrade(char grade) {
		this.grade = grade;
	}

	public boolean isGraduate() {
		return isGraduate;
	}

	public void setGraduate(boolean isGraduate) {
		this.isGraduate = isGraduate;
	}

}