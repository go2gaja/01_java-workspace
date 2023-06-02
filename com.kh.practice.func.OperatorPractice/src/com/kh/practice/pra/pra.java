package com.kh.practice.pra;

import java.util.Scanner;

public class pra {
	public void method1() {
		Scanner sc = new Scanner(System.in);
		/* 먼저 "정수:" 출력장치를 만든다.	
		 * 정수를 만든다
		 * 만약에 정수가 양수가 아닌지를 확인해라 아니면 "양수가 아닙니다 "를 출력해라
		 * 그렇지 않으면 정수가 음수인지를 확인해라
		 * 정수가 홀수면"박" 짝수면"수"를 출력해라
		 * 
		 * 
		 * 
		 * 
		 */
		System.out.print("정수 :");
		int num =sc.nextInt();
		
		if(num==0) {
			System.out.print("양수가 아닙니다");
			
		}else if(num<0){
			System.out.print("양수가 아닙니다");
			
		}
		
		
		for(int i=1;i<=num;i++) {
			if(i%2==0) {
				System.out.print("수");
			}else {
				System.out.print("박");
			}
		}
		System.out.println();
		
		
		
	    }
	
	public void method2() {
		
 
		        Scanner sc = new Scanner(System.in);

		        while (true) {
		            System.out.print("정수 : ");
		            int num = sc.nextInt();

		            if (num < 1) {
		                System.out.println("양수가 아닙니다.");
		                continue;
		            }

		            for(int i=1;i<=num;i++) {
		    			if(i%2==0) {
		    				System.out.print("수");
		    			}else {
		    				System.out.print("박");
		    			}
		    		}
		    		System.out.println();
		        
		        }
	
	
	}

}
