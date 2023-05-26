package com.kh.variable;

public class D_Cast {
	
	/*
	 * 형변환 : 값의 자료형을 바꾸는 것
	 * 컴퓨터에서의 값 처리 규칙/형변환이 필요한 상황
	 * 1. 대입 연산자 기준으로 왼쪽과 오른쪽은 같은 자료형이야 한다
	 * >>즉 같은 자료형에 해당하는 값만 대입 가능 
	 * >>즉 다른 자료형의 값을 대입하고자 한다면 형 변환이 필수이다
	 * 
	 * [표현법] 변수명= (자료형)값;
	 * 
	 * 2. 같은 자료형 끼리만 연산이 가능
	 * 
	 * 값+ 값 = > 계산 결과도 같은 자료형으로 나옴
	 * 예시 int+int= int double+double= double
	 * 
	 * 형변환 종류
	 * 1. 자동 형변환 => 자동으로 형변환이 이뤄져서 우리가 형변환을 시킬 필요가 없음
	 * 2. 강제(명시적) 형변환 => 자동형변환이 안돼서 우리가 직접 형변환을 해줘야함
	 * 
	 * [표현법] (바꿀자료형) 값
	 * 
	 * 주의사항
	 * boolean은 형변환이 불가능
	 * 
	 */
	
	public void autoCasting() {
		
		/*
		 * 자동 형변환
		 * 값의 범위가 작은 자료형 큰 자료형이 연산시
		 * 자동으로 범위가 작은 자료형을 큰 자료형으로 변환후 처리해줌
		 * 대입은 타입이 같지 않으면 절때 안됨
		 * 
		 */
		
		//1. int(4byte) => double(8byte)
		int i1 = 12;
		double d1 =/*(double)*/ i1 ;
		
		//엄청 큰 박스에는 작은 박스를 담을 수 있음/자동형변환 가능
		System.out.println(d1);
		
		int i2 =12;
		double d2 = 3.3;
		double result =/*(double)*/ i2 +d2;
		System.out.println("result:"+result);
		
		//2. int (4byte) >> long (8byte)
		int i3 =1000;
		long l3 =/*(long)*/ i3;
		
		//3. float(fbyte) >> double(8byte)
		float f4 = 1.0f;
		double  d4 =/*(double)*/f4;
		
		
		//---특이 케이스 ---
		
		//4. long(8byte) >> float((4byte)
		//   float이 실수형이기 때문에 long 형보다 표현 가능한 수의 범위가 더 커서 자동변형이 됨
		long l5 = 100000000L;
		float f5 =/*(float)*/ 15;
		
		//5. char (2byte) <=> int(4byte)
		int num =/*(int)*/ 'A';
		System.out.println(num);
		
		char ch =/*(char)*/ 71;
		System.out.println(ch);
				
		//아스키 코드
		
		//각 문자들마다 고유한 숫자가 지정되어 있기 때문에 쌍방향으로 형전환 가능
		//char는 음수값 저장 불가 >> 값의 범위가 0~65535
		
		//6. byte 또는 short간의 연산
		
		byte b1=1;
		byte b2=10;
		
		//byte b3=b1+b2;/byte나 short은 연산시 무조건 int형으로 처리함
		//연산 결과가 범위가 더 큰 int 형임 >> byte형에 대입 불가
		byte b3 = (byte)(b1+b2);
		System.out.println("b3:"+ b3);
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
}
