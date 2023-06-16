package com.kh.practice.array;

import java.util.Arrays;
import java.util.Scanner;

public class A_ArrayPractice {
	/*
	 * 길이가 10인 배열을 선언하고 1부터 10까지의 값을 반복문을 이용하여
		순서대로 배열 인덱스에 넣은 후 그 값을 출력하세요.
		ex.
		1 2 3 4 5 6 7 8 9 10
	 */
	
	//// 배열의 길이
    //int length = array.length;
   	/**
   	 * 
   	 */
   	public void  method1() {
   		int arr[]=new int[10];//1~10
   		System.out.println("길이가 1~10까지의 값");
   	for(int i=0; i<arr.length;i++) {//i 가 0이면 arr.length가 i보다 클때 i+ 
   		arr[i]=i+1;//i출력 i+1
   	}
   	for(int i=0; i<arr.length;i++) {
   		System.out.print(arr[i]+" ");
   	}
 }
   	
   	
		/*
		 * 길이가 10인 배열을 선언하고 1부터 10까지의 값을 반복문을 이용하여
			역순으로 배열 인덱스에 넣은 후 그 값을 출력하세요.
			ex.
			10 9 8 7 6 5 4 3 2 1
		 */
   	public void method2() {
		int arr[]=new int[10];//1~10
   		System.out.println("길이가 1~10까지의 값");
   	for(int i=0; i<arr.length;i++) {//i 가 0이면 arr.length가 i보다 클때 i+ 
   		arr[i]=10-i;//10-i 
   	}
   	for(int i=0; i<arr.length;i++) {
   		System.out.print(arr[i]+" ");
   	}
 }
   	/*
   	사용자에게 입력 받은 양의 정수만큼 배열 크기를 할당하고
   	1부터 입력 받은 값까지 배열에 초기화한 후 출력하세요.
   	ex.
   	양의 정수 : 5
   	1 2 3 4 5 
	*/
   	public void method3() {
   		Scanner sc = new Scanner(System.in);
   		System.out.print("양의 정수:");
   		
   		int num=sc.nextInt();
   		int arr[]=new int[num];//정수
   		
   		
   		for(int i=0;i<arr.length;i++) {//i 가 0이면 arr.length가 i보다 클때 i+ 
   			arr[i]=i+1;
   	}

   		for(int i=0;i<arr.length;i++) {
   			System.out.print(arr[i]+" ");
   		}
   	} 	
   	
   	/*
   	 * 길이가 5인 String배열을 선언하고 “사과”, “귤“, “포도“, “복숭아”, “참외“로 초기화 한 후
	배열 인덱스를 활용해서 귤을 출력하세요.
	ex.
	귤

   	 */
   	
   	public void method4() {
   		String[]fruit= {"사과","귤","포도","복숭아","참외"};
   		
   		System.out.println(fruit[1]);
   	}
   	
   	
   	
   	/*
   	 * 문자열을 입력 받아 문자 하나하나를 배열에 넣고 검색할 문자가 문자열에 몇 개 들어가 있는지
		개수와 몇 번째 인덱스에 위치하는지 인덱스를 출력하세요.
		ex.
		문자열 : application
		문자 : i
		application에 i가 존재하는 위치(인덱스) : 4 8 
		i 개수 : 2

   	 */
   	public void method5() {
   		
   	 Scanner scanner = new Scanner(System.in);//입력 받아

     System.out.print("문자열: ");//출력
     String str = scanner.nextLine();//문자열 String

     System.out.print("문자: ");
     char ch = scanner.next().charAt(0);//문자 char

     int count = 0;
     System.out.print(str + "에 " + ch + "가 존재하는 위치(인덱스): ");//문자열에 문자가 존재하는 위치
     for (int i = 0; i < str.length(); i++) {
         if (str.charAt(i) == ch) {
             System.out.print(i + " ");
             count++;
         }
     }

     System.out.println();
     System.out.println(ch + " 개수: " + count);
    	}


   	/*
   	 * “월“ ~ “일”까지 초기화된 문자열 배열을 만들고 0부터 6까지 숫자를 입력 받아
	입력한 숫자와 같은 인덱스에 있는 요일을 출력하고
	범위에 없는 숫자를 입력 시 “잘못 입력하셨습니다“를 출력하세요.
	ex.
	0 ~ 6 사이 숫자 입력 : 4 0 ~ 6 사이 숫자 입력 : 7
	금요일 잘못 입력하셨습니다.

   	 */
   	public void method6() {
   		//먼저 sc부터 만들기
   		Scanner sc= new Scanner(System.in);
   		
   		System.out.print("0 ~ 6 사이 숫자 입력 :");
   		int num =sc.nextInt();
   		//String 만들기
   		String [] day= {"월", "화", "수", "목", "금", "토", "일"};
   	 if (num >= 0 && num <= 6) {//boolean 0~6
         System.out.println(day[num] + "요일");//월~일+"요일"
     } else {
         System.out.println("잘못 입력하셨습니다.");   	
         }
   		
   	}
   	
   	/*
   	 * 사용자가 배열의 길이를 직접 입력하여 그 값만큼 정수형 배열을 선언 및 할당하고
	배열의 크기만큼 사용자가 직접 값을 입력하여 각각의 인덱스에 값을 초기화 하세요.
	그리고 배열 전체 값을 나열하고 각 인덱스에 저장된 값들의 합을 출력하세요.
	ex.
	정수 : 5
	배열 0번째 인덱스에 넣을 값 : 4
	배열 1번째 인덱스에 넣을 값 : -4
	배열 2번째 인덱스에 넣을 값 : 3
	배열 3번째 인덱스에 넣을 값 : -3
	배열 4번째 인덱스에 넣을 값 : 2
	4 -4 3 -3 2 
	총 합 : 2

   	 */
   	
   	public void method7() {
   		//인덱스에 저장할 값을 입력받아 배열을 초기화>>sc
   		
   		Scanner sc= new Scanner(System.in);
   		
   		System.out.print("정수 :");
   		int num=sc.nextInt();

   		int[] arr = new int[num];
   		
   	 for (int i = 0; i < arr.length; i++) {
         System.out.print("배열 " + i + "번째 인덱스에 넣을 값: ");
         arr[i] = sc.nextInt();
     
       	/*여기까지 했음>> 사용자가 배열의 길이를 직접 입력하여 그 값만큼 정수형 배열을 선언 및 할당하고
     	배열의 크기만큼 사용자가 직접 값을 입력하여 각각의 인덱스에 값을 초기화 하세요.
     	*/
         
   	 }
   	 System.out.print("배열");
   	 for(int i=0; i<arr.length;i++) {
   		 System.out.print(arr[i]+" ");
   	 }
         
        int num1=0; 
   	 for(int i=0;i<arr.length;i++) {
   		 num1+=arr[i];
   		 
   	 }
   	System.out.println();
    System.out.println("총 합: " + num1);
   	 
   	 
   	 }
   	 
   	/*
   	 * 3이상인 홀수 자연수를 입력 받아 배열의 중간까지는 1부터 1씩 증가하여 오름차순으로 값을 넣고,
		중간 이후부터 끝까지는 1씩 감소하여 내림차순으로 값을 넣어 출력하세요.
		단, 입력한 정수가 홀수가 아니거나 3 미만일 경우 “다시 입력하세요”를 출력하고
		다시 정수를 받도록 하세요.
		ex.
		정수 : 4
		다시 입력하세요.
		정수 : -6
		다시 입력하세요.
		정수 : 5
		1 2 3 2 1
 
   	 */
	public void method8() {
		//3이상인 홀수 자연수를 입력 sc
		Scanner sc = new Scanner(System.in);
		
	while(true) {
		System.out.print("정수 :");
		int num=sc.nextInt();
		
		if (num >= 3 && num % 2 == 1) { // num이 3이상이면서 홀수인 경우

			int num1=1;
			int[] arr = new int[num]; // 배열 생성
			
			for (int i = 0; i < arr.length; i++) { // 값 대입
				arr[i]=num1;
				if (i < arr.length / 2) {//홀수
					num1++;
					
				}else {
					num1--;
					
				}
			}
			for (int i = 0; i < arr.length; i++) { // 배열 출력
				System.out.print(arr[i] + " ");
			}
						return;//끝
		} else { // num이 홀수가 아니거나 3 미만일 경우
			System.out.println("다시 입력하세요.");
		
		
		}
	}
		
	}		
	public void method9() {
		Scanner sc = new Scanner(System.in);
		
		String[] cM = {"양념,그냥,간장,마늘"};
		
		System.out.print("치킨 이름 입력:");
		String num = sc.nextLine();
		
		boolean num1 =false;
		
		for(String menu : cM) {
			if(menu.equals(num)) {
				num1 =true;
				break;
			}
		}
		
		if(num1) {
			System.out.println(num+"배달 가능");
		} else {
			System.out.println(num+"은 없는 메뉴");
			
		}
		
		
		
		
		
		
		
	}
	
	
	
	public void method10() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주민등록번호(-포함): ");
        String jumin = sc.nextLine();

        char[] juminArr = jumin.toCharArray();
        char[] copyArr = Arrays.copyOf(juminArr, juminArr.length);

        // 성별자리 이후부터 '*'로 가리기
        for (int i = juminArr.length - 7; i < juminArr.length; i++) {
            copyArr[i] = '*';
        }

        String maskedJumin = new String(copyArr);
        System.out.println(maskedJumin);
    }

		
	
	public void method12() {
		// 스캐너 선언 , 정수 2개 입력, 연산자 1개 입력, 무한반복문 돌리기
		Scanner sc = new Scanner(System.in);//스캐너 선언
		
		while(true) {//무한 반복
			
		System.out.print("연산자(+,-,*,/,%) :");
		String op = sc.nextLine();
		
		if(op.equals("exit")) {
			System.out.println("프로그램을 종료합니다.");
			break;
		}
			
		//1-1
		System.out.print("정수1 :");
		int num1 = sc.nextInt();
		
		System.out.print("정수2 :");
		int num2 = sc.nextInt();
		
		sc.nextLine();
		
		
		//2 나눗셈 이면서
		
		if(op.equals("/")&&num2==0) {
			System.out.println("0으로 나눌수 없습니다. 다시입력해주세요");
			continue;
			
		}
	
		
		switch(op) {
		
		case "+" :
			System.out.printf("%d%s%d=%d\n",num1,op,num2,(num1+num2));
			break;
		case "-" :	
			System.out.printf("%d%s%d=%d\n",num1,op,num2,(num1-num2));
			break;
		case "/" :	
			System.out.printf("%d%s%d=%d\n",num1,op,num2,(num1/num2));
			break;
		case "%" :	
			System.out.printf("%d%s%d=%d\n",num1,op,num2,(num1%num2));
			break;
		case "*" :
			System.out.printf("%d%s%d=%d\n",num1,op,num2,(num1*num2));
			break;
		default :
			System.out.println("없는 여 ㄴ산자입니다.다시 입력해주세요");
			
			
			
			
			
			
		}
			
			
			
			
			
		}
			
			
			
		}
		
		public void rps () {
			Scanner sc = new Scanner(System.in);
			//필요한 자원 >변수
			int total = 0; //전
			int win = 0; //승
			int tie= 0;// 무
			int lose= 0;//패
			
			System.out.print("당신의 이름을 입력해주세요 :");
			
			
			
			
		}
		
		public void method15() {
			Scanner sc = new Scanner(System.in);
			
			System.out.print("문자열 :");
			String str=sc.nextLine();
			
			char [] arr = new char[str.length()];
			int count = 0;//문자 개수 출력
			
			System.out.print("문자열에 있는 문자:");
			
			for(int i=0; i<arr.length;i++) {//carh 배열 값 대입
				arr[i] = str.charAt(i);
				
				//중복 제거? 출력?apple>>aple
				boolean flag = true;//굉장히 어렵다
				for(int j=0;j<i;j++) {
					if(arr[j]==arr[i]) {
						flag=false;
					}
				}
				
				if(flag==true/*flag==true*/) {
					count++;
					if(i==0) {
						System.out.print(arr[i]);
						
					}else {
						System.out.print(", "+arr[i]);
					}
					
					System.out.print(arr[i]);
				}
			}
			
			
		}
		public void method16() {
			Scanner sc= new Scanner(System.in);
			
			System.out.print("배열의 크기를 입력하세요 :");
			int num = sc.nextInt();
			
			String[] origin =new String[num];
			String[] copy = null;
			
			for(int i=0; i <origin.length; i++) {
				
				System.out.printf("%d번째 문자열 :",i+1);
			origin[i] = sc.nextLine();
						
			}
			
			while(true) {
				System.out.print("더 값을 입력하시겠습니까?(Y/N :" );
				char ch = sc.nextLine().charAt(0);//y Y n N
				
				
			if(ch=='y'||ch=='Y') {//더 입력하겠다는 경우
				System.out.print("더 입력하고 싶은 개수:");
				sc.nextInt();
				
				copy =Arrays.copyOf(origin,origin.length+num);
			for(int i=0; i<copy.length;i++) {//마지막 인덱스인경우
				
				System.out.printf("%S",copy[i]);
				copy[i]=sc.nextLine();
			}
				
			}else {//그만 하는경우
				
			}
			
			
		}
		
		
		
		
		
		
	}

}	
	

	


   		

   	
   	

	

   	
   	

		
	
		

