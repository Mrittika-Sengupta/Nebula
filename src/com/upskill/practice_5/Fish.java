package com.upskill.practice_5;

public class Fish implements Pet {
	
	@Override
	public void play(){
		System.out.println("Fish Plays");
		
	}
	
	public void friendlyBehavior(){
		System.out.println("Fish moves");
	}
	
	public boolean isPet(){
		return true;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
