package br.unipe.java.collections.pilha;

import java.util.LinkedList;
import br.unipe.java.collections.exceptions.EstruturaVaziaException;
import br.unipe.java.collections.exceptions.RemoveException;

public class Pilha <T> {
	
	private LinkedList<T> pilha;
	
	public Pilha() {
		this.pilha = new LinkedList<T>();
	}
	
	public void addElemento(T e) {
		this.pilha.addLast(e);
	}
	
	public void removeElemento() throws RemoveException {
		try {
			this.pilha.removeLast();
		} catch (Exception e) {
			throw new RemoveException("Não foi possível remover elemento");
		}
	}
	
	public void exibirElemento() throws EstruturaVaziaException {
		try {
			for(T o : pilha)
				System.out.println(o.toString());
		} catch (Exception e) {
			throw new EstruturaVaziaException("Não foi possível exibir os elementos.");
		}
	}
	
	public int getSize() {
		return this.pilha.size();
	}
	

}
