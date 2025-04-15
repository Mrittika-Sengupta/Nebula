package com.upskill.practice_4;

public class constructor {
	
	String productName;
	String size;
	int quantitiy;
	
	
	
	//default constructor - if user doesn't select anything
	
	public constructor(){
		productName = "Default Product"; //default size
		size = "M"; //default size
		quantitiy = 1; //default quantity
		
	}
	
	//parameterized constructor(Use selects product name and size
	
	public constructor(String name, String SelectedSize){
		productName = name; 
		size = SelectedSize; 
		quantitiy = 1; //default quantity
		
	}
	
	
	//constructor overloading (User selects product name and quantity
	public constructor(String name, int qty){
		productName = name; 
		size = "L"; //default size
		quantitiy = qty; 
		
	}
	
	//constructor overloading (User selects product name, size and quantity
		public constructor(String name, String SelectedSize, int qty){
			productName = name; 
			size = SelectedSize ; 
			quantitiy = qty; 
			
		}

	

	public static void main(String[] args) {
		//default constructor - if user doesn't select anything

		constructor cart1 = new constructor();
		System.out.println("Product: " + cart1.productName);
		System.out.println("Size: " + cart1.size);
		System.out.println("Quantity: " + cart1.quantitiy);
		System.out.println("----------------------");
		
		
		////parameterized constructor(Use selects product name and size
		constructor cart2 = new constructor("T-shirt", "L");
		System.out.println("Product: " + cart2.productName);
		System.out.println("Size: " + cart2.size);
		System.out.println("Quantity: " + cart2.quantitiy);
		System.out.println("----------------------");
		
		//constructor overloading (User selects product name and quantity
		
			constructor cart3 = new constructor("T-shirt", 3);
			System.out.println("Product: " + cart3.productName);
			System.out.println("Size: " + cart3.size);
			System.out.println("Quantity: " + cart3.quantitiy);
			System.out.println("----------------------");
			
			//constructor overloading (User selects product name, size and quantity)
			
			constructor cart4 = new constructor("T-shirt","XL", 5);
			System.out.println("Product: " + cart4.productName);
			System.out.println("Size: " + cart4.size);
			System.out.println("Quantity: " + cart4.quantitiy);

	}

}
