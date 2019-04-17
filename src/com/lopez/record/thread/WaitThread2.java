package com.lopez.record.thread;

public class WaitThread2 implements Runnable{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			waitAndNotify();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	private void waitAndNotify() throws InterruptedException{
		synchronized (ThreadTest.str) {
			for(int i=0;i<10;i++){
				Thread.sleep(500);
				System.out.println("thread2 is using str "+i);
			}
			ThreadTest.str.notify();
		}
	}
}
