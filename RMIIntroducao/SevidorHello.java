import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;


public class SevidorHello extends UnicastRemoteObject implements HelloInterface {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public SevidorHello() throws RemoteException {
		super();
	}
	
	public String helloName(String name) {
		return "Hello "+ name;
	}
	
	public static void main(String[] args) {
		
		try {
			SevidorHello servidor = new SevidorHello();
			Naming.rebind("/servidor", servidor);
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

}
