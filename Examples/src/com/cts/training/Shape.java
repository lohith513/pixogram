package com.cts.training;

public class Shape {
int Area() {
	return 0;
}       
       
}
class Circle extends Shape{
	private int radius;
	double pi=3.14,ar=0;
	public int area() {
		ar=pi*radius*radius;
		System.out.println("area of circle is");
	}
class Rectangle extends Circle{
	int l=0,b=0;
    double ar;
    public int area() {
    	ar=l*b;
    	System.out.println("area of rectangle is");
    }
}
class Square extends Rectangle{
	int s=0;
	double ar;
	public void area() {
		ar=s*s;
		System.out.println("area of square is")
		
	}
}

	

