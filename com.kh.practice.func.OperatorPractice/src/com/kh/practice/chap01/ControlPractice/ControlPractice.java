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
       
	 public void practice5 () {
		
		 Scanner sc= new Scanner(System.in);
		 
		 System.out.print("아디 :");
		 String id =sc.nextLine();
		 
		 System.out.print("비번 :");
		 String pw =sc.nextLine();
		 
		 String id1 ="myId";
		 String pw1= "myPassword12";
		 
		 
		  
		 if(id.equals(id1)) {
		    if(pw.equals(pw1)) {
				 System.out.println("로그인성공");
			 }else {
				 System.out.println("비밀번호가 틀렸습니다");
			 }
			 
		 }else {
			 System.out.println("아이디가 틀렸습니다");
		 }
		 
		 
		 sc.close();
	 }
	 
	 public void practice6( ) {
		 //과일 계산 
		 Scanner sc = new Scanner(System.in);
		 System.out.println("권한을 확인하고자 하는 회원 등급:(관리자,회원,비회원)");
		 
		  
		 
		 String privilege =sc.nextLine();
		 
		 switch (privilege) {
		 case "관리자":
			 System.out.println("회원관리, 게시글 관리,");
			 
		 case  "회원" :
			 System.out.println("게시글 작성,댓글 작성");
			
		 case "비회원" :
			 System.out.println("게시글 조회");
		 	 
		 
		 
		 
		 }
		 
		 
	 }
	 public void practice7( ) {
		 Scanner sc = new Scanner(System.in);
		 System.out.print("키(m)를 입력해 주세요 : ");
	     double height = sc.nextDouble();
	     System.out.print("몸무게(kg)를 입력해 주세요 : ");
	     double weight = sc.nextDouble();

	     double bmi = weight / (height * height);
	     System.out.println("BMI 지수 : " + bmi);

	     if (bmi < 18.5) {
	    	 	System.out.println("저체중");
	     } else if (bmi >= 18.5 && bmi < 23) {
	            System.out.println("정상체중");
	     } else if (bmi >= 23 && bmi < 25) {
	            System.out.println("과체중");
	     } else if (bmi >= 25 && bmi < 30) {
	            System.out.println("비만");
	     } else {
	            System.out.println("고도 비만");
	     }
	}
	 public void practice8( ) {
		 
		 Scanner sc = new Scanner(System.in);
		 
		
		System.out.print("피연산자1 입력 : ");
		int operand1 = sc.nextInt();
		System.out.print("피연산자2 입력 : ");
		int operand2 = sc.nextInt();
		System.out.print("연산자를 입력(+,-,*,/,%) : ");
		String operator = sc.next();

		if (operand1 <= 0 || operand2 <= 0) {
		             System.out.println("양수만 입력해주세요.");
		           
		         }

		         switch (operator) {
		             case "+":
		                 System.out.println(operand1 + " + " + operand2 + " = " + (operand1 + operand2));
		                 break;
		             case "-":
		                 System.out.println(operand1 + " - " + operand2 + " = " + (operand1 - operand2));
		                 break;
		             case "*":
		                 System.out.println(operand1 + " * " + operand2 + " = " + (operand1 * operand2));
		                 break;
		             case "/":
		                 System.out.println(operand1 + " / " + operand2 + " = " + (double)operand1 / operand2);
		                 break;
		             case "%":
		                 System.out.println(operand1 + " % " + operand2 + " = " + (operand1 % operand2));
		                 break;
		             default:
		                 System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
		                 break;
		         }
		     }
		

    
		
		}
		 
		 
		 	
		 


		 
		 
		 

	 
	 
	 
	 
	 	
		        
       
	
	
	
	
	
	
