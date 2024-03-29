package com.kh.chap02_String.Control;

public class A_StringPoolTest {
	/*
	String s = "안녕";//참조 자료형
	int a = 10;//기본 자료형
*/	
	
	
	
	
		
	public void method() {
		//1. 생성자를 통한 문자열  생성
		
		String str1 = new String("hello");//매개변수 생성자
		String str2 = new String("hello");//매개변수 생성자

		System.out.println(str1.toString());
		System.out.println(str2);
		//String 클래스에 toString() 메소드가 이미 오버라이딩 돼있음(실제 담긴 문자열 반환하도록)
		
		//동등비고
		System.out.println(str1==str2);//주소값을 비교하니까 당연히 false 
		System.out.println(str1.equals(str2));//무조건 equals로 비교해야한다!!
		//String 클래스에 equals 메소드 이미 오버라이딩 돼있음
		//Object 클래스 확인해보면 원래는 주소값을 동등비교하는 메소드임
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		//String 클래스의 hashCode 메소드 이미 오버라이딩 돼있음 
		//(주소값이 아닌 실제 담겨있는 문자열(hello)를 가지고 해쉬코드를 만듬)
		
		//나는 주소값을 꼭 알고싶다
		//System.identitiyHashCode(레퍼런스);
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		
		
		
		

	}
	
	
	
	



}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


