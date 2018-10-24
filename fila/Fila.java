package br.unipe.java.collections.fila;

import java.util.LinkedList;

import br.unipe.java.collections.exceptions.EstruturaVaziaException;
import br.unipe.java.collections.exceptions.RemoveException;

public class Fila <T> {
	
	private LinkedList<T> fila;
	
	public Fila() {
		this.fila = new LinkedList<T>();
	}
	
	public void addElemento(T e) {
		this.fila.addLast(e);
	}
	
	public void removeElemento() throws RemoveException {
		try {
			this.fila.removeFirst();
		} catch (Exception e) {
			throw new RemoveException("Não foi possível remover elemento.");
		}
	}
	
	public void exibirElemento() throws EstruturaVaziaException {
		try {
			for(T o : fila)
				System.out.println(o.toString());
		} catch (Exception e) {
			throw new EstruturaVaziaException("Não foi possível exibir os elementos.");
		}
	}
	
	public int getSize() {
		return this.fila.size();
	}

}
