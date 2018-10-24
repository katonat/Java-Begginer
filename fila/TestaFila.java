package br.unipe.java.collections.fila;

import br.unipe.java.collections.exceptions.EstruturaVaziaException;
import br.unipe.java.collections.exceptions.RemoveException;

public class TestaFila {
	
	public static void main(String[] args) {
		
		Fila<Integer> f = new Fila<Integer>();
		
		Integer i = new Integer(1);
		Integer i1 = new Integer(5);
		Integer i2 = new Integer(7);
		
		f.addElemento(i);
		f.addElemento(i1);
		f.addElemento(i2);

		try {
			f.exibirElemento();
			f.removeElemento();
			f.exibirElemento();
		} catch (RemoveException e) {
			System.out.println(e.getMessage());
		} catch (EstruturaVaziaException estruturaVaziaException) {
			System.out.println(estruturaVaziaException.getMessage());
		}
	}
	



}
