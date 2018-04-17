package com.unipe.br.arrays.exercicios;

import java.util.Scanner;

public class Menu {

	public void menu(Scanner leitor, int[] arrayInt, Usuario[] arrayUsuario, String[] arrayString) {
		int opcao = -1;
		Questoes q = new Questoes();
		
		System.out.println("Resolução de Exercícios de Arrays");
		System.out.println("1 - Crie um array de inteiros com 300 posições e preencha todos com o valor 45.");
		System.out.println("2 - Imprima todos os valores da questão anterior de 3 formas diferentes.");
		System.out.println("3 - Crie um programa que receba 10 valores e depois permita que seja feita uma pesquisa por tal valor, ordene a lista e faça uma pesquisa Binária de forma que ela retorne o indice se o mesmo existir no array.");
		System.out.println("4 - Crie um programa que receba vários 10 nomes e ao final ordene os mesmo em ordem alfabética.");
		System.out.println("5 - Realize o mesmo procedimento da questão anterior, sendo que o mesmo vai receber uma seqüência numérica de 10 inteiros , e ao final ele vai imprimir  a seqüência de forma ordenada.");
		System.out.println("6 - É nescessário desenvolver uma aplicação que salve objetos do tipo usuário, para cada objeto deste tipo deve ser associado uma chave, não é permitido que existam repetições.");
		System.out.println("0 - Sair");

		while(opcao != 0) {
			System.out.printf("\n\nEscolha uma questao: ");
			opcao = leitor.nextInt();
			
			switch(opcao) {
			case 1:
					q.questao1(arrayInt);
				break;
			case 2:
					q.questao2(arrayInt);
				break;
			case 3:
					q.questao3(leitor);
				break;
			case 4:
					q.questao4(arrayString, leitor);
				break;
			case 5:
					q.questao5(leitor);
				break;
			case 6:
					q.questao6(arrayUsuario, leitor);
				break;
			}
		}
		
	}
}
