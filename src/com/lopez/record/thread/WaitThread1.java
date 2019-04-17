package com.lopez.record.thread;

public class WaitThread1 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			waitAndNotify();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	private void waitAndNotify() throws Exception{
		synchronized (ThreadTest.str) {
			for(int i=0;i<10;i++){
				Thread.sleep(500);
				if(i==5)
					ThreadTest.str.wait();
				System.out.println("thread1 is using str "+i);
			}
		}
	}

}
