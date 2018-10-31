package br.unipe.agendarmi;

import java.rmi.Remote;
import java.rmi.RemoteException;


public interface AgendaInterface extends Remote {
	
	public void gravarContato(String nome, String numero) throws RemoteException;
	public String buscarNome(String nome) throws RemoteException;
	public void listarContatos() throws RemoteException;

}