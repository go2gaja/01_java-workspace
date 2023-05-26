package com.kh.operator;

public class C_Arithmetic {
	/*
	 * 산술 연산자(이향연산자==두개의 값을 가지고 연산을)
	 * + - * / %
	 * 
	 * * / % > +-    
	 */
	
	public void method1() {
		
		int num1 =10;
		int num2 =3;
		System.out.println("num1+num2="+num1+num2);//103
		System.out.println("num1+num2="+(num1+num2));
		//System.out.println("num1-num2"+num1-num2);//오류발생
		System.out.println("num1-num2="+(num1-num2));//7
		System.out.println("num1*num2="+num1*num2);//곱샘연산은 우선순위 먼저 그러나 가독성을 위해서 ()해주기
		System.out.println("num1/num2="+(num1/num2));//나누기 연산시 몫 출력
		System.out.println("num1 % num2="+(num1%num2));//나누기 연산시 나머지를 출력 <홀 짝>
		//값 % 2 == 0 라는 건 짝수라는 소리
		//값 % 2 == 1 라는 건 홀수라는 소리
		
		//값 % 5 == 0 라는건 5의 배수라는 소리
		//값 % 3 == 0 라는건 3의 배수라는 소리
	
	
	
	
	}
		public void quiz1(){
		      int a = 5;
		      int b = 10;
		      int c = (++a) + b; 
		      int d = c / a;   
		      int e = c % a;   
		      int f = e++;   
		      int g = (--b) + (d--);
		      int h = 2; 
		      int i = (a++) + b / (--c / f) * (g-- - d) % (++e + h);
		   
		   
		      System.out.println("a : " + a); 
		      System.out.println("b : " + b); 
		      System.out.println("c : " + c);   
		      System.out.println("d : " + d);   
		      System.out.println("e : " + e);   
		      System.out.println("f : " + f);   
		      System.out.println("g : " + g);   
		      System.out.println("h : " + h);   
		      System.out.println("i : " + i);   
		   }
		
		
		
		
	
	
	
	
		
		
		
		
		
		
	}
	
	
	
	


















































