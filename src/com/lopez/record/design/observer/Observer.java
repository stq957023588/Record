package com.lopez.record.design.observer;

public interface Observer {
	public void update(Message<?>...msgs);//观察者当接收到来自数据源的信息时，调用此方法更新自身数据
}
