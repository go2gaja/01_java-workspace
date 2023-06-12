package com.hw1.run;

import java.util.Scanner;

import com.hw1.model.vo.Employee;
import com.hw1.model.vo.Student;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//3명의 학생정보 기록 객체배열 할당
		Student[] students= new Student[3];
		
		students[0] =new Student("홍길동",20,178.1,70.2,1,"정보시스템공학과");
		
		students[1] =new Student("김말똥",21,187.2,80.3,2,"경영학과");
		
		students[2] =new Student("강개순",23,167.4,45.0,4,"정보통신공학과");
				
		//학생정보 출력
		for(int i=0; i<students.length;i++) {
			Student student=students[i];
			System.out.println("이름: "+student.getName()+" "+"나이: "+student.getAge()+" "+"신장: "+student.getHeight()+" "+"학년: "+student.getGrade()+" "+"전공: "+student.getMajor());
		}
		
		
		
				
		
		
		
		//최대 10명 만들기
		
		Employee[] emp = new Employee[10];
		
		Scanner sc= new Scanner(System.in);
		int empC= 0;
		
		while(true) {
		
			if(empC>=emp.length) {
				System.out.println("최대 인원을 초과하여 더 이상 입력할 수 없습니다.");
                break;
         
			}
			 System.out.print("이름: ");
	            String name = sc.nextLine();
	           
	         System.out.print("나이: ");
	         	int age=sc.nextInt();
	            
	         System.out.print("신장: ");
	            double height=sc.nextDouble();
	         
	         System.out.print("몸무게: ");
	            double weight =sc.nextDouble();
	         
	         System.out.print("급여: ");
	            int salary =sc.nextInt();
	            sc.nextLine() ;
	            
	         System.out.print("부서: ");
	            String dept=sc.nextLine();
	            
	            emp[empC]=new Employee(name, age, height, weight, salary, dept);
	            empC++;
	            
	            System.out.print("더 할래? : (y/n)");
	            char dic = sc.nextLine().charAt(0);
	            if(dic == 'n'||empC == 10)
	            {
	            	break ;
	            }
	            
	            

		}
		for (int i = 0 ; i<empC;i++ ) {
			Employee employee =emp [i];
			System.out.println("이름: " + employee.getName());
            System.out.println("나이: " + employee.getAge());
            System.out.println("신장: " + employee.getHeight());
            System.out.println("몸무게: " + employee.getWight());
            System.out.println("급여: " + employee.getSalary());
            System.out.println("부서: " + employee.getDept());
            System.out.println();
			
		}
		
		
		
		
		
		
		
	}

}
