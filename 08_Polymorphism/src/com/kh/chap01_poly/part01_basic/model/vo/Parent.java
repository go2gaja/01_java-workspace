package com.kh.chap01_poly.part01_basic.model.vo;


	public class Parent {
		
		private int x;
		private int y;
		
		public Parent() {}
	
	
		public Parent(int x ,int y) {
			
		}
		
		public int getx () {
			return x;
		}
		public void setx(int x) {
			this.x = x;
		}
		public int gety() {
			return y;
		}
		public void sety(int y) {
			this.y =y;
		}
		public void printParent() {
			System.out.println("응애 나 아기부모");
		}
		
		public void print() {
			System.out.println("응애 나는 부모");
		}
		
		
	}
		

