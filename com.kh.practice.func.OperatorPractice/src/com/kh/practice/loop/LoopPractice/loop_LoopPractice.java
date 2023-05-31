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
			
			
			int num1 =0;//1번 정수
			int num2 =0;//2번 정수
			Scanner sc = new Scanner(System.in);//두개의 값 출력하기
			
			System.out.print("첫 번째 숫자 :");
			num1=sc.nextInt();
			
			System.out.print("두 번째 숫자 :");
			num2=sc.nextInt();
			
						
			if(num1>0 && num2>0) {//만약 1번이 0보다 크고 2번도 0보다 클때
				if(num1<num2) {//1번보다 2번이 크다면
					for(int i =num1;i <=num2; i++) {//i가 1번이고 i가 2번보다 작으면 +1
						System.out.print(i+" ");
					}
				}else if (num1>num2) {//그렇지 않으면 2번보다 1번이 클때
					for(int i=num1; i>num2;i--) {//i가 1번이고 i가 2번보다 클때 i를 -1
						
					}
				
				}
			}else {
				System.out.println("1이상의 숫자만 입력해주세요 :");
			}
			
			
		
	}
        /*
		위 문제와 모든 것이 동일하나, 1 미만의 숫자가 입력됐다면
		“1 이상의 숫자를 입력해주세요”가 출력되면서 다시 사용자가 값을 입력하도록 하세요.
		ex.
		첫 번째 숫자 : 8 첫 번째 숫자 : 4 첫 번째 숫자 : 9
		두 번째 숫자 : 4 두 번째 숫자 : 8 두 번째 숫자 : 0
		4 5 6 7 8    4 5 6 7 8     1 이상의 숫자를 입력해주세요.
		첫 번째 숫자 : 6
		두 번째 숫자 : 2
		2 3 4 5 6 
		*/
	public void method7 () {//while 잘모름
		
		Scanner sc = new Scanner(System.in);
		int num1=0;
		int num2=0;
		
		while(true) {//~하는동안
			System.out.print("첫 번째 숫자 :");
			num1 = sc.nextInt();
			
			System.out.print("두 번째 숫자 :");
			num2 = sc.nextInt();
			
			if(num1>0 && num2>0) {//만약 1번이 0보다 크고 2번도 0보다 클때
				if(num1<num2) {//1번보다 2번이 크다면
					for(int i =num1;i <=num2; i++) {//i가 1번이고 i가 2번보다 작으면 +1
						System.out.print(i +" ");
					}
					
					break;
				}else if (num1>num2) {//그렇지 않으면 2번보다 1번이 클때
					for(int i=num1; i>=num2;i--) {//i가 1번이고 i가 2번보다 클때 i를 -1
						System.out.print(i +" ");
					}
					
					break;
					
				}
			}else {
				System.out.println("1이상의 숫자만 입력해주세요 :");
			}
			
			
			
			
			
		}
				
		
		
	}
		
	
	/*메소드 명 : public void practice8(){}
	사용자로부터 입력 받은 숫자의 단을 출력하세요.
	ex.
	숫자 : 4
	===== 4단 =====
	4 * 1 = 4
	4 * 2 = 8
	4 * 3 = 12
	4 * 4 = 16
	4 * 5 = 20
	4 * 6 = 24
	4 * 7 = 28
	4 * 8 = 32
	4 * 9 = 36	
	*/
	
		public void method8 () {
			
			Scanner sc = new Scanner(System.in);
			int num =0;
			
			System.out.print("숫자:");//출력장치
			num=sc.nextInt();// 구구단 출력 정수 4단
			
			System.out.println("===="+num+"====");
			for(int i=1; i<=9;i++) {//i가 1이고 9보다 작은 수일때 i+한다
				System.out.println(num+"*"+i+"="+(num*i));//정수(4)+"*"+i(1~9)+"="+(4*i)
				
			
			
			}
			
		}
		/*
		사용자로부터 입력 받은 숫자의 단부터 9단까지 출력하세요.
		단, 9를 초과하는 숫자가 들어오면 “9 이하의 숫자만 입력해주세요”를 출력하세요.
		숫자 : 4 숫자 : 10
		===== 4단 ===== 9 이하의 숫자만 입력해주세요.
		===== 5단 =====
		===== 6단 =====
		===== 7단 =====
		===== 8단 =====
		===== 9단 =====
		(해당 단의 내용들은 길이 상 생략)
		*/
		
		public void method9 () {
			Scanner sc = new Scanner(System.in);
			int num = 0;
			
			System.out.print("숫자 :");
			num=sc.nextInt();
			
			if(num > 1 && num <10) {//정수 num이 1보다는 크고 10보다는 작을때
				System.out.println("===="+num+"단====");
				for(int i=1;i<10;i++) {
					System.out.println(num+"*"+i+"="+(num*i));
				}
		}else {
			System.out.println("9이하의 숫자만 입력해주세요. :");
		}
	
			
			
			
	}
		
		/*	
		위 문제와 모든 것이 동일하나, 9를 초과하는 숫자가 입력됐다면
		“9 이하의 숫자를 입력해주세요”가 출력되면서 다시 사용자가 값을 입력하도록 하세요.
		숫자 : 4 숫자 : 10
		===== 4단 ===== 9 이하의 숫자만 입력해주세요.
		===== 5단 ===== 숫자 : 8
		===== 6단 ===== ===== 8단 =====
		===== 7단 ===== ===== 9단 =====
		===== 8단 =====
		===== 9단 =====
		(해당 단의 내용들은 길이 상 생략)	
		*/
		public void method10 ( ) {//인터넷 도움받아서 작성했음 while 잘모름
			
			Scanner sc = new Scanner(System.in);
			int num =0;
			
			 while (true) {//하는 동안
			        System.out.print("숫자: ");
			        num = sc.nextInt();

			        if (num <= 9) {//정수가 9이하일때
			            break;//멈춤
			        } else {//아니라면 9 이하의 숫자를 입력해주세요라고 출력
			            System.out.println("9 이하의 숫자를 입력해주세요");
			        }
			    }

			    System.out.println("=====" + num + "단=====");
			    for (int i = 1; i <= 9; i++) {//i가 1~9이하의 정수 +할것
			        System.out.println(num + " * " + i + " = " + num * i);
			    }
			}
		/*	
		사용자로부터 시작 숫자와 공차를 입력 받아
		일정한 값으로 숫자가 커지거나 작아지는 프로그램을 구현하세요.
		단, 출력되는 숫자는 총 10개입니다.
		* ‘공차’는 숫자들 사이에서 일정한 숫자의 차가 존재하는 것을 말한다.
		ex) 2, 7, 12, 17, 22 …
		5 5 5 5 => 여기서 공차는 5
		ex.
		시작 숫자 : 4
		공차 : 3
		4 7 10 13 16 19 22 25 28 31
		*/
		
		public void method11( ) {
			Scanner sc= new Scanner(System.in);
			
			System.out.print("시작 숫자 :");//먼저 시작 숫자 출력장치 만들것
			int num1 =sc.nextInt();
			
			System.out.print("공차 :");//다음 출력장치 공차 만들 것
			int num2 =sc.nextInt();
			
			//출력되는 숫자는 총 10개이다 
			
			for(int i=0; i<10;i++) {//i가 0~9일때 +한다
				System.out.print(num1+i*num2+" ");
				
			}
			System.out.println();
			
			
		}
		/*
		메소드 명 : public void practice12(){}
		정수 두 개와 연산자를 입력 받고 입력된 연산자에 따라 알맞은 결과를 출력하세요.
		단, 해당 프로그램은 연산자 입력에 “exit”라는 값이 들어올 때까지 무한 반복하며
		exit가 들어오면 “프로그램을 종료합니다.”를 출력하고 종료합니다.
		또한 연산자가 나누기이면서 두 번째 정수가 0으로 들어오면
		“0으로 나눌 수 없습니다. 다시 입력해주세요.”를 출력하며,
		없는 연산자가 들어올 시 “없는 연산자입니다. 다시 입력해주세요.”라고 출력하고
		두 경우 모두 처음으로 돌아가 사용자가 다시 연산자부터 입력하도록 하세요.
		[다음 장 출력 예시 참고]
		▶ 실습문제12
		메소드 명 : public void practice12(){}
		연산자(+, -, *, /, %) : +
		정수1 : 10
		정수2 : 4
		10 + 4 = 14
		연산자(+, -, *, /, %) : / 연산자(+, -, *, /, %) : /
		정수1 : 10 정수1 : 10
		정수2 : 4 정수2 : 0
		10 / 4 = 2 0으로 나눌 수 없습니다. 다시 입력해주세요.
		연산자(+, -, *, /, %) : ^ 연산자(+, -, *, /, %) : exit
		정수1 : 10 프로그램을 종료합니다.
		정수2 : 4
		없는 연산자입니다. 다시 입력해주세요.
		
		*/
				
		public void method12 ( ) {//이건 모르겠습니다 인터넷뒤져도 
			
		}
		/*
		다음과 같은 실행 예제를 구현하세요.
		ex.
		정수 입력 : 4
		*
		**
		***
		****
		*/
		public void method13( ) {
			Scanner sc = new Scanner(System.in);
			System.out.print("정수 입력 :");
			int num=sc.nextInt();
			
			for(int i=0;i<num;i++) {
				for(int k=0;k<i+1;k++) {
					System.out.print("*");
				}
				System.out.println();
			}
			
		}
		
		/*
		다음과 같은 실행 예제를 구현하세요.
		ex.
		정수 입력 : 4
		****
		***
		**
		*
		*	
		*/
		public void method14() {
			Scanner sc = new Scanner(System.in);
			System.out.print("정수 입력 :");
			int num=sc.nextInt();
			
			for(int i=num; i>0; i--) {
				for(int j=0; j<i;j++) {
					System.out.print("*");
				}
		
			
				System.out.println();
			}
			
		}
}
		
			
			
		
	
	
	
	
