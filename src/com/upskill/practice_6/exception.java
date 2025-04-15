package com.upskill.practice_6;

public class exception {

	public static void main(String[] args) {
		//Handling division by zero (ArthmrticException)
		
		try{
			int result = 10/0; //Error: It can't divide by zero
			
			System.out.println("Result:" + result);
			
		}
		catch (ArithmeticException e) {
			System.out.println("Error: Cannot divide by zero!");
			
		}
		
		//Handling invalid array index
		try{
			int[]number = {1,2,3};
		
			System.out.println(number[5]); // Error: index 5 doesn't exist in the array
	
			
		}
		catch 
		(ArrayIndexOutOfBoundsException e){
			System.out.println("Error: Array index out of bounds");
			
		}
		
		

	}

}
