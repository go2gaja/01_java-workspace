package com.kh.chap01_beforeVSafter.after.model.vo;

import com.kh.chap01_beforeVSafter.after.model.vo.Product;

public class Tv extends Product{

private int inch;
	
	public Tv() {}
	
	
	public Tv(String brand,String pCode,String pName,int price, int inch) {
		
	}
	
	public int getInch() {
		return inch;
	}
	public void setInch(int inch) {
		this.inch=inch;
		
	}
	public String information() {
		return super.information() +",inch:"+inch;
	}
}
