package com.upskill.practice_6;

public class MultithreadingThread extends Thread {

	
		

	public void run(){
		try{
			System.out.println(Thread.currentThread().getId());
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

}
