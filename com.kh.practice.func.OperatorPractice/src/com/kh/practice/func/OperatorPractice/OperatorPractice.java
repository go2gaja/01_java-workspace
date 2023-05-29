package com.kh.practice.func.OperatorPractice;

import java.util.Scanner;

public class OperatorPractice {
	public void practice1 () {
		Scanner sc = new Scanner(System.in);
		/*키보드로 입력 받은 하나의 정수가 양수이면 “양수다“, 양수가 아니면 “양수가 아니다“를 출력하세요.
		ex.
		정수 : -9
		양수가 아니다
        */
		System.out.print("정수 :");
		int num = sc.nextInt();
		
		String result = num >0 ?  "양수다" :"양수가 아니다";
		System.out.println(result);
		
		
	
		
		
	}

	
	
	public void practice2 ( ) {
		Scanner sc = new Scanner(System.in);
		/*키보드로 입력 받은 하나의 정수가 양수이면 “양수다“,양수가 아닌 경우 중에서 0이면 “0이다“, 0이 아니면 “음수다”를 출력하세요.
		ex.
		정수 : -9
		음수
		*/
		System.out.print("정수 :");
		int num = sc.nextInt();
		
		  String result = num > 0 ? "양수다" : num == 0 ? "0이다" : "음수다";
	      System.out.println(result);
		
		
	}
	
	public void practice3 () {
		/*키보드로 입력 받은 하나의 정수가 짝수이면 “짝수다“, 짝수가 아니면 “홀수다“를 출력하세요.
		ex.
		정수 : 5
		홀수
		*/
		Scanner sc = new Scanner(System.in);
		System.out.print("정수:");
		int num = sc.nextInt();
		
		String result = num %2 ==0 ? "짝수다" : "홀수다";
		System.out.println(result);
		
		
		
	}
	
	public void practice4 () {
		/*모든 사람이 사탕을 골고루 나눠가지려고 한다. 인원 수와 사탕 개수를 키보드로 입력 받고 	1인당 동일하게 나눠가진 사탕 개수와 나눠주고 남은 사탕의 개수를 출력하세요.
		ex.
		인원 수 : 29
		사탕 개수 : 100
		1인당 사탕 개수 : 3
		남는 사탕 개수 : 13
		*/

		Scanner sc = new Scanner(System.in);
		
		System.out.print("인원 수 :");
		int people = sc.nextInt();
		System.out.print("사탕 갯수 :");
		int candy = sc.nextInt();
		
		int peoplecandy= candy%people;
		int peoplecandy2=candy/people;
		
		System.out.println("1인당 동일하게 나눠가진 사탕 개수"+peoplecandy);
		System.out.println("남는 사탕 개수"+peoplecandy2);
		
				
	}
	public void practice5 ( ) {
		/*키보드로 입력 받은 값들을 변수에 기록하고 저장된 변수 값을 화면에 출력하여 확인하세요.
		이 때 성별이 ‘M’이면 남학생, ‘M’이 아니면 여학생으로 출력 처리 하세요.
		ex.
		이름 : 박신우
		학년(숫자만) : 3
		반(숫자만) : 4
		번호(숫자만) : 15
		성별(M/F) : F
		성적(소수점 아래 둘째자리까지) : 85.75
		3학년 4반 15번 박신우 여학생의 성적은 85.75이다.
        */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름:");
		String name =sc.nextLine();
		
		System.out.print("학년(숫자만):");
		int grade = sc.nextInt();
		
		System.out.print("반(숫자만):");
		int team = sc.nextInt();
		
		System.out.print("번호(숫자만):");
		int num = sc.nextInt();
		
		sc.nextLine();
			
		System.out.print("성별(M/F):");
		char gender =sc.nextLine().charAt(0);
		
	
		System.out.print("성적(소수점 아래 둘째자리까지:");
		double score =sc.nextDouble();
		sc.nextLine();
		
		System.out.print("3학년4반 15번 박신우 여학생의 성적은 85.75이다 ");
				
				
	}
	public void practice6 ( ) {
		/*나이를 키보드로 입력 받아 어린이(13세 이하)인지, 청소년(13세 초과 ~ 19세 이하)인지, 
		성인(19세 초과)인지 출력하세요.
		ex.
		나이 : 19
		청소년
		*/
		Scanner sc = new Scanner(System.in);
        System.out.print("나이 : ");
        int age = sc.nextInt();
        
        String people = age<=13 ? "어린이" : age <= 19 ? "청소년":"성인";
		System.out.println(people);
				
			
		
	}
	
	public void practice7 ( ) {
		/*국어, 영어, 수학에 대한 점수를 키보드를 이용해 정수로 입력 받고, 
		세 과목에 대한 합계(국어+영어+수학)와 평균(합계/3.0)을 구하세요.
		세 과목의 점수와 평균을 가지고 합격 여부를 처리하는데
		세 과목 점수가 각각 40점 이상이면서 평균이 60점 이상일 때 합격, 아니라면 불합격을 출력하세요.
		ex.
		국어 : 60
		영어 : 80
		수학 : 40
		합계 : 180
		평균 : 60.0
		합격
		*/
		Scanner sc = new Scanner(System.in);
		System.out.println("국어:");
		int korean = sc.nextInt();
		
		
	}
	
	
	
	
	
}
