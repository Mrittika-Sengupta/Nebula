package com.upskill.practice_5;

public abstract class Animal {
	
	public abstract void makeSound(); //must be completed by child class
	
	public abstract void habitat(); //must be completed by child class
	
	public void breathe(){
		System.out.println("Animals breathe");
	}
	
	
	public  boolean isAlive(){
		return true;
	}
	
	public abstract String getName();
	public abstract int getAge();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
