package com.kh.variable;

public class C_printf {
	
	public void printfTest() {
		
		//System.out.print(출력하고자 하는 값);/출력만해줌 /줄바꿈 없음
		//System.out.println(출력하고자 하는 값);//출력 후 /줄바꿈 발생
		//System.out.printf("출력하고자 하는 형식(포맷)",출력하고자 하는 값);
		//출력하고자 하는 값들이 제시한 형식(포맷)에 맞춰서 출력만 진행
		
		/*
		 * 포맷 안에서 쓰일 수 있는 키워드
		 * %d : 정수
		 * %c : 문자
		 * %s : 문자열 / 문자도 가능
		 * %f : 실수
		 * 
		 */
		int iNum1 = 10;
		int iNum2 = 20;
		// "10 20"
		System.out.println(iNum1+""+iNum2);
		System.out.printf("%d %d",iNum1,iNum2);
		System.out.println("하하");
		System.out.println();//printf는 줄바꿈 안돼서 이걸 넣어줘야함
		//System.out.printf("%d %d% ",iNum1,iNum2); %뒤에는 원래 포맷 키워드가 와야됨
		
		System.out.printf("%d %d%% ",iNum1,iNum2);
		
		//정렬하고자 할 때 많이 쓴다
		
		System.out.printf("%5d\n", iNum1);//양수 5 오른쪽 정렬
		
		System.out.printf("%-5d\n", iNum2);//음수 5 왼쪽 정렬
		
		
		System.out.printf("%5d\n", 250);
		System.out.printf("%5d\n",3000);
		System.out.printf("%5d\n",16);
		
		double dNum1 =1.23456789;
		double dNum2 = 4.53;
		System.out.printf("%f\t%f", dNum1,dNum2);// 무조건 소수점 아래 6번째 자리 까지 보여줌
		System.out.println();
		System.out.printf("%.2f %.1f", dNum1,dNum2);
		
		char ch ='a';
		String str = "hello";
		System.out.println();
		System.out.printf("%c %s %s",ch,str,ch);
		System.out.println();
		System.out.printf("%C %S %S",ch,str,ch);//대문자로 출력된다.
		
		
		
		
		

	}


}

