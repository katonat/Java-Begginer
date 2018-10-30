import java.rmi.Remote;
import java.rmi.RemoteException;


public interface AgendaInterface extends Remote {
	
	public void gravarContato(String nome, String numero) throws RemoteException;
	public String buscarNome() throws RemoteException;
	public String buscarNumero() throws RemoteException;
	public void listarContatos() throws RemoteException;

}
