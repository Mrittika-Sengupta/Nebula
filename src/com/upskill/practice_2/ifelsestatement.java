package com.upskill.practice_2;

public class ifelsestatement {

	public static void main(String[] args) {
		
		int score = 54; //student's score
		
		
		if(score>=90){
			System.out.println("You got a A grade"); //if score is 90 or more
		}
		
		else if (score>=75){
			System.out.println("You got a B grade"); //if score is 75 to 89
		}
		
		else if(score>=50){
			
			if(score>=50 && score <60){ //score is 50 - 59
			
			System.out.println("You got a D grade"); //if score is 50 to 74
		} else {
			System.out.println("You got a C grade"); 
		}
		}
		else{
			System.out.println("You Failed"); //if score is below 50
		}

	}

}
