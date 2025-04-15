package com.upskill.practice_6;
import java.util.HashMap;

public class Assignment4_3 {
	
	//method to count how many numbers appear more than once
	
	public static  int countDuplicateValues(int[] arr){
		HashMap<Integer , Integer> map = new HashMap<>(); // store the numbers and their counts
		 // loop for each number in the array
		
		for(int num : arr){
			//if the number is already in the map; increase its count by 1
			// if not, add it to the map with a count of 1
			map.put(num,map.getOrDefault(num,  0) + 1 );
		}
		
		int duplicateCount = 0; // count number that appear more than once 
		
		for(int count : map.values()){
			if (count > 1){
				duplicateCount++;// if a number appears more than once, increase the count
			}	
		}
		
		return duplicateCount; //return the total count 
	}
	public static void main(String[] args) {
		int[] numbers = {2,3,4,1,4,5,5,6,1, 2 ,1};
		System.out.println(" Number of duplicate values: " + countDuplicateValues(numbers));
		
		// TODO Auto-generated method stub

	}
	
	
	
	  
}
