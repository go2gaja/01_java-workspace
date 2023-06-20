package com.kh.practice.model.dao;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.kh.practice.model.vo.Coffee;

public class CoffeeDao  {
	
	// 객체+배열
	// int a= 1; String str= "ㅎㅎ";
	
	Coffee [] cArr = new Coffee[3];
	
	public void coffeeArr() {
		Coffee[] cArr = new Coffee[3];
		cArr[0] = new Coffee("아메리카노",2000,true);
		cArr[1] = new Coffee("라때",3000,true);
		cArr[2] = new Coffee("아이스티",4000,false);
	
		
		// 1. 단순 for 문
		/*
		for(int i=0; i<=cArr.length;i++) {// i=0 ~ 2 >> 0 1 2 3
			System.out.println(cArr[i]);
		} >> cArr[3]은 없음 안돌아감 why for(int i=0; i<=cArr.length;i++){에 3미만이 아니라서 
			아래꺼가 정답
		*/
		
		for(int i=0; i<cArr.length;i++) {// i=0 ~ 2 >> 0 1 2
			System.out.println(cArr[i]);
		}
		
	}
	//프로글매 >> 파일 출력
	public void fileSave() {
		
		Coffee c1 = new Coffee("아메리카노",1000,true);
		Coffee c2 = new Coffee("라때",2000,true);
		Coffee c3 = new Coffee("아이스티",3000,false);
		
		// 객체 출력 위한 보조스트림 필요 >>기반 스트림과 함께
		// ObjectOutputStream
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("c_coffee.txt"))) {
			
			oos.writeObject(c1);
			oos.writeObject(c2);
			oos.writeObject(c3);
			//NotSerializableException 문제가 있는 클래스에 가서 implements Serializable 작성해줘야함 
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	
		
		
	
		
		
		
	}
	
	
}
