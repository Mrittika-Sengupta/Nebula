package com.upskill.practice_2;

public class switchcase {
	public static void main(String[] args) {
		
		char grade = 'C'; // example grade
		
		
		switch(grade){
		case 'A':
		System.out.println("Excellent");
		break;
		
		case 'B':
		System.out.println("Good Job");
		break;
		
		case 'C':
		System.out.println("You Passed");
		break;
		
		
		case 'D':
		System.out.println("You failed");
		break;
		
		default:
		
		System.out.println("Invalid grade");
		
		}
}
}