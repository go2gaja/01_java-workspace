package com.kh.practice1.func.VariablePractice1;


import java.util.Scanner;
public class VariablePractice1 { 
	
	public void VariablePractice() {
		Scanner scanner = new Scanner(System.in);
		 System.out.print("이름을 입력하세요 : ");
	        String name = scanner.nextLine();
	        System.out.println(name+"이름을 입력하세요");
	        
	        System.out.print("성별을 입력하세요(남/여) : ");
	        String gender = scanner.nextLine();
	        System.out.println("성별을 입력하세요(남/여)"+gender);
	        
	        System.out.print("나이를 입력하세요 : ");
	        int age = scanner.nextInt();
	        System.out.println("나이를 입력하세요"+age);
	        
	        System.out.print("키를 입력하세요(cm) : ");
	        double height = scanner.nextDouble();
	        System.out.println(height+"키를 입력하세요");
	        
	        System.out.println("키 " + height + "cm인 " + age + "살 " + gender + "자 " + name + "님 반갑습니다^^");
	        
	        scanner.close();
		}
} 