package com.kh.practice.list.model.run;

import java.util.ArrayList;
import java.util.Scanner;

import com.kh.practice.list.model.vo.Dog;

public class DogRun {

	public static void main(String[] args) {
		ArrayList<Dog> dogList = new ArrayList<>();
			Scanner sc = new Scanner(System.in);	
		for(int i =1; i<=5;i++) {
			 System.out.print(i + "번째 강아지 이름 입력: ");
	            String name = sc.nextLine();
	            System.out.print("강아지 나이 입력: ");
	            int age = sc.nextInt();
	            sc.nextLine(); // 개행 문자 제거
	            System.out.print("강아지 종 입력(ex. 말티즈): ");
	            String kind = sc.nextLine();

	            Dog dog = new Dog(name, age, kind);
	            dogList.add(dog);
			
			
		}
		
		
		 System.out.println("=========================================");
	        System.out.println("존재하는 강아지 출력");
	        System.out.println("=========================================");
	        for (Dog dog : dogList) {
	            System.out.println(dog);
	        }
	        System.out.println("-----------------------------------------------------------------");

	        System.out.println("이름에 '구'가 포함된 강아지 정보 출력");
	        System.out.println("-----------------------------------------------------------------");
	        int count = 0;
	        for (Dog dog : dogList) {
	            if (dog.getName().contains("구")) {
	                System.out.println(dog);
	                count++;
	            }
	        }
	        System.out.println("이름에 '구'가 포함된 강아지는 총 " + count + "마리입니다.");

	        sc.close();
		
		       
		    }
		

		
	}


