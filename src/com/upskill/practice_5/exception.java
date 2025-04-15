package com.upskill.practice_5;

public class exception {

	public static void main(String[] args) {
		
		        
		        // 1️⃣ Try-Catch: Handling division by zero (ArithmeticException)
		        try {
		            int result = 10 / 0;  // Error: Cannot divide by zero
		            System.out.println("Result: " + result);
		        } catch (ArithmeticException e) {
		            System.out.println("Error: Cannot divide by zero!");
		        }

		        // 2️⃣ Try-Catch: Handling invalid array index (ArrayIndexOutOfBoundsException)
		        try {
		            int[] numbers = {1, 2, 3};
		            System.out.println(numbers[5]);  // Error: Index 5 does not exist
		        } catch (ArrayIndexOutOfBoundsException e) {
		            System.out.println("Error: Array index out of bounds!");
		        }

		        // 3️⃣ Finally Block - Always runs
		        finally {
		            System.out.println("Process Completed!");
		        }
		    }
		}