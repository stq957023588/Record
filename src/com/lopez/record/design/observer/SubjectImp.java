package com.lopez.record.design.observer;

import java.util.ArrayList;
import java.util.List;

public class SubjectImp implements Subject {
	private List<Observer> observers;
	private double temperature;
	public SubjectImp(){
		observers=new ArrayList<Observer>();
	}
	public void setData(double temperature){
		this.temperature=temperature;
		dataChanged();
	}
	
	@Override
	public void registerObserver(Observer o) {
		// TODO Auto-generated method stub
		observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		// TODO Auto-generated method stub
		observers.remove(o);
	}

	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		for(Observer o:observers){
			o.update(new Message(temperature));
		}
	}
	public void dataChanged(){
		notifyObservers();
	}

}
