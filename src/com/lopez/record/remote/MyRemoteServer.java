package com.lopez.record.remote;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class MyRemoteServer {
	public static void main(String[] args) throws RemoteException, MalformedURLException {
		Remote remote=new MyRemoteImp();
		LocateRegistry.createRegistry(1099);
		Naming.rebind("rmi://localhost:1099/RemoteHello", remote);
	}
}
