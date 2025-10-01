package practice02;

import java.util.Scanner;

public class StudentService {

	Scanner sc = new Scanner(System.in);
	
	Student std = new Student();
	
	public Student recordedStd = null; // 초기화 필요!
	
	public void main() { // 메인 화면
		
		System.out.println("== 학생 성적 관리 프로그램 ==");
		System.out.println("1. 학생 정보 입력");
		System.out.println("2. 학생 정보 조회");
		System.out.println("3. 종료하기");
		
	}
	
	
	public void recordingStudentInfo() { // 1. 학생 정보 입력

		System.out.print("학생 수를 입력해주세요 : ");
		int input = sc.nextInt();
		
		Student [] arr = new Student [input];
		
		System.out.println();
		System.out.println("학생 정보를 입력합니다.");
		
		
		for ( int i = 0; i < arr.length; i ++) {
			
			arr[i] = new Student();
			
			System.out.printf("\n%d번 학생의 이름 : \n", i+1);
			String name = sc.next();
			arr[i].setName(name);
			
			System.out.printf("%d번 학생의 학번 : \n", i+1);
			int stdnum = sc.nextInt();
			arr[i].setStdnum(stdnum);
			
			System.out.printf("%d번 학생의 국어성적 : \n", i+1);
			int kscore = sc.nextInt();
			arr[i].setKscore(kscore);

			System.out.printf("%d번 학생의 영어성적 : \n", i+1);
			int escore = sc.nextInt();
			arr[i].setEscore(escore);
			
			System.out.printf("%d번 학생의 수학성적 : \n", i+1);
			int mscore = sc.nextInt();
			arr[i].setMscore(mscore);
			
			recordedStd = arr[i];
			
			System.out.println(deepTO recordedStd.arr[i]);
		}
		
	}
	
}
