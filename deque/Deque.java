package br.unipe.java.collections.deque;

import java.util.LinkedList;

import br.unipe.java.collections.exceptions.EstruturaVaziaException;
import br.unipe.java.collections.exceptions.RemoveException;


public class Deque <T> {
	
	private LinkedList<T> deque;
	
	public Deque() {
		this.deque = new LinkedList<T>();
	}
	
	public void addFirst(T e) {
		this.deque.addFirst(e);
	}
	
	public void addLast(T e) {
		this.deque.addLast(e);
	}
	
	public void removeFirst() throws RemoveException {
		try {
			this.deque.removeFirst();
		} catch (Exception e) {
			throw new RemoveException("Não foi possível remover elemento.");
		}
	}
	
	public void removeLast() throws RemoveException {
		try {
			this.deque.removeLast();
		} catch (Exception e) {
			throw new RemoveException("Não foi possível remover elemento.");
		}
	}
	
	public void exibirElemento() throws EstruturaVaziaException {
		try {
			for(T o : deque)
				System.out.println(o.toString());
		} catch (Exception e) {
			throw new EstruturaVaziaException("Não foi possível exibir os elementos.");
		}
	}
	
	public int getSize() {
		return this.deque.size();
	}

}
