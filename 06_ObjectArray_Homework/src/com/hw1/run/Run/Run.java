package com.hw1.run.Run;

import java.util.Scanner;

import com.hw1.model.vo.Employee.Employee;

public class Run {

	public static void main(String[] args) {

		// 객체 배열을 크기 3으로 할당 한 뒤
		Employee[] e  = new Employee[3];//3명의 사원정보 생성
		
		// 0번 인덱스에는 기본생성자를 통해서 객체 생성
		e[0] = new Employee();

		// 1번 인덱스에는 매개변수 6개짜리 생성자를 이용해서 객체 생성
		e[1] = new Employee(2,"정수지",37,'F',"010-2963-1262","경기도 남양주");

		// 2번 인덱스에는 매개변수 10개짜리 생성자를 이용하여 객체 생성 후 출력
		e[2] = new Employee(3,"차기웅","영업부","팀장",28,'F',4000000,0.15,"010-8477-7506","서울시 노원구");

		
		Scanner sc= new Scanner(System.in);
		
		for(int i=0; i<e.length;i++);{
			int i=0;
			System.out.println(e[i].information());
			System.out.println();
		}
		
		
		
		
		
		// 3개의 객체 중 값이 없는 필드에 각각 값을 넣은 뒤 다시 출력(임의로)
		// 직원 각각의 보너스가 적용된 1년 연봉을 계산하여 출력
		// 보너스가 적용된 연봉 = (급여 +(급여 *보너스 포인트)) * 12
		
				
		// 3명 직원의 연봉 평균을 구하여 출력
				
		
		
		
		//3명의 사원정보 출력
	

		
	
	}

}

/*
e[0] = new Employee(1,"고경원","기획부","차장",29,'M',5000000,0.1,"010-2603-7687","서울시 강남구");

// 1번 인덱스에는 매개변수 6개짜리 생성자를 이용해서 객체 생성
e[1] = new Employee(2,"정수지","인사부","과장",37,'F',8000000,0.2,"010-2963-1262","경기시 남양주");

// 2번 인덱스에는 매개변수 10개짜리 생성자를 이용하여 객체 생성 후 출력
e[2] = new Employee(3,"차기웅","영업부","팀장",28,'F',4000000,0.15,"010-8477-7506","서울시 노원구");
*/





