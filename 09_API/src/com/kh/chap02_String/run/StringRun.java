package com.kh.chap02_String.run;

import com.kh.chap02_String.Control.A_StringPoolTest;
import com.kh.chap02_String.Control.B_String;
import com.kh.chap02_String.Control.C_StringTokenizerTest;

public class StringRun {

	public static void main(String[] args) {
	/*
		String s = "안녕";//참조 자료형
		int a = 10;//기본 자료형
	*/	
		
		//1. 생성자를 통한 문자열  생성
		
	A_StringPoolTest a= new A_StringPoolTest();
	//a.method();
	
	B_String b = new B_String();
	//b.method();
	
	C_StringTokenizerTest c = new C_StringTokenizerTest();
	c.method();
		
		

	}

}
