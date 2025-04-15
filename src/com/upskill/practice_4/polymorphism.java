package com.upskill.practice_4;
import com.upskill.practice_1.MethodType;

public class polymorphism extends MethodType {
	
	//Method Overriding - Use same method name from different parent class;
	//changing the behavior of an existing method
	
	@Override
	public void greet(){
		System.out.println("Hello from the polymorphism world");
	}
	
	//Method Overloading
	public void display (int number){
		System.out.println("The number is: " + number);
	}
	
	public void display (String message){
		System.out.println("The message is: " + message);
	}

	

	public static void main(String[] args) {
		
		polymorphism obj = new polymorphism(); //Creating an object of polymorphism
		
		obj.greet(); //calling the overridden greet method
		
		
		//Calling overloaded display method
		obj.display(10);
		obj.display("Hello World");
		
		
		

	}

}
