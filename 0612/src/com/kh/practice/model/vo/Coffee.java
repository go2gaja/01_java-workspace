package com.kh.practice.model.vo;

import java.io.Serializable;

public class Coffee implements Serializable {
	
	//추상화 +캡슐화
	private String name;
	private int price;
	private boolean caffeine;
	
	public Coffee() {}

	public Coffee(String name, int price, boolean caffeine) {
		super();
		this.name = name;
		this.price = price;
		this.caffeine = caffeine;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public boolean isCaffeine() {//get 아니고 is
		return caffeine;
	}

	public void setCaffeine(boolean caffeine) {
		this.caffeine = caffeine;
	}

	@Override
	public String toString() {
		return "Coffee [name=" + name + ", price=" + price + ", caffeine=" + caffeine + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
