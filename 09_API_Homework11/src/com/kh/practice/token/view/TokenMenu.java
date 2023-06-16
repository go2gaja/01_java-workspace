package com.kh.practice.token.view;

import java.util.Scanner;

import com.kh.practice.token.controller.TokenController;

public class TokenMenu {
	
	private Scanner sc = new Scanner(System.in);
	private TokenController tc =new TokenController();
	
		
	public void mainMenu() {//잘못 입력했을 시  출력후 반복? while,if?
		while(true) {
			System.out.println("1. 지정 문자열");
			System.out.println("2. 입력 문자열");
			System.out.println("9. 프로그램 끝내기");
			System.out.print("메뉴 번호 :");
			int pick =sc.nextInt();
			
			sc.nextLine();
			
			if(pick ==1) {
				tokenMenu();
			}else if (pick== 2) {
				inputMenu();
			}else if (pick==9) {//"프로그램을 종료합니다"
				System.out.println("프로그램을 종료합니다.");//반복할려면? 
				 return;
			}else {
				System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
			}
								
		}
		
	}
	    public void tokenMenu() {
        // 토큰 메뉴 구현
    	// 토큰 처리 전 글자, 토큰 처리 전 개수를 출력
    	// TokenController(tc)의 afterToken()의 반환 값을 가지고
    	// 토큰 처리 후 글자, 토큰 처리 후 개수, 모두 대문자로 변환 한 것을 출력

	    	String str = "J a v a P r o g r a m ";
			System.out.println("토큰 처리 전 글자: " + str);
			System.out.println("토큰 처리 전 개수: " + str.length());

			String afterToken = tc.afterToken(str);
			System.out.println("토큰 처리 후 글자: " + afterToken);
			System.out.println("토큰 처리 후 개수: " + afterToken.length());
			System.out.println("모두 대문자로 변환: " + afterToken.toUpperCase());
		}

	
	/* tc에 firstCap()로 입력 받은 문자열을 넘기고 반환 값 출력
	찾을 문자를 하나 입력하세요 : 
	 tc에 findChar()로 위에 입력 받은 문자열과 방금 받은 문자를 인자로 넘겨
	 반환 값 출력
	String first = tc.firstCap(input);
    	System.out.println(" :");

	 입력 메뉴 구현
	 tc에 firstCap()로 입력 받은 문자열을 넘기고 반환 값 출력
	찾을 문자를 하나 입력하세요 : 
	 tc에 findChar()로 위에 입력 받은 문자열과 방금 받은 문자를 인자로 넘겨
	반환 값 출력
	*/

    public void inputMenu() {
    	
    	System.out.print("문자열을 입력하세요 :");//문자열을 입력하세요 :
    	String input =sc.nextLine();
    	
    	String fc = tc.firstCap(input);
    	System.out.println("첫 글자 대문자 :"+fc);
    	
    	System.out.print("찾을 문자 하나를 입력하세요 :");
    	char find =sc.nextLine().charAt(0);
    	
    	int fch = tc.findChar(input, find);
    	System.out.println("'"+find+"문자가  들어간 개수 :"+fch);
    	
	
    }

}
