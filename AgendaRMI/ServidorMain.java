package br.unipe.agendarmi;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;

public class ServidorMain {
	
	public static void main(String[] args) {
		
		try {
			AgendaServidor s = new AgendaServidor();
			Naming.rebind("/servidor", s);
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}
}
