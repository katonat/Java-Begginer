package com.unipe.br.arrays.exercicios;

import java.util.Scanner;

/**
 * Exercicios sobre Arrays
 * @author Nathalie Kato
 *
 */
public class Questoes {
	public static final int TAM = 300;
	
	/**
	 * Método que exibe um array de inteiros
	 * @param array a ser passado para exibição
	 * @param cnt : contador para percorrer o array e determinar o seu final
	 */
	public void exibeArray(int[] array, int cnt) {
		System.out.print(array[cnt] + " ");
		cnt++;
		if(cnt < array.length)
			exibeArray(array, cnt);
	}	
	
	/**
	 * Método para inicializar as posições de um array de TAM posições com o número 45
	 * @param array recebe o array que será utilizado
	 */
	public void questao1(int[] array) {
		int i = 0;
		for(i = 0; i < TAM; i++)
			array[i] = 45;
		
		exibeArray(array, 0);
	}
	
	/**
	 * Método para exibir um array de int de 3 formas diferentes
	 * @param array recebe o array que será utilizado
	 */
	public void questao2(int array[]) {
		int i = 0;
		
		System.out.print("\n\nForma 1: ");
		for(i = 0; i < TAM; i++)
			System.out.print(array[i]+" ");

		System.out.printf("\nForma 2:\n");
		for(i = 0; i < TAM; i++)
			System.out.println(array[i]);
		
		System.out.println("Forma 3:");
		i = 0;
		while(i < TAM) {
			System.out.printf("Elemento [%d] = [%d]\n", i+1, array[i]);		
			i++;
		}
	}
	
	/**
	 * Metodo que utiliza um pivo e separa os valores maiores que ele de um lado e menores de outro de um array de int
	 */
	public int separa(int[] array, int ini, int fim) {
		int pivo = array[ini];
		int aux = 0;
		int i = ini + 1,
			f = fim;
			
		while(i <= f) {
			if(array[i] <= pivo)
				i++;
			else if(array[f] > pivo)
				f--;
			else {
				aux = array[i];
				array[i] = array[f];
				array[f] = aux;
				i++;
				f--;
			}
		}
		array[ini] = array[f];
		array[f] = pivo;
		return f; //posição ocupada pelo pivo
	}
	
	/**
	 * Metodo para ordenar os elementos de um array de int utilizando o metodo separa
	 */
	public void quickSort(int[] array, int ini, int fim) {
		int posicaoPivo = 0;
		
		if(ini < fim) {
			posicaoPivo = separa(array, ini, fim);
			quickSort(array, ini, posicaoPivo-1);
			quickSort(array, posicaoPivo+1, fim);
		}
	}
	
	/**
	 * Metodo que recebe um valor digitado pelo usuario
	 */
	public int recebeUmValor(Scanner leitor) {
		int valor = 0;
		System.out.printf("\nDigite um valor: ");
		valor = leitor.nextInt();
		
		return valor;
	}
	
	/**
	 * Método que realiza uma busca binária em um array ordenado para achar sua posição no array
	 * @param array que será percorrido
	 * @param ini : início do array
	 * @param fim : final do array
	 * @param key : valor que será procurado nas posições do array
	 * @return posição do valor encontrado ou -1 se não encontrado
	 */
	public int buscaBinaria(int[] array, int ini, int fim, int key) {
		int meio = ini + (fim - ini)/2;
		
		if(fim < ini)
			return -1;
			
		if(array[meio] == key)
			return meio;
			
		if(array[meio] < key)
			return buscaBinaria(array, meio + 1, fim, key);
		else
			return buscaBinaria(array, ini, meio - 1, key);
			
	}
	
	/**
	 * Método para criar um array com 10 valores informado e permitir a busca de determinado valor
	 */
	public void questao3(Scanner leitor) {
		int[] array = new int[10];
		int i = 0,
			valor = 0,
			posicao = 0;
		
		System.out.println("Digite 10 valores: "); //recebe os 10 valores digitados pelo usuario
		for(i = 0; i < 10; i++)
			array[i] = leitor.nextInt();
		
		quickSort(array, 0, array.length - 1);
		
		System.out.printf("\nValores ordenados:\n");
		exibeArray(array, 0);
			
		valor = recebeUmValor(leitor);//valor a ser procurado no array
		
		if((posicao = buscaBinaria(array, 0, array.length-1, valor)) == -1)
			System.out.println("Valor nao encontrado no array.");
		else	
			System.out.printf("Esse valor ocupa a %d posição.\n", posicao+1);
	}
	
	public void recebeNomes(String[] array, Scanner leitor) {
		int i = 0;
		System.out.printf("Digite %d nomes: ", array.length);		
		for(i = 0; i < array.length; i++)
			array[i] = leitor.next();
	}
	
	/**
	 * Método que compara duas strings
	 * @param nome1 primeira string
	 * @param nome2 segunda string
	 * @return 0 se as strings forem iguais, -1 se a primeira for menor do que a segunda e 1 se a primeira for maior do que a segunda
	 */
	public int comparaNomes(String nome1, String nome2) {
		return (nome1.compareToIgnoreCase(nome2));
	}
	/**
	 * Método que separa os nomes menores de um lado e maiores de outro de determinado pivo
	 * @param array que será modificado
	 * @param ini posição inicial do intervalo
	 * @param fim posição final do intervalo
	 * @return posição ocupada pelo pivo
	 */
	public int separaNomes(String[] array, int ini, int fim) {
		String pivo = array[ini];
		String aux = "";
		int i = ini + 1;
		int f = fim;
		
		while(i <= f) {
			if(comparaNomes(array[i], pivo) <= 0)
				i++;
			else if(comparaNomes(array[f], pivo) > 0)
				f--;
			else {
				aux = array[i];
				array[i] = array[f];
				array[f] = aux;
				i++;
				f--;
			}
		}
		array[ini] = array[f];
		array[f] = pivo;
		return f; //posição ocupada pelo pivo
	}
	
	/**
	 * Método que ordena os elementos de um array de String atraves do método separaNomes
	 * @param array que será ordenado
	 * @param ini início do intervalo
	 * @param fim final do intervalo
	 */
	public void quickSortNomes(String[] array, int ini, int fim) {
		int posicaoPivo = 0;
		
		if(ini < fim) {
			posicaoPivo = separaNomes(array, ini, fim);
			quickSortNomes(array, ini, posicaoPivo-1);
			quickSortNomes(array, posicaoPivo+1, fim);
		}
	}
	
	/**
	 * Método para exibir um array de String
	 * @param array que será exibido
	 * @param cnt contador para delimitar o final do array
	 */
	public void exibeArrayString(String[] array, int cnt) {
		System.out.print(array[cnt] + " ");
		cnt++;
		if(cnt < array.length)
			exibeArrayString(array, cnt);
	}
	
	/**
	 * Método que recebe 10 nomes e os ordena em ordem alfabética
	 * @param array
	 * @param leitor
	 */
	public void questao4(String[] array, Scanner leitor) {
		recebeNomes(array, leitor);
		quickSortNomes(array, 0, array.length-1);
		exibeArrayString(array, 0);
	}
	
	/**
	 * Método que recebe uma determinada quantidade de valores digitados pelo usuário
	 * @param array que receberá os valores informados
	 * @param qntd quantidade de valores a serem informados
	 * @param leitor faz a leitura do que é digitado
	 */
	public void recebeValores(int[] array, int qntd, Scanner leitor) {
		int i = 0;
		System.out.printf("Digite %d valores: ", qntd);
		for( ; i < qntd; i++) 
			array[i] = leitor.nextInt();
	}
	
	/**
	 * Método que recebe 10 valores e os armazena num array de inteiro em ordem crescente
	 * @param array
	 * @param leitor
	 */
	public void questao5(Scanner leitor) {
		int[] array = new int[10];
		
		recebeValores(array, 10, leitor);
		quickSort(array, 0, array.length-1);
		exibeArray(array, 0);
	}
	
	public int insereOrdenado(Usuario[] array, Usuario novo) {
		int j = 0;

		for(int i = 0; i < array.length; i++) {
			if(array[i].getNome().equals("") || comparaNomes(array[i].getNome(), novo.getNome()) >= 0) {
				for(j = (array.length-1); j > i; j--) {
					array[j] = array[j-1];
				}
				array[i] = novo;
				return 1;
			}
		}
		return -1;
	}
	
	public int comparaCpf(Usuario[] array, Usuario novo) {
		for(int i = 0; i < array.length; i++) {
			if(comparaNomes(novo.getCpf(), array[i].getCpf()) == 0) {
				System.out.println("CPF já cadastrado.");
				return -1; //cpf ja existente
			}
		}
		return 1; //cpf ainda nao cadastrado
	}
	
	public void cadastrarUser(Usuario[] array, Scanner leitor) {
		int i = 0;
		Usuario novo = new Usuario();
		
		for(i = 0; i < array.length; i++)
			array[i] = new Usuario();
		
		i = 0;
		System.out.print("\n* Cadastro de Usuários *\n");
		while(i < array.length) {
			novo = new Usuario();
			System.out.print("Nome: ");
			novo.setNome(leitor.next());
			System.out.printf("CPF: ");
			novo.setCpf(leitor.next());
			
			if(comparaCpf(array, novo) == 1) {				
				insereOrdenado(array, novo);
				i++;
			}
		}	
	}
	
	public void questao6(Usuario[] array, Scanner leitor) {
		int i = 0;
		
		cadastrarUser(array, leitor);
		
		for(i = 0; i < array.length; i++) {
			System.out.print(array[i].getNome());
			System.out.printf("\t\tCPF: %s\n", array[i].getCpf());
		}
	}
}