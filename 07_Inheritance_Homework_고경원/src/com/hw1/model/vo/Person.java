package com.hw1.model.vo;

public class Person {

	protected String name;
	private int age;
	private double height;
	private double wight;
	
	public Person () {}//기본 생성자
	
	public Person(int age, double height, double wight) {
		
		this.age=age;
		this.height=height;
		this.wight=wight;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight() {
		this.height=height;
	}
	public double getWight() {
		return wight;
	}
	public void setWight(double wight) {
		this.wight=wight;
	}
	
	public String information() {
		return name+age+height+wight;
	}
	
	
	
	@Override
	public String toString() {
		return name+" "+age+ " "+height+" " +wight;
	}
	
	
	
}
