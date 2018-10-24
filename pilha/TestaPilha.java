package br.unipe.java.collections.pilha;

import br.unipe.java.collections.exceptions.EstruturaVaziaException;
import br.unipe.java.collections.exceptions.RemoveException;

public class TestaPilha {
	
	public static void main(String[] args) {
		
		Pilha<Integer> p = new Pilha<Integer>();
		
		Integer i = new Integer(1);
		Integer i1 = new Integer(5);
		Integer i2 = new Integer(7);

		p.addElemento(i);
		p.addElemento(i1);
		p.addElemento(i2);

		try {
			p.exibirElemento();
			p.removeElemento();
			p.exibirElemento();
		} catch (RemoveException e) {
			System.out.println(e.getMessage());
		} catch (EstruturaVaziaException estruturaVaziaException) {
			System.out.println(estruturaVaziaException.getMessage());
		}
	}

}
