package com.upskill.practice_6;

public class Assignment4_1 {
	
	private String firstname;
	private String lastname;
	private String username;
	private String password;
	private String email;
	
	
	//setter method for first & last name
	public void setFirstName(String first_name){
		firstname = first_name;
	}
	
	public void setpassword (String pwd){
		password = pwd;
	}
	
	
	//getter method for first name 
	
	public String getFirstname(){
		return firstname;
	}
	
			
			


	public static void main(String[] args) {
		
		Assignment4_1 obj  = new Assignment4_1();
		obj.setFirstName("Peris");
		//setting values using setter methods
		
		System.out.println("First Name: " + obj.getFirstname());
		


	}

}
