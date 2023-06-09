package com.hw2.model.vo;

public class Rectangle extends Point {

	private int width;
    private int height;

    public Rectangle() {
    }

    public Rectangle(int x, int y, int width, int height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }

    public void draw() {
        super.draw();
        int area = width * height;
        int perimeter = 2 * (width + height);
        System.out.println("사각형의 면적: " + area + ", 둘레: " + perimeter);
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
	
	
	
	
    }
	
}
