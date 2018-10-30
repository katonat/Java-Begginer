import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.TreeMap;


public class AgendaServidor extends UnicastRemoteObject implements AgendaInterface {

	private static final long serialVersionUID = 1L;
	
	private TreeMap<String, String> agenda = new TreeMap<String, String>();
	
	public AgendaServidor() throws RemoteException {
		super();
	}
	
	public void gravarContato(String nome, String numero) throws RemoteException {
		this.agenda.put(nome, numero);
	}
	
	public String buscarNome(String nome) throws RemoteException {
		if(this.agenda.containsKey(nome))
			return 
	}
	
	public String buscarNumero() throws RemoteException {
		
	}
	
	public void listarContatos() throws RemoteException {
		
	}

	
	
	

}
