package com.unipe.br.arrays.exercicios;

import java.util.Scanner;

public class ExerciciosArrays {
	public static void main(String[] args) {
		int[] meuArrayInt = new int[300];
		String[] meuArrayString = new String[10];
		Usuario[] meuArrayUsuarios = new Usuario[10];
		Scanner leitor = new Scanner(System.in);
		Menu m = new Menu();
		
		m.menu(leitor, meuArrayInt, meuArrayUsuarios, meuArrayString);

	}
}