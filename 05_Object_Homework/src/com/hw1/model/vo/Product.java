package com.hw1.model.vo;

public class Product {
	//필드부
			private String productId; //samepleId
			private String productName;//sameple
			private String productArea;//생산지
			private int price;//$
			private double tax;//부가세
	//생성자부 (기본+전체)>>전체 생성자		
		public Product(String productId, String productName, String productArea, int price, double tax) {
		        this.productId = productId;
		        this.productName = productName;
		        this.productArea = productArea;
		        this.price = price;
		        this.tax = tax;
		    }
		    
		public String information() {
			return "productId :"+ productId+" ,productName :"+productName+" ,productArea"+
					productArea+" ,price :"+price+" ,tax :"+tax;
					
		//메소드부
		//get set >> 한세트로 작성
			
		}
		public String getprouctId() {
			return this.productId;
		}
		public void setproductId(String productId) {
			this.productId=productId;
		}
		
		public String getproductName() {
			return this.productName;
		}
		public void setproductName(String produceName) {
			this.productName=produceName;
		}
		public String getproductArea() {
			return this.productArea;
		}
		public void setproductArea(String productArea) {
			this.productArea=productArea;
		}
		public int getpice() {
			return this.price;
		}
		public void setPrice(int price) {
			this.price=price;
		}
		public double getTax() {
			return this.tax;
		}
		public void setTax(double tax ) {
			this.tax=tax;
		}
		
		
		
		public int getTaxPrice() {
			return (int)(this.price+(this.price*this.tax));
		}
		


}
