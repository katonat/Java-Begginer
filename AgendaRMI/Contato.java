import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;


public class Contato extends UnicastRemoteObject {


	private static final long serialVersionUID = 1L;
	
	private String name;
	private String numero;
	
	public Contato(String name, String num) throws RemoteException {
		this.name = name;
		this.numero = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

}
