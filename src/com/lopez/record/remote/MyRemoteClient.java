package com.lopez.record.remote;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class MyRemoteClient {
	public static void main(String[] args) throws MalformedURLException, RemoteException, NotBoundException {
		MyRemote remote=(MyRemote)Naming.lookup("rmi://127.0.0.1/RemoteHello");
		remote.HelloRemote();
	}
}
