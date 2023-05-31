package com.kh.practice.loop.LoopPractice;

import java.util.Scanner;
//실습문제 1
	/*사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 숫자들을 모두 출력하세요.
	단, 입력한 수는 1보다 크거나 같아야 합니다.
	만일 1 미만의 숫자가 입력됐다면 “1 이상의 숫자를 입력해주세요“를 출력하세요.
	
	ex.
	1이상의 숫자를 입력하세요 : 4 
	1 2 3 4 
	
	1이상의 숫자를 입력하세요 : 0
	1 이상의 숫자를 입력해주세요.
	*/



public class loop_LoopPractice {
	public void method1 ( ) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		if (num < 1)
			System.out.println("1 이상의 숫자를 입력해주세요.");
		else {
			for (int i = 0; i < num; i++)
				System.out.print(i + 1 + " ");
		}
		
		sc.close();
	}
	
	//실습문제 2
		/*위 문제와 모든 것이 동일하나, 1 미만의 숫자가 입력됐다면
		“1 이상의 숫자를 입력해주세요”가 출력되면서 다시 사용자가 값을 입력하도록 하세요.
		
		ex.
		1이상의 숫자를 입력하세요 : 4
		1 2 3 4 
		
		1이상의 숫자를 입력하세요 : 0
		
		1 이상의 숫자를 입력해주세요.
		1이상의 숫자를 입력하세요 : 8
		
		1 2 3 4 5 6 7 8 
		*/
		
	
	public void method2 ( ) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		while(1>num) {
			System.out.print("1이상의 숫자를 입력하세요 : ");
			num = sc.nextInt();
			
			if(1<=num) {
				for(int i=1; i<=num; i++) {
					System.out.print(i +" ");
				}
				}else if(1>num) {
					System.out.println("1이상의 숫자를 입력해주세요.");
			}
		}
		
		}
	//실습문제 3
		/*사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 모든 숫자를 거꾸로 출력하세요.
		단, 입력한 수는 1보다 크거나 같아야 합니다.
		ex.
		1이상의 숫자를 입력하세요 : 4
		4 3 2 1 
		
		1이상의 숫자를 입력하세요 : 0
		1 이상의 숫자를 입력해주세요.
		*/
	
		public void method3 () {
			Scanner sc = new Scanner(System.in);
			
			System.out.print("1이상의 숫자를 입력하세요 : ");
			int num = sc.nextInt();
			
			if (num < 1)
				System.out.println("1 이상의 숫자를 입력해주세요.");
			else {
				for (int i = num; i > 0; i--)
					System.out.print(i + " ");
			}
			
			sc.close();
	}
		
		
		/*위 문제와 모든 것이 동일하나, 1 미만의 숫자가 입력됐다면
		“1 이상의 숫자를 입력해주세요”가 출력되면서 다시 사용자가 값을 입력하도록 하세요.
		ex.
		1이상의 숫자를 입력하세요 : 4 
		1이상의 숫자를 입력하세요 : 0
		4 3 2 1 1 이상의 숫자를 입력해주세요.
		1이상의 숫자를 입력하세요 : 8
		8 7 6 5 4 3 2 1
	    */
		
		public void method4 () {
			Scanner sc = new Scanner(System.in);
			int num=0;
			while(1>num) {
				System.out.print("1이상의 숫자를 입력하세요. : ");
				num = sc.nextInt();
				
				if(1<=num) {
					for(int i=num; i>=1 ; i--) {
						System.out.print(i + " ");
					}
					}else if(1>num) {
						System.out.println("1이상의 숫자를 입력해주세요.");
											
					}
				}
			}
		//실습문제 5
		/*
		 * 1부터 사용자에게 입력 받은 수까지의 정수들의 합을 출력하세요.
		ex.
		정수를 하나 입력하세요 : 8
		1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 = 36 
		*/
		public void method5 ( ) {
			Scanner sc = new Scanner(System.in);
			
			System.out.print("정수를 하나 입력하세요 :");
			int num =sc.nextInt();
			int sum=0;
			
			
			for(int i=1;i<=num;i++) {
				sum += i;
			System.out.print(i);
			if(i<num) {
				System.out.print("+");
			} else {
				System.out.print("=");
			}
			}
			System.out.println(sum);
			
			
		}
		
		//실습문제 6
		
		/*
		 사용자로부터 두 개의 값을 입력 받아 그 사이의 숫자를 모두 출력하세요.
		만일 1 미만의 숫자가 입력됐다면 “1 이상의 숫자를 입력해주세요“를 출력하세요.
		ex.
		첫 번째 숫자 : 8 	첫 번째 숫자 : 4 	첫 번째 숫자 : 9
		두 번째 숫자 : 4 	두 번째 숫자 : 8 	두 번째 숫자 : 0
		4 5 6 7 		8 4 5 6 7 8 	1 이상의 숫자를 입력해주세요.
		*/
		
		
		
		public void method6 () {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("첫 번째 숫자:");
			int num1 =sc.nextInt();
			
			System.out.print("두 번재 숫자:");
			int num2 = sc.nextInt();
			
			if (num1<1) {
				System.out.println("1이상의 숫자를 입력해주세요 :");
				return;
			}
			if(num2<1) {
				System.out.println("1 이상의 숫자를 입력해주세요 :");
				return;
				
			}
		
	}
			
}			
			
		
	
	
	
	
