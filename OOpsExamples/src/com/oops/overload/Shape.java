package com.oops.overload;

public class Shape {
	
	void area(int x) {
	System.out.println(" sq" + x*x);
	}
	 int area(int x, int y) {
		return x*y;
	}
	 void area(float x) {
		 System.out.println( "cir " + (Math.PI *(x*x)));
	 }
	 float area(int x, float y) {
		 return 0.5f * x * y;
	 }

}
