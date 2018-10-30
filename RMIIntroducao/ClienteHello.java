import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;


public class ClienteHello {

	public static void main(String[] args) {
		

		try {
			Remote obj = Naming.lookup("//localhost/obaoba");
			HelloInterface objRemoto = (HelloInterface)obj;
			objRemoto.helloName("Nathalie");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NotBoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
}
