package com.kh.operator;

public class B_InDecrease {
	//쪽지 시험을 본다
	/*
	 * 증강 연산자 (단항 연산자)
	 * ++ : 변수에 담긴 값 1증가 시켜주는 연산자
	 * 		++변수,변수++
	 * -- : 변수에 담긴 값 1감소 시켜주는 연산자
	 * 		--변수,변수--
	 * 
	 * (증감연산자)변수 : 전위연산 >> "선증감" 후처리
	 * 변수(증감연산자) : 후위연산 >> 선처리 "후증감"
	 *  
	 */
	public void method1() {
		
		//전위 연산 테스트
		int num1 =10;
		System.out.println("전위 연산 적용전 num1의 값:"+num1);//num1 = 10출력
		System.out.println("1회 수행후 결과:"+ ++num1);// num1 =11출력
		System.out.println("2회 수행후 결과:"+ ++num1);// num1 =12출력
		System.out.println("3회 수행후 결과:"+ ++num1);// num1 =13출력
		System.out.println("최종 num1의 값:"+ num1);
		
		
		System.out.println("=======================");
		//후위 연산 테스트
		
		int num2 = 10;
		System.out.println("후위연산 적용전 num2의 값:"+num2);//10
		System.out.println("1회수행 후 결과 :" +num2++);//10
		System.out.println("2회수행 후 결과 :" +num2++);//11
		System.out.println("3회수행 후 결과 :" +num2++);//12
		System.out.println("최종 num2의 값" +num2);//13
		
		
		
	}
		public void method2() {
			
			int a = 10;
			int b = ++a;
			System.out.printf
			("a:%d,b:%d",a,b);
			
			
			
			int c= 10;
			int d= c++;
			System.out.printf("c:%d:%d\n",c,d);
			
			
			int num =20;
			System.out.println("현재 num :"+num);//20
			System.out.println("++num은? :"+ ++num);//21
			System.out.println("num++은? :"+ num++);//21(22)
			System.out.println("--num은? :"+ --num);//21
			System.out.println("num--는? :"+ num--);//21
			System.out.println("최종 num :"+ num);//20
		
		
		}
			public void method3() 	{
			int num1 = 20;
			int result =++num1 *3;
			System.out.printf("num1 : %d, result : %d\n",num1,result);
			
			int num2 = 20;
			int result2 = num2++ *3;
			System.out.printf("num2 : %d, result2 : %d\n",num2,result2);
				
				
				
			}
		
		public void method4 () {
			
			int a = 10;
			int b = 20;
			int c = 30;
			
			System.out.println(a++);//a=10/11
			System.out.println((++a)+(b++));//a=12/b=20/21
			System.out.println((a++)+(--b)+(--c));//a=12/13/b=20/c=29
			System.out.printf("a : %d, b : %d, c : %d,",a,b,c);
			
		}
		
}
		
		
		
		
		
		
			
		
		
		
	
	
	
	
	
	

