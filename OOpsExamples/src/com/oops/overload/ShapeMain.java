package com.oops.overload;

public class ShapeMain {

	public static void main(String[] args) {
		
		Shape shape = new Shape();
		shape.area(10);
		shape.area(10.5f);
		int rect=shape.area(3,4);
		System.out.println("rect " +rect);
		float tri=shape.area(12, 4f);
		System.out.println("tri " +tri);
		
		
	}
}
