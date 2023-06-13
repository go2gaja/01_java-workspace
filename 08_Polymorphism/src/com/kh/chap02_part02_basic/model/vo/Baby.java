package com.kh.chap02_part02_basic.model.vo;
	
public class Baby extends Person implements Basic{//상속>>단일상송|다중상속>>인터페이스

	public Baby() {}
	public Baby(String name, double weight, int health) {
		super(name,weight,health);
	}
	@Override
	public String toString() {
		return super.toString();
	}
	
	
	@Override
	public void eat() {
		//밥먹으면 몸무게 3증가
		super.setWeight(super.getWeight()+3);
	}
	@Override
	public void sleep() {
		// 건강도 3 증가
		super.setHealth(super.getHealth()+4);
	}
	
	
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
