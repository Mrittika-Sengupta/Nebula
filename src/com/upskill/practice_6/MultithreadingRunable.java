package com.upskill.practice_6;

public class MultithreadingRunable implements Runnable {
	

	@Override
	public void run(){
		try{
			System.out.println(Thread.currentThread().getId());
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

}
