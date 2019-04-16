package com.lopez.record.remote;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MyRemoteImp extends UnicastRemoteObject  implements MyRemote{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected MyRemoteImp() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void HelloRemote() {
		// TODO Auto-generated method stub
		System.out.println("Hello Remote");
	}

}
