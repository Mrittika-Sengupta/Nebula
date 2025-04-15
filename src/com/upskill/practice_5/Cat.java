package com.upskill.practice_5;

//Cat class that extends an abstrat class - Animal

public class Cat extends Animal {
	
	@Override
	public void makeSound(){
		System.out.println("Cat Meows");
	}
    @Override
	public void habitat(){
		System.out.println("Cat lives");
	}
    
    @Override
    
    public String getName(){
    	return "John";
    }
    
    public int getAge(){
    	return 5;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	

}
