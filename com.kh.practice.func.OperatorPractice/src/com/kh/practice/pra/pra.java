package com.kh.practice.pra;

import java.util.Scanner;

public class pra {
	public void method1() {
		Scanner sc = new Scanner(System.in);

		while (true) {
	            System.out.print("정수 : ");
	            int input = sc.nextInt();

	            if (input == 0) {
	                System.out.println("양수가 아닙니다");
	                break;
	            } else if (input < 0) {
	                System.out.println("양수가 아닙니다");
	                continue;
	            }

	            for (int i = 1; i <= input; i++) {
	                if (i % 2 == 0) {
	                    System.out.print("수");
	                } else {
	                    System.out.print("박");
	                }
	            }

	            System.out.println();
	        }

	        sc.close();
	    }
	
	}


