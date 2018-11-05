import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class CounterServer {
	 public static  void main( String args[] ) {
	    	 try { 
		             LocateRegistry.createRegistry(1099); 
		             System.out.println("java RMI registry created.");
	    	 	 } 
	    	 
	    	 catch (RemoteException e) {}
	
	         try {
		              CounterImpl p1 = new CounterImpl(1);
		              Naming.rebind( "toaster", p1 );
	         	 }
	         
	         catch( Exception e ) { 
	        	      System.out.println( "Error: " + e ); 
	        	 }
	     }
}
