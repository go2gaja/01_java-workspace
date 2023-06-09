package com.kh.chap01_beforeVSafter.after.model.vo;
//자식>>>부모
//후손>>>조상
//하위>>>상위
//this>>>super

public class Desktop extends Product {
	private boolean allInOne;
	
	public Desktop() {}
	
	public Desktop(String brand, String pCode, String pName, int price) {
		//this.brand=brand;>>this:클레스의 주소값
		
		//brand~price 부모클래스(product)의 필드에 대입
		
		 // 해결 방법 1. 부모클래스에 있는 필드를 protected 접근 제한자로 수정
		
		
		
		
		// 해결 방법 2 부모클래스에 있는 setter메소드 활용
		/*
		super.brand=brand;
		super.pCode=pCode;
		super.pName=pName;
		super.price=price;
		*/
		
		// 해결 방법3. 부모 생성자 호출하기>> 우리는 이걸로 간다
		//this 생성자 this(), super 생성자 super()위치가 항상 위에 있어야한다
		
		super(brand,pCode,pName,price);
		this.allInOne=allInOne;
		
		
		
		
	}
	
	public Desktop(String string, String string2, String string3, int i, boolean b) {
		// TODO Auto-generated constructor stub
	}

	public boolean isAllInOne() {
		return allInOne;
	}
	public void setAllInOne(boolean allInOne) {
		this.allInOne=allInOne;
	}
	public String information(int a) {//오버라이딩>>부모 클래스에 이쓴ㄴ 메소드를 자식 클래스에서 재정의 하는것을 오버라이딩이라고함
		return super.information()+",allInOne :"+allInOne;
	}
	
}
