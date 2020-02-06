package com.cts.training;

class Circle extends Shape{
	private int radius;
	double pi=3.14,ar=0;
	public void area() {
		ar=pi*radius*radius;
		System.out.println("area of circle is");
	}
}