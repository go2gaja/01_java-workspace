package com.kh.chap05_constructor.run;

import com.kh.chap05_constructor.model.vo.User;

public class ConstructorRun {

	public static void main(String[] args) {
		//1.기본생성자로 객체 생성
		User u1= new User();
		System.out.println(u1.information());
		//각 필드에 JVM초기값들 담겨있음
		
		
		
		
		//회원가입시 필수 입력사항만 입력 받는다면?
		/*
		User u2 = new User();
		u2.setUeserId("user02");
		u2.setUerPwd("pwd02");
		u2.setUserName("차은우");
		System.out.println(u2.information());
		*/
		
		
		//2 매개변수 3개짜리 생성자로 객체 생성후 정보 출력
		User u2 = new User("user02","pwd02","차은우");
		System.out.println(u2.information());
		
		//setter 안만들면 안되나>>절때 안됨
		//비번을 바꾸는 경우,개명을 한 경우 이름
		u2.setUserName("으누차");
		System.out.println(u2.information());
		
		
		//getter는
		//비번을 까먹은 경우에는 비번만 보여줘야함. 그때 getter필요
				
			
		//3. 매개변수 5개자리 생성자로 객체 생성
		//"user03" "pwd03" "장원영" 23 '여'
		
		User u3= new User("user03","pwd03","장원영",23,'여');
		System.out.println(u3.information());
	}

}
