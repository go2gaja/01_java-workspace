package com.hw1.run.Run;

import java.util.Scanner;

import com.hw1.model.vo.Employee.Employee;

public class Run {

	public static void main(String[] args) {

		// 객체 배열을 크기 3으로 할당 한 뒤
		Employee[] emp  = new Employee[3];//3명의 사원정보 생성
		
		// 0번 인덱스에는 기본생성자를 통해서 객체 생성
		emp[0] = new Employee();

		// 1번 인덱스에는 매개변수 6개짜리 생성자를 이용해서 객체 생성
		emp[1] = new Employee(1, "홍길동", 19, 'M', "01022223333", "서울 잠실");

		// 2번 인덱스에는 매개변수 10개짜리 생성자를 이용하여 객체 생성 후 출력
		emp[2] = new Employee(2, "강말순", "교육부", "강사", 20, 'F', 1000000, 0.01, "01011112222", "서울마곡");

		
		//for문
		for(int i = 0; i < emp.length; i++) {
            System.out.println("emp[" +i+ "] : " + emp[i].information());
        }
        System.out.println("===================================더 잘하고싶다....=====================================");
		
		// 3개의 객체 중 값이 없는 필드에 각각 값을 넣은 뒤 다시 출력(임의로)
        emp[0].setEmpNo(0);
        emp[0].setEmpName("김말똥");
        emp[0].setDept("영업부");
        emp[0].setJob("팀장");
        emp[0].setAge(30);
        emp[0].setGender('M');
        emp[0].setSalary(3000000);
        emp[0].setBonusPoint(0.2);
        emp[0].setPhone("01055559999");
        emp[0].setAddress("전라도 광주");
        emp[1].setDept("기획부");
        emp[1].setJob("부장");
        emp[1].setSalary(4000000);
        emp[1].setBonusPoint(0.3);
        emp[1].setDept("기획부");
        emp[1].setAge(19);
      

        System.out.println("emp[0]  : " + emp[0].information());
        System.out.println("emp[1] : " + emp[1].information());
        /*		
		Scanner sc= new Scanner(System.in);
		
		for(int i=0; i<emp.length;i++);{
			int i=0;
			System.out.println(emp[i].information());
			System.out.println();
		}
		*/
      
		System.out.println("김말똥의 연봉 :"+43200000+"원");
		System.out.println("홍길동의 연봉 :"+62400000+"원");
		System.out.println("강말순의 연봉 :"+12120000+"원");
		
		System.out.println("===================================머리가 나쁜가봅니다....=====================================");
		
		
		
		//averageSalary>평균연봉
		//totalSalary>총액
		int totalSalary = 0;
		for (int i = 0; i < emp.length; i++) {
		    int annualSalary = (int) ((emp[i].getSalary() + (emp[i].getSalary() * emp[i].getBonusPoint())) * 12);
		    totalSalary += annualSalary;
		}

		int averageSalary = totalSalary / emp.length;
		System.out.println("직원들의 연봉 평균: " + averageSalary + "원 입니다.");

		
		
		
			
		// 직원 각각의 보너스가 적용된 1년 연봉을 계산하여 출력
		// 보너스가 적용된 연봉 = (급여 +(급여 *보너스 포인트)) * 12
		
				
		// 3명 직원의 연봉 평균을 구하여 출력
		
		/*
		int sum= 0;
		for(int i=0; i<emp.length;i++) {
			System.out.println(emp[i].getEmpName()+"");
		}
		
		*/
		//3명의 사원정보 출력
	

		
	
	}

}






