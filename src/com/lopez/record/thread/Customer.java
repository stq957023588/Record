package com.lopez.record.thread;


public class Customer implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			custom();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	private void custom() throws Exception {
		while(true){
			synchronized (ThreadTest.queue) {
				if(ThreadTest.queue.size()>0){
					ThreadTest.queue.notify();
					System.out.println(ThreadTest.queue.poll()+"complete");
				}else{
					System.out.println("mission empty");
					ThreadTest.queue.wait();
				}
			}
			Thread.sleep(1000);
		}
	}
}
