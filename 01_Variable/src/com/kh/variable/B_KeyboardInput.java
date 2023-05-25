package com.kh.variable;

import java.util.Scanner;

//사용자가 키보드로 입력한 값을 받아들이는 Scanner 실습
public class B_KeyboardInput {

	public void inputTest1() {
	/*
	 * 키보드로 값을 입력 받는 방법
	 * Scanner를 사용한다
	 * 즉 java.util.Scanner 클래스를 이용하는 것	
	 * Scanner 클래스 내부의 매소드를 호출해서 입력받는 것
	 */
		
		//스캐너 생성(new)
		Scanner sc = new Scanner(System.in);
		// System.in 은 입력받은 값을 바이트 단위로 받아들이겠다는 의미
		
		System.out.print("아무거나 입력해보세요:");
		String message = sc.nextLine();
		System.out.println("입력받은 내용:"+message);
		
		sc.close(); //Scanner를 쓰고나면 sc.close();로 닫아줘야함

}
	;
	public void inputTest2 () {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("당신의 이름은 무엇입니까?");
		String name = sc.nextLine();
		System.out.println("제이름은"+name+"입니다");
		
		// 사용자가 입력한 값을 문자열로 받아오는 메소드(nextLine(),next())
		//String name = sc.next();
		// next() : 사용자가 입력한 값 중 공백이 있을 경우 공백 이전까지의 값만 읽어옴 
		//따라서 거주지처럼 공백이 있는 데이터는 재대로 된 값을 못가져올 수 도 있음
		// nextLine() : 사용자가 입력한 값 모두 읽어옴/엔터 전까지의 모든값
		
		System.out.print("당신의 나이는 몇 살입니까?:");
		int age = sc.nextInt();//사용자가 입력한 값을 정수로 읽어드리는 메소드
		
		System.out.println("당신의 키는 몇 입니까 (소수점 첫째 자리까지:");
		double height = sc.nextDouble();// 사용자가 입력한 값을 실수로 읽어들이는 메소드
		
		// xxx님은 xx살이며 키는 xxx.x cm 입니다
		System.out.println(name+"님은"+age+"살이며"+height+"cm입니다");
		
		
		sc.close();
	}
		
		//키보드로 값을 입력 받을 때 종종 발생되는 문제
		
		public void inputTest3 () {
		//스캐너 생성
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 :");
		String name = sc.nextLine();
		
		System.out.print("나이");
		int age = sc.nextInt();
		
		System.out.print("주소");
		String address = sc.nextLine();
		
		System.out.println("키");
		double height =sc.nextDouble();
		
		System.out.println(name+"님은"+age+"살이며"+address+"살고"+height+"입니다");
		
		sc.close();
			
		}
		
		
		public void inputTest4 () {
		// 스캐너 생성
			Scanner sc = new Scanner(System.in);
			//문자열을 입력 받을 때 > sc.nextLine() sc.next() > 문자만 공백까지만
			//정수값을 입력 받을 때 > sc.nextInt() 
			//실수값을 입력 받을 때 > sc.nextDoble()
			
			System.out.print("이름:");
			String name = sc.nextLine();
			
			System.out.print("성별(M/F) :");
			//char gender = sc.nextchar(); nextchar()와 같은 메소드는 없음
			char gender = sc.nextLine().charAt(0);
			// 문자열.charAt(인덱스) : 해당 문자열로부터 해당 인덱스의 문자를 추출해주는 메소드
			// ** 인덱스 : 순번 같은 존재. 단 0부터 시작함
			System.out.print("나이:");
			int age = sc.nextInt();
			
			System.out.println("키:");
			double height = sc.nextDouble();
			
			/*
			 *xxx님의 개인정보
			 *성별 : x
			 *나이 : xx
			 *키 : xxx.x 
			 */
			
			System.out.println(name+"님의 개인 정보");
			System.out.println("성"+gender);
			System.out.println(age+"살");
			System.out.println(height+"입니다");
			
			sc.close();
			
}			
			
		public void charAtTest () {
			
		String str = "Hello";
		
		// 변수에 기록하여 출력하는 방식
	
		char ch = str.charAt(0); // h
		System.out.println(ch);	
		
		// 바로 출력하는 방식
		System.out.println(str.charAt(3));
		//존재하지 않는 인덱스 : 오류가 발생함
		//예시 System.out.println(str.carAt(12);// String index out of Bounds Exception
		/*
		 * 정리
		 * 1. 콘솔창에 /모니터/ 출력하기 위해 : System.out/print[in]() 메소드 이용
		 * 2. 콘솔창에 (키보드) 입력받기 위해 : Scanner 이용해서 (nextLine(),next(),nextInt(),nextDouble()...)
		 * >> 주의 사항 1) sc.nextXXX() 메소드 뒤에 sc.nextLine() 메소드가 와야할 경우 sc.nextLine()메소드를 한번 더 써줘서 버퍼에 남아있는 '엔터'를 빼주는 과정 필수
		 * 
		 * 2) '문자' 값을 입력 받아야 될 경우 sc.nextLine()메소드를 통해 우선 문자열로 받고 그 뒤에 .charAt(인덱스값) 메소드를 통해서 문자하나 추출
		 * 
		 * 
		*/
		
		
			
			
		}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}

		
	

