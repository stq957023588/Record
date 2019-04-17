package com.lopez.record.thread;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolTest {
	private static  int count;
	public static void main(String[] args) throws InterruptedException {
		ThreadPoolTest poolTest=new ThreadPoolTest();
		ThreadPoolExecutor pool=new ThreadPoolExecutor(5,10,100000,TimeUnit.MILLISECONDS,new LinkedBlockingQueue<Runnable>());
		for(int i=0;i<20;i++){
			Thread t=poolTest.new PoolThread();
			pool.submit(t);
			System.out.println("线程池中线程数目："+pool.getPoolSize()+"，队列中等待执行的任务数目："+pool.getQueue().size()+"，已执行玩别的任务数目："+pool.getCompletedTaskCount());
			Thread.sleep(1000);
		}
	}
	class PoolThread extends Thread{
		public void run(){
			try {
				excutorMethod();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		public void excutorMethod() throws InterruptedException{
			System.out.println(++count);
			Thread.sleep(1000);
		}
	}
}
