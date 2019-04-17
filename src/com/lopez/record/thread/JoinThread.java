package com.lopez.record.thread;

public class JoinThread extends Thread{
	public void run(){
		for(int i=0;i<10;i++){
			try {
				Thread.sleep(1000);
				System.out.println("MyThread i:"+i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
