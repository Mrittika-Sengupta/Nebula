package com.upskill.practice_6;

public class SingletonExample {
	
	//Create a single(only one) object of the class
	private static SingletonExample instance = new SingletonExample();  
	
	
	//Make the constructor private( no one can create objects from outside)
	private SingletonExample(){
		
	}
	
	//create a method to give the single object when needed
	
	public static SingletonExample getInstance(){
		return instance; // always return the same object
	}
		
		
		public void showMessage(){
			System.out.println("Hello from singleton class");
			
		}
       public void testMethod(){
	System.out.println("Hello from singleton class");
	
}
	
	}


