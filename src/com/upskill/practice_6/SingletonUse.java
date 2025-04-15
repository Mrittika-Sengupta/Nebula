package com.upskill.practice_6;

public class SingletonUse {

	public static void main(String[] args) {
		 //get the instance of the class
		
		SingletonExample obj = SingletonExample.getInstance();
		
		
		//call methods
		obj.showMessage();
		obj.testMethod();

	}

}
