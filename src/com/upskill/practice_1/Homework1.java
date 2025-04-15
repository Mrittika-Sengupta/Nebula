package com.upskill.practice_1;

public class Homework1 {
	
	public static void trianglePerimeter(){
		int side1 = 5;
		int side2= 7;
		int side3 = 11;
		
		
		student1();
		student2();
		student3();
	
		int perimter = side1+ side2 + side3;
		System.out.println("The perimter of the triangle is:" + perimter);
		
		int result =  substract();
		System.out.println("The perimter of the triangle is:" +result);
		
		}
	
	public static int substract(){
		int larger = 50;
		int smaller = 30;
		return larger - smaller;
	}

	public static void main(String[] args) {
		
		trianglePerimeter();
	}
	 public static void student1(){
		 System.out.println("name:john, age=20");
	 }
	 public static void student2(){
		 System.out.println("name:john, age=20");
	 }
	 public static void student3(){
		 System.out.println("name:john, age=20");
	 }
}
