package com.hw2.model.vo;

public class Circle extends Point{

	private int radius;

    public Circle() {
    }

    public Circle(int x, int y, int radius) {
        super(x, y);
        this.radius = radius;
    }
    
	
    public void draw() {
        super.draw();
        double area=Math.PI*radius*radius;
        double square= 2 * Math.PI * radius;
        System.out.println("원의 면적: " + Math.round(area)+",둘레: "+Math.round(square));
    }
    
    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;   
	
    }
	
}	

