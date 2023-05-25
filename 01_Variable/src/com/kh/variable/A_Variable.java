package com.kh.variable;

public class A_Variable {
	//시급과 근무시간,근무일수를 곱해서 월급을 계산해서 출력하는 메소드
	public void printVarible() {
		System.out.println("===변수 사용 전===");
		
		System.out.println("시급: 9620원");
		System.out.println("근무일수: 6일");
		System.out.println("근무시간: 8시간");
		// 월급 =시급x 근무시간x 근무일수
		// 차은우 : 000원 형식으로 출력
		System.out.println("차은우:"+(9620*6*8)+"원");
		System.out.println("주지훈:"+(9620*6*6)+"원");
		System.out.println("이재훈"+(9620*6*6)+"원");
		System.out.println("장원영"+(9620*6*6)+"원");
		System.out.println("고경원"+(9620*6*6)+"원");
		//변서 사용 후
		System.out.println("----변수 사용 후-----");
		//숫자를 담을수 있는 자료형= int
		int pay = 9620; 
		int time = 8;
		int day = 6;
		//int pay 20000;
		
		System.out.println("차은우:"+(pay*day*time)+"원");
		System.out.println("주지훈:"+(pay*day*time)+"원");
		System.out.println("이재훈"+(pay*day*time)+"원");
		System.out.println("장원영"+(pay*day*time)+"원");
		System.out.println("고경원"+(pay*day*time)+"원");
				
/*
 * 범위 주석
 * 변수를 사용하는 이유
 * 1. 변수는 우선적으로 값에 의미를 부여할 목적으로 쓴다./가독성이 높아진다
 * 2. 단 한번 값을 기록하고 필요할 때마다 가져다 쓰는 목적으로 쓴다./재사용성이 높아진다
 * 3. 유지 보수를 보다 쉽게 할 수 있다.
 * 
 */
		System.out.println("시급"+pay);
		System.out.print("aaaa");
		System.out.println("bbbb");
				
	}
	//변수의 선언을 공부하기 위한 메소드
	public void decleareVariable() {
	
/*변수의 선언
 * 값을 기록하기 위한 변수 메모리 공간에 확보 
 * [표현법] 자료형 변수이름;
 * 
 * 자료형 : 변수의 크기 및 모양을 지정해주는 부분
 * 변수 이름 : 변수의 이름을 붙여주는 부분 (의미 부여)
 * 변수 선언시 주의 할 점 
 * 1.변수 이름은 소문자로 시작/ 단 낙타봉 표기법은 지킬것
 * 2.같은 영역 안 ({}) 애서는 동일한 변수명으로 선언 불가 ! => 즉 중복이 불가능함
 * 3.해당 영역 안 ({}) 에서 선언한 변수는 그 영역 안에서만 사용 가능
 * => 다른 메소드 에서는 사용이 불가능하다. 
 */
// ----- 자료형에 대한 개념 ----
// 1. 논리형 (논리값= true / false)
		boolean isTrue;
		boolean isFalse = false; //1byte 변수 선언과 동시에 값을 대입
		
		//sys하고 아래 고르는것도 있음
		//sysout 컨트롤 스페이스
		System.out.println("isFalse의 값"+isFalse);
		isTrue = 1+3 > 1; //1+3 이 1보다 큰가? 참입니다/ture
		isFalse = 4+ 2 < 1.;// 4+2 가 1보다 작냐? /false
// 2_1 정수형 /소수점x
		byte bNum = 100; // 1byte /-128~127
		
		short sNum = 1000; //2byte
		
		int iNum = 10000; // 4byte /정수형의 기본 자료형
		
		long lNum = 100000; // 8byte  
		
// 2_2 실수형 / 소수점o
		float fNum = 0.0f; // 4byte => 소수점 7자리까지 표현가능
						   // float은 double과 값을 구분하기 위해 값 뒤에 f를 붙임	
		double dNum = 0.12345; //8byte => 소수점 15자리까지 표현 가능/실수형의 기본 자료형

// 3. 문자형
// 3_1 문자
		char ch= 'a'; //2 byte 큰따움표 말고 작은따움표로
		char kim;
		kim = '김';
		
// 3_2 문자열 // 
		String str;// 참조자료형 색깔 안바뀌는게 특징
		str = "abc";
		// 값이 잘 담겨있는지 확인해보자
		// 변수명 : 변수값
		System.out.println("isTrue:"+isTrue);
		System.out.println("isTrue:"+isFalse);
		System.out.println("byte:"+bNum);
		System.out.println("short:"+iNum);
		System.out.println("long:"+lNum);
		System.out.println("float:"+fNum);
		System.out.println("double:"+dNum);
		System.out.println("isTrue:"+isTrue);
		System.out.println("byte:"+sNum);
		System.out.println(bNum);
		
		//상수의 선언
		//[표현법]final 자료형 상수 이름;(대문자)
		final int AGE;
		AGE = 10; //초기화
		System.out.println("AGE:"+AGE);
		//AGE = 11; 상수는 절때 수정할 수 없음
		//대표적인 상수의 예 : 3.14/파이 원주율
		System.out.println("파이:"+Math.PI);
		
		// 번외 :가독성을 위해 언더바를 사용할 수 있음
		int etc = 999_999_999;
		System.out.println("etc:"+etc);
		
		// *변수 명명 규칙
		int number;
		
		// 1) 같은 영역내에 중복된 이름 안됨
		// int number;
		int numBer;
		
		// 2) 예약어 /자바에서 사용되고 있는 키워드/안된다
		
		// int true;
		// int class;
		// int public;
		
		// 3) 숫자 사용가능하나 /단 숫자로 시작하는건 불가
		int number1;
		int num1ber;
		//int 1number;
		
		// 4) 특수문자 사용 가능하나/단 _랑 $이외에는 사용 불가능
		int number_1;
		int number$1;
		//int number!1;
		
		// 권장사항 //오류는 안나나 지켜줫으면 하는것/개발자간의 규칙
		// 1) 낙타표기법
		String username;//관례상 틀립
		String userName;//관례상 맞음
		String userNameTest;
		
		//2)한글 사용 가능 하나 무조건 영문자로 작성
		String 이름;
		int 나이; //한글을 사용하지 않는 환경에서 오류가 있을수 있음
		
		
		
		
		
		
		
	}

}
	