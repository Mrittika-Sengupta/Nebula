package com.upskill.practice_3;

public class Encapsulation {

	//Encapsulation used to hide the data using setter and getter method
	
		private String name = "upskill";					//Write & Read
		private int ssn = 524125;							//Write Only
		private String username = "raselalam";				//Read Only
		
		//Setter Method - name								//set the data, Write 
		public void setName(String value){
			name = value;
		}
		
		//Getter Method - name								//get the data, Read
		public String getName(){
			return name;
		}
		
		//Setter Method - ssn						 		//set the data, Write
		public void setSSN(int value){			
			ssn = value;
		}

		//Getter Method - username		 					//get the data, Read
		public String getUserName(){
			return username;
		}
		
		public static void main(String[] args) {
			Encapsulation obj = new Encapsulation();
			System.out.println(obj.getName());
			obj.setName("Mrittika");
			System.out.println(obj.getName());
		}
		
	}