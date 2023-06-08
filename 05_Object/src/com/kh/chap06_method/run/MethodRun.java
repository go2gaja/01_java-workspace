package com.kh.chap06_method.run;

import java.util.Scanner;

import com.kh.chap06_method.controller.NonStaticMethod;
import com.kh.chap06_method.controller.OverloadingTest;
import com.kh.chap06_method.controller.StaticMethod;

public class MethodRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 매개변수도 없고 반환값도 없는 메소드 호출

		NonStaticMethod n= new NonStaticMethod();
		n.method1();
		n.method2();
		
		//String str = n.method2();
		System.out.println(n.method2());
		
		//3 매개변수 있고 반환값은 없는 메소드
		//n.method3(); >>매개변수 없으면 오류남
		//n.method3(10);매개변수 개수 맞지 않으면 오류남
		//n.method3("z," d);>> 매개변수 타입 맞지 않으면 오류남
		//int a = n.method3(10, 20);>>반환값 없어서 오류남
		n.method3(10, 5);
		n.method3(10, 5);
		
		//4. 매개변수도 있고 반환값도 있는 메소드 호출
		//char ch = n.method4("lemon",1);
		
		//System.out.println(n.method4("lemon", 1));
	
		
		//사용자에게 매개변수를 입력받아서 해당 메소드 호출
		/*
		//사용자에게 매개변수를 
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력 :");
		String str=sc.nextLine();
		
		System.out.print("인덱스 입력:");
		int index= sc.nextInt();
		
		//System.out.println(n.method4(str, index));
		
		//여기서 유효성 검사해보기
		//index 0 이상이고 문자열의 길이보다 작을때만 method4
				
		if(index>=0 && index<str.length()) {
			System.out.println("결과 :"+ n.method4(str, index));
		}else {
			System.out.println("인덱스 값이 부족합니다");
		}
		
		*/
		
		//========StaticMethod==========================
		StaticMethod.method1();
		StaticMethod.method2();
		System.out.println(StaticMethod.method2());//return 값은 출력하지 않으면 보이지 않는다.
		StaticMethod.method3("차은우");
		
		System.out.println(StaticMethod.method4("apple","kiwi"));//return 출력해야 확인이 가능
		
		//========================overloadingTest=====================
		OverloadingTest ot = new OverloadingTest();
		
		
		ot.test();
		ot.test(10);
		ot.test(10,"zzzz");
		ot.test("ㅎㅅㅎ",20);
		ot.test(10,10);
		ot.test("차은우");
		
		//오버로딩의 대표적인 예 >> print()
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
	
