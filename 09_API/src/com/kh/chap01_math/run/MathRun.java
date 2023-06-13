package com.kh.chap01_math.run;

public class MathRun {

	public static void main(String[] args) {
		
		//java.lang.Math(String,Object)>> 굳이 import 안해도 사용할 수 있음
		
		
		System.out.println("파이 :" +Math.PI);//상수 필드
		
		//절대값을 알고자 할 때 : abs(앱솔루트) 
		
		int num = -10;
		System.out.println("절대값 :"+Math.abs(num));//오버로딩
		
		//올림 : ceil : 크거나 같은 정수 값
		double num2 = 4.349; // 이것보다 크거나 같은 정수값 => 5
		double num3 = -10.594;//이것보다 크거나 같은 정수값 => -10
		
		System.out.println("올림한 결과 :"+Math.ceil(num2));
		System.out.println("올림한 결과 :"+(int)Math.ceil(num3));
		
		//반올림 : round
		System.out.println("반올림 :"+ Math.round(num2));
		
		//버림 : floor
		System.out.println("버림"+Math.floor(num2));
	
		//가장 가까운 정수값을 알아낸 후 실수형으로 변환 :rint
		
		System.out.println("가장 가까운 정수값 :"+Math.rint(num2));
		
		
		//제곱근(루트) : sqrt
		
		System.out.println("4의 제곱근 :"+Math.sqrt(4));
		
		//제곱 : pow
		System.out.println("2의 10 제곱 :"+Math.pow(2,10));
		
		// Math m = new Math();
		
		/*
		 * Math 특징
		 * 모든 필드 상수필드, 모든 메소드 static 메소드
		 * 생성자가 private로 막혀있음>>생성 불가능
		 * 
		 * 한번만 메모리 영역에 올려놓고 재사용 하는 개념>>싱글톤 패턴
		 * 
		 * openjdk11 document<갖가지 변수 참고
		 * 
		 * 
		 */
		
		
		
		
		
	}

}