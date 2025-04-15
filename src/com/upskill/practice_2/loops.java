package com.upskill.practice_2;

public class loops {

	public static void main(String[] args) {
		forLoopExample();
		whileLoop();
		DowhileLoop();
	
		multitable();
	}
	 //For Loop - runs a fix number of times(from 1 to 5)
	public static void forLoopExample(){
		for(int i =1; i<=10; i++){ // starts from 1 and runs till 5
			System.out.println("For Loop: " + i);  //
		}
	}
	
	// runs as long as the condition is true (conditions as long as i<=5)
	public static void whileLoop(){
		int i = 1 ; // start value of i
		while (i<=3){
			System.out.println("For While Loop: " + i);
			i++;
		}
	}
	
	//Do-while loop - runs at least once and the check condition(even if condition is false initially)
	 
	public static void DowhileLoop(){
		int i =1;
		do {
			System.out.println("Do while loop =" +i);
			
			i++;
		} while(i<=5); //condition run while i is less than or equal 5
	}
	
	
	public static void infinite (){
		for(int i=1 ; ; i++){
			System.out.println("Infinite loop =" +i);
			
		}
	}
	
	//print multiplication table (1 to 5 multiplied by 1 to 10)
	
	public static void multitable(){
		for(int i =1; i<=10; i++){ // outer loop: runs from 1 to 10
			for(int j =1; j<=10; j++){ //inner loop: runs from 1 to 10
				
				
				int result = i*j;
				System.out.print(result + " "); //print the multiplication table
				
			}
			System.out.println(); //move to the next line after printing one row of results
		}
		
	}
	

}


