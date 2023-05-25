package com.kh.practice1.func;
import java.util.Scanner;
public class VariablePractice4 {
	
	
	    public void VariablePractice () {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("문자열을 입력하세요 : ");
	        String input = scanner.nextLine();

	        if (input.length() < 3) {
	            System.out.println("문자열이 너무 짧습니다.");
	        } else {
	            System.out.println("첫 번째 문자 : " + input.charAt(0));
	            System.out.println("두 번째 문자 : " + input.charAt(1));
	            System.out.println("세 번째 문자 : " + input.charAt(2));
	        }
	        
	        scanner.close();
	    }
	}

	

	
	


