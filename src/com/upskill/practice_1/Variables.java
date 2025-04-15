package com.upskill.practice_1;

public class Variables {
	
	//Static Variables - belong to the class and doesn't require creating object
	
	
	public static String company = "Tech";
	public static String industry = "Software";
	public String ceo = "Alice";

	public static void main(String[] args) {
		System.out.println(company); //accessing the static variable
		System.out.println(industry);
		Variables obj = new Variables(); //Creating object
		System.out.println(obj.ceo);
		departmentinfo();
	
		

	}
	
	public static void departmentinfo(){
		String department = "Engineering"; //local variable
		String size = "500 employees"; //local variable
		System.out.println(department);
		System.out.println(size);
		
		
	}
	
	

}
