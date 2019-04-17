package com.lopez.record.design.observer;

import java.util.concurrent.Executor;

public class ObserverImp implements Observer,DisplayElement {
	private Message[] msgs;
	private String name;
	
	public ObserverImp(SubjectImp subject,String name){
		this.name=name;
		subject.registerObserver(this);
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Observer "+name);
		for(Message msg:msgs){
			System.out.println(msg.getT());
		}
	}

	@Override
	public void update(Message<?>... msgs) {
		// TODO Auto-generated method stub
		this.msgs=msgs;
		display();
	}

}
