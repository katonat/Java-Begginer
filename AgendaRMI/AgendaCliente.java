package br.unipe.agendarmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.Remote;
import java.rmi.RemoteException;

public class AgendaCliente {
	
	public static void main(String[] args) {
		
		try {
			Remote obj = Naming.lookup("//192.168.25.2/servidor");
			AgendaInterface objRemoto = (AgendaInterface) obj;
			objRemoto.gravarContato("Nathalie", "123456");
			objRemoto.listarContatos();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}

}
