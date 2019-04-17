package com.lopez.record.thread;


public class Producer implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			produce();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	private void produce() throws Exception {
		for(int i=1;;i++){
			synchronized (ThreadTest.queue) {
				if(ThreadTest.queue.size()<10){
					ThreadTest.queue.notify();
					System.out.println("mission"+i+" publish");
					ThreadTest.queue.add("mission"+i++);
				}else{
					System.out.println("mission full");
					ThreadTest.queue.wait();
				}
			}
			Thread.sleep(100);
		}
		
	}
}
