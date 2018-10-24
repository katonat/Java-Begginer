package br.unipe.java.collections.deque;

import br.unipe.java.collections.exceptions.EstruturaVaziaException;
import br.unipe.java.collections.exceptions.RemoveException;


public class TestaDeque {
	
	public static void main(String[] args) {
		
		Deque<Integer> d = new Deque<Integer>();
		Integer i = new Integer(1);
		Integer i1 = new Integer(5);
		Integer i2 = new Integer(7);

		d.addFirst(i);
		d.addFirst(i1);
		d.addLast(i2);

		try {
			d.exibirElemento();
			d.removeFirst();
			d.exibirElemento();
		} catch (RemoveException e) {
			System.out.println(e.getMessage());
		} catch (EstruturaVaziaException estruturaVaziaException) {
			System.out.println(estruturaVaziaException.getMessage());
		}

		
	}

}
