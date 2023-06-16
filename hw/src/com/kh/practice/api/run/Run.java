package com.kh.practice.api.run;

import java.util.Scanner;

import com.kh.practice.api.controller.BookController;

public class Run {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		BookController bc = new BookController();
		
		
		// 1. 도서 전체 출력
        System.out.println("-----------1. 기존의 전체 도서 출력-----------");
        bc.printAll();
        
        // 2. 새로운 도서 추가
        System.out.println("-----------2. 새로운 도서 추가-----------");
        System.out.print("도서명을 입력하시오: ");
        String newTitle = sc.nextLine();
        System.out.print("저자명을 입력하시오: ");
        String newAuthor = sc.nextLine();
        System.out.print("출판사명을 입력하시오: ");
        String newPublisher = sc.nextLine();
        System.out.print("출판일 (2023-06-14 형식으로 입력하시오): ");
        String newDate = sc.nextLine();
        System.out.print("가격을 입력하시오: ");
        String newPrice = sc.nextLine();
		
        bc.insertBook(newTitle, newAuthor, newPublisher, newDate, newPrice);

     // 3. 5번째 도서 출간일 출력
        System.out.println("---------3. 6번째 도서 출간일 출력---------");
        //printBookPublishDate() 메소드 호출

     // 4. 검색할 도서명 입력 (키워드)
        System.out.print("검색할 도서명을 입력하시오 : ");
        String searchTitle = sc.nextLine();
        // searchBook(searchTitle) 메소드 호출
		
		
		
		

	}

}
