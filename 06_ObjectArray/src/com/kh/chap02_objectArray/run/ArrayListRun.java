package com.kh.chap02_objectArray.run;

import java.util.ArrayList;
import java.util.Scanner;

import com.kh.chap02_objectArray.model.vo.Phone;

public class ArrayListRun {

	public static void main(String[] args) {

		ArrayList<Phone> list = new ArrayList<>();// 뒤에는 생략 가능 jdk6 이상
		
		list.add(new Phone());
		
		list.add(new Phone("아이폰","애플",1300000,"14 pro"));
		list.add(new Phone("갤럭시","삼성",1200000,"S23"));	
		
		list.get(0).setName("벨벳폰");
		list.get(0).setBrand("엘지");
		list.get(0).setPrice(1000000);
		list.get(0).setSeries("1");
		
		int total = 0;
		
		for(int i=0; i<list.size();i++) {
			System.out.println(list.get(i).information());
			total += list.get(i).getPrice();
		}
		
		 
		System.out.println("총가격 :"+total+"원");
		
		System.out.println("평균값 :"+total/list.size()+"원");
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("구매하고자 하는 휴대폰 이름 :");
		String buy = sc.nextLine();
		
		for(Phone p: list) {
			if(p.getName().equals(buy)){
				System.out.println("총가격 :"+p.getPrice()+"원");
				System.out.println("평균값 :"+total+"원");
			}
		}
		
		
		
		
		
		
		
		
	}

	

}
