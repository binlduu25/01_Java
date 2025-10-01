package edu.kh.op.practice;

import java.util.Scanner;

public class OperatorPractice{
	
	Scanner sc = new Scanner(System.in);

	public void practice1(){

		// 모든 사람이 사탕을 골고루 나눠가지려고 한다. 인원수와 사탕 개수를 키보드로 입력받고
		// 1인당 동일하게 나눠 가진 사탕 개수와 나눠주고 남은 사탕의 개수를 출력하세요.
		
			System.out.println("---연습 문제 1---");
		
			System.out.println();
			
				System.out.printf("인원 수 : "); 
				int candyPeople = sc.nextInt();
		
				System.out.printf("사탕 개수 : ");
				int candyEa = sc.nextInt();
			
			System.out.println();
			
				int candyPerPerson = candyEa/candyPeople;
				int candyRest = candyEa%candyPeople;
	
				System.out.println("1인당 사탕 개수 : "+candyPerPerson);
				System.out.println("남는 사탕 개수 : "+candyRest);
				
	}
	
	public void practice2() {
		
		// 키보드로 입력받은 값들을 변수에 기록하고 저장된 변수값을 화면에 출력하여 확인하세요.
		
			System.out.println("---연습 문제 2---");
			
			System.out.println();
			
				sc.nextLine();
				System.out.printf("이름 : ");
				String name = sc.nextLine();
						
				System.out.printf("학년 : ");
				int grade = sc.nextInt();
				
				System.out.printf("반 : ");
				int classNo = sc.nextInt();
				
				System.out.printf("번호 : ");
				int studentNo = sc.nextInt();
				
				sc.nextLine();
				
				System.out.printf("성별 : ");
				String gender = sc.nextLine();
						
				System.out.printf("점수 : ");
				double score = sc.nextDouble();
				
			System.out.println();
				
			System.out.printf("%d학년 %d반 %d번 %s %s의 성적은 %.2f이다.\n",grade,classNo,studentNo,name,gender,score);
			
	}

	public void practice3() {

		// 국어, 영어, 수학에 대한 점수를 키보드를 이용해 정수로 입력받고, 
		// 세 과목에 대한 합계(국어+영어+수학)와 평균(합계/3.0)을 구하세요
		
		System.out.println("---연습 문제 3---");
		
		System.out.println();
			
			System.out.printf("국어 : ");
			int krScore = sc.nextInt();
			
			System.out.printf("영어 : ");
			int enScore = sc.nextInt();
			
			System.out.printf("수학 : ");
			int mtScore = sc.nextInt();
			
			int sumScore = krScore + enScore + mtScore;
			double avgScore = sumScore/3.0;
			
			boolean resultScore = (krScore>=40 && enScore>=40 && mtScore>=40 && avgScore>=60);
			// 각 과목이 40 이상이고, 평균이 60 이상일 시 합격, 그외는 불합격
			
			
			
		System.out.println();

			System.out.printf("합계 : %d\n평균 : %.1f\n",sumScore,avgScore);
			System.out.println(resultScore ? "합격" : "불합격");
			
	}
}

