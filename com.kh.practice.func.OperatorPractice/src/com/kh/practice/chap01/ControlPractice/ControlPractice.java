package com.kh.practice.chap01.ControlPractice;

import java.util.Scanner;

public class ControlPractice {
	public void practice1 () {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1입력");
		System.out.println("2수정");
		System.out.println("3조회");
		System.out.println("4삭제");
		System.out.println("7종료");
		System.out.println("메뉴 번호를 입력하세요 :");
		
		int num = sc.nextInt();
		
		switch (num) {
		case 1:
			System.out.println("입력메뉴입니다");
			break;
		case 2:
            System.out.println("수정 메뉴입니다.");
            break;
        case 3:
            System.out.println("조회 메뉴입니다.");
            break;
        case 4:
            System.out.println("삭제 메뉴입니다.");
            break;
        case 7:
            System.out.println("프로그램이 종료됩니다.");
            sc.close();
            return;
        default:
            System.out.println("잘못 입력하셨습니다.");
    
		}	
		
	}

	public void practice2 () {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 한 개 입력하세요:");
		int num = sc.nextInt();
	     if (num > 0) {
	            if (num % 2 == 0) {
	                System.out.print("짝수다");
	            } else {
	                System.out.print("홀수다");
	            }
	        } else {
	            System.out.print("양수만 입력해주세요.");
	        }

	        sc.close();
	    }
	public void practice3 () {
		Scanner sc = new Scanner(System.in);
		 	System.out.print("국어점수 : ");
	        int korean = sc.nextInt();
	        System.out.print("수학점수 : ");
	        int math = sc.nextInt();
	        System.out.print("영어점수 : ");
	        int english = sc.nextInt();

	        int sum = korean + math + english;
	        double average = sum / 3.0;
	        
	        if (40<=korean && 40<=math && 40<=english && 60 <= average ) {
	       System.out.println("국어:"+korean);
	       System.out.println("수학:"+math);
	       System.out.println("영어:"+english);
	       System.out.println("합계:"+sum);
	       System.out.println("평균:"+average);
	       System.out.println("축하합니다 합격입니다");

	        sc.close();
	    
	 }
}    
	 public void practice4 () {
		Scanner sc = new Scanner (System.in);
		System.out.print("1~12사이의 정수 :");
		 int num =sc.nextInt();
		 switch (num) {
		 case 3: case 4: case 5:
             System.out.println(num + "월은 봄입니다.");
             break;
         case 6: case 7: case 8:
             System.out.println(num + "월은 여름입니다.");
             break;
         case 9: case 10: case 11:
             System.out.println(num + "월은 가을입니다.");
             break;
         case 12: case 1: case 2:
             System.out.println(num + "월은 겨울입니다.");
             break;
         default:
             System.out.println(num + "월은 잘못 입력된 달입니다.");
     }

     sc.close();
	 }
            
}	
		        
       
	
	
	
	
	
	
