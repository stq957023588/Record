package com.lopez.record.design.observer;

public class Message<T> {
	private T t;
	public Message(T t){
		this.t=t;
	}
	public T getT() {
		return t;
	}
	public void setT(T t) {
		this.t = t;
	}
	
}
