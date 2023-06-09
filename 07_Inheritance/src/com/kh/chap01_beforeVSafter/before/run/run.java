package com.kh.chap01_beforeVSafter.before.run;

import com.hw1.after.model.vo.STring;
import com.kh.chap01_beforeVSafter.before.model.vo.Desktop;
import com.kh.chap01_beforeVSafter.before.model.vo.SmartPhone;
import com.kh.chap01_beforeVSafter.before.model.vo.Tv;

public class run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Desktop 객체 생성
		// brand, pCode,pName,price,allInone
		
		Desktop d= new Desktop("삼성","d=01","데스크탑",3333330, true);
		
		//tv
		//brand,pcode,pname,price,inch
		
		Tv t= new Tv("엘지","t-01","얇은 티비",3333330,60);
		
		//smartphone 
		//brand,pcode,pname,price,mobileagncy
		
		SmartPhone s =new SmartPhone("애플", "s-01", "아이폰",13333330, "KT");
		
		System.out.println(d.information());
		System.err.println(t.information());
		System.out.println(s.information());
		
		
		//유지보수 요청 : pName > productName으로 바꿔라(제조일자)바꿔줘라 3개....(하루종일해도 못한다)
		
		
		/*
		 * 세 클래스에 공통적인 필드와 메소드들이 존재함
		 * 이런 중복된 코드들을 따로 "부모 클래스로" 한번만 정의해두면 중복된 코드들을 줄일 수 있다
		 * 유지보수요청> 수정과 같은 유지보수 요청이 왔을때 일일히 찾아서 수정할 필요없이
		 * 한번만 정의해둔 부모 클래스만 수정하면 전체적으로 반영됨
		 * 
		 * 세 클래스가 공통적으로 가지고 있는 것
		 * 
		 * >>brand,pcode,pname,price필드들,setter/getter, information메소드
		 * >>product 클래스 미리 정의해볼것
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 	private String brand;
	private String pCode;
	private String pName;
	private int price;
	
	public product () {}
	
	public product(String brand, STring pCode, String,pName, int price) {
		this.brand=brand;
	 	this.pCode=pCode;
	 	this.pName=pName;
	 	this.price=price;
	
	
	
	
		 * 
		 */
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
