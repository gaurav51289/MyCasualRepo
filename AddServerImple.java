package engine;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import compute.*;

public class AddServerImple extends UnicastRemoteObject implements AddServerIntf {

	public AddServerImple() throws RemoteException  {
		// TODO Auto-generated constructor stub
		super();
	}
	
	@Override
	public int add(int x, int y) throws RemoteException {
		// TODO Auto-generated method stub
		return x + y;
	}
}
