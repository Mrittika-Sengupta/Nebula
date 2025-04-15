package com.upskill.practice_6;

public class MultiThreading {

	public static void main(String[] args) {
 int n = 5; // this is the number of threads we want to create
		 
		 for(int i = 0; i<n ; i++){
			 MultithreadingThread obj = new MultithreadingThread(); //create a new thread using the threadclass
			 
			 obj.start(); //start the thread
			 
			 Thread obj2 = new Thread(new MultithreadingRunable()); //Create a new thread using runable
			 obj2.start(); // start the thread
			 
		 }

	}

}