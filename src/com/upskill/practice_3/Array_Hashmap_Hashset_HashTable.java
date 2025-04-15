package com.upskill.practice_3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

public class Array_Hashmap_Hashset_HashTable {

	public static void main(String[] args) {
		
		//Array store multiple data using index
		
		int age = 28;									//Variable
		int[] ageFury = new int[]{25, 28, 30, 32, 21};	//Array
		
		//Array Index			  [0] [1] [2] [3] [4]
		
		System.out.println("Student Age : " + ageFury[3]);
		System.out.println("Total Length : " + ageFury.length);
		
		String[] nameFury = new String[]{"John", "Taha", "Mahi", "Nick", "Dalton"};	//Array
		
		System.out.println("Student name : " + nameFury[3]);
		System.out.println("Total Student : " + nameFury.length);
		
		//Multi-Dimentional Array
		int[][] ageFury2D = new int[][]{{25, 28, 30, 32, 21},			//[0][0] [0][1] [0][2] [0][3] [0][4]
							 			{24, 34, 32}};					//[1][0] [1][1] [1][2]
		
		System.out.println("Student Age 2D: " + ageFury2D[1][1]);
		
		String[][] nameFury2D = new String[][]{{"John", "Taha", "Mahi", "Nick", "Dalton", "Harvard"},		
							 					{"Mahabuba", "Israt", "Saba"}};			
		
		System.out.println("Student Age 2D: " + nameFury2D[1][2]);
		
		// Hashmap store multipul data using key-value pair, Implementation of Map interface
		
		HashMap<String, Integer> Student = new HashMap<String, Integer>();
		
		Student.put("John", 28);
		Student.put("Taha", 24);
		Student.put("Mahi", 21);
		Student.put("Nick", 31);
		
		System.out.println("HashMap Student Age : " + Student.get("Zia"));
		
		HashMap<String, String> Capital = new HashMap<String, String>();
		
		Capital.put("BD", "Dhaka");
		Capital.put("USA", "Washington DC");
		
		System.out.println("Capital City : " + Capital.get("BD"));	
		
		//HashTable store multiple data using key-value pair, No duplicate, also is synchronized (only one thread can be modified)
		
		Hashtable<String, String> Region = new Hashtable<String, String>();
		
		Region.put("BD", "Asia");
		Region.put("USA", "America");
		
		System.out.println("Region : " + Region.get("BD"));
		
		//Hashset store unordered collection containing unique value, Implementation of Set interface
		
		HashSet<String> car = new HashSet<String>();
		
		car.add("BMW");
		car.add("Toyota");
		car.add("Audi");
		car.add("Ford");
		
		System.out.println("Car : " + car);
		}
	}