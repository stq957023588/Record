package com.lopez.record.thread;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class ThreadTest {
	public static String str="654";
	public static Queue<String> queue=new ArrayBlockingQueue<String>(10);
	
	
	
	public static void main(String[] args) throws InterruptedException {
//		joinTest();
//		waitTest();
		consumption();
	}
	/*
	 * producer and customer problem 
	 * use wait and notify method to slove the problem 
	 * producer:
	 * if the queue is full call wait method unlock resources let customer to consumption resources,
	 * else call notidy method to produce resources
	 * customer:
	 * if the queue is empty .....
	 * else ....
	 * 
	 */
	private static void consumption(){
		Producer p=new Producer();
		Thread tp=new Thread(p);
		Customer c=new Customer();
		Thread tc=new Thread(c);
		tp.start();
		tc.start();
	}
	/*
	 * wait method always used in synchronized and while code field 
	 * if an object call wait method,it will be unlocked ,the thread will wait until it be notify 
	 * then the thread will go on.
	 */
	private static void waitTest(){
		WaitThread1 w1=new WaitThread1();
		Thread t1=new Thread(w1);
		WaitThread2 w2=new WaitThread2();
		Thread t2=new Thread(w2);
		t1.start();
		t2.start();
	}
	//if a thread call the join method ,the parent thread will sleep until the thread is over
	private static void joinTest() throws InterruptedException{
		JoinThread j=new JoinThread();
		j.start();
		Thread.sleep(2000);
		
		for(int i=0;i<10;i++){
			if(i==2)
				j.join(2000);
			System.out.println("Main i:"+i);
		}
	}
}
