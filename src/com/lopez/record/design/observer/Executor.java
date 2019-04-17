package com.lopez.record.design.observer;

public class Executor {
	public static void main(String[] args) {
		SubjectImp sub=new SubjectImp();
		ObserverImp ob1=new ObserverImp(sub, "1号");
		sub.setData(8.555);
	}
}
