package com.lopez.record.remote;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MyRemote extends Remote{
	void HelloRemote()throws RemoteException;
}
