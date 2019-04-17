package com.lopez.record.design.adapter;

public class NewObject extends Target{
	private Adaptee adaptee=new Adaptee();
	
	@Override
	public void request(){
		adaptee.request();
	}
}
