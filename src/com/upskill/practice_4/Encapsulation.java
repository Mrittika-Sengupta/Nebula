package com.upskill.practice_4;

public class Encapsulation {
	
	//private variables (Encapsulation: Hiding Data)
	
	private String studentName = "John"; // Read & Write;  here, we can see and change the student's name
    private int marks = 90;  //Write ; teachers can add marks;  but students can't see them
    private String schoolName = "Greenwood"; //Read  ; we can see the school name, but can't change it
    
    
    //setter method - studentName (Write)
    
    public void setStudentName(String value){
    	studentName = value;
    }
    
    //Getter method - studentName (Read)
    
    public String getStudentName(){
    	return studentName;
    }
    
    
    //Setter Method - marks (Write only)
    public void setMarks(int value){
    	marks = value;
    }
    
    //Getter Method - schoolName (Read Only)
    
    public String getSchoolName(){
    	return schoolName;
    }
    
    
   
    
	public static void main(String[] args) {

		Encapsulation myReport = new Encapsulation();
		
		//Get and print the student name
		
		System.out.println(myReport.getStudentName());
		
		//Change student Name
		
		myReport.setStudentName("Smith");
		
		//Set Marks( Write Only)
		myReport.setMarks(95);
		
		
		//Get and Print school name (Read only)
		
		System.out.println(myReport.getSchoolName());
		

	}
	

}
