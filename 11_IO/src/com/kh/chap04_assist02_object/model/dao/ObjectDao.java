package com.kh.chap04_assist02_object.model.dao;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.kh.chap04_assist02_object.model.vo.Phone;

public class ObjectDao {
	//파일은 우리가 볼려고 관상용으로 만드는것보다 컴퓨터가 보기 편해서 만드는것이다
	//프로그램>>파일 출력
	public void fileSave() {
		
		//출력할 데이터(Phone 객체)
		Phone ph1 = new Phone("아이폰",130000);
		Phone ph2 = new Phone("갤럭시",120000);
		Phone ph3 = new Phone("플립",150000);
		
		// 객체 단위로 출력해줄 수 있는 보조 스트림 필요
		
		// ObjectXXx >> 얘는 Writer , Reader가 없음
		// 바이트 기반 스트림
		
		//FileOutputStream : 파일과 연결해서 1바이트 단위로 출력 할 수 있는 기반스트림
		//ObjectOutputStream: 객체 단위로 출력할 수 있도록 도움을 주는 보조 스트림(ObjectWriter 없음)
		
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("d_phone.txt"));
	
		oos.writeObject(ph1);
		oos.writeObject(ph2);
		oos.writeObject(ph3);
		
	} catch (IOException e) {
		e.printStackTrace();
	}
	
}
		//프로그램 <<<(입력)
		public void fileRead() {
			
			
			try {
				ObjectInputStream ois = new ObjectInputStream(new FileInputStream("d_phone.txt"));
			/*
				System.out.println(ois.readObject());
				System.out.println(ois.readObject());
				System.out.println(ois.readObject());
				
				
				
				System.out.println(ois.readObject());
			*/
				while(true) {
					System.out.println(ois.readObject());
				}
				
			} catch (EOFException e) {
				//e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch(IOException e) {
				
			}
			
		
			
			
			
		}
		
		
		
		
		
		
		
		
	}



