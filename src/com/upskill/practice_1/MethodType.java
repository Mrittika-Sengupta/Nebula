package com.upskill.practice_1;

public class MethodType {
	
	
	//void method: Doesn't return anything
	public void greet(){
		System.out.println("Hello, welcome to the java world");
	}
	
	//static method: doesn't require an object to be called
	
	public static void printMessage(){
		System.out.println("This is a static method");
	}
	
	
	//return type method : returns some int value
	public static int add(int a, int b){
		return a+b; //returns the sum of two numbers
		
	}

	public static void main(String[] args) {
		
		MethodType obj = new MethodType(); //creating the object
		obj.greet();
		printMessage();
		int a = 2;
		int b = 4;
		int sum = a+b; //calling the method and storing the result
		System.out.println("The sum is:" + sum);
		
		
	

	}

}
