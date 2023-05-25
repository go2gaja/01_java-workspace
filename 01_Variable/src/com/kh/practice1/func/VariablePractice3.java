package com.kh.practice1.func;
import java.util.Scanner;
public class VariablePractice3 {
	public void VariablePractice () {
		
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("가로 : ");
	        double width = scanner.nextDouble();

	        System.out.print("세로 : ");
	        double height = scanner.nextDouble();

	        double area = width * height;
	        double perimeter = 2 * (width + height);

	        System.out.println("면적 : " + area);
	        System.out.println("둘레 : " + perimeter);
	        
	        scanner.close();
	    }
	}



