package engine;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import compute.AddServerIntf;

public class AddServer {
	
	static Registry registry;
	
	public static void main(String a[]){
		
		if (System.getSecurityManager() == null){
			System.setSecurityManager(new SecurityManager());
		}
		
		try{
			AddServerIntf addServerImpl = new AddServerImple();
			
			registry = LocateRegistry.getRegistry();

			
			registry.rebind("engine", addServerImpl);
			
			
			
			
		}catch(Exception e){
			System.out.println(e);
		}
		
		
	}
}
