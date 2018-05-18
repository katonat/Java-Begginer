package com.nathaliekato;

import java.util.Scanner;

import modelo.Cliente;
import tiposenums.TipoPessoa;

public class Programa {
	
	private static Scanner Leitor = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Menu menu = new Menu();
		int opcao = 99;
		
		while(true) {
			menu.menuPrincipal();
			opcao = Integer.parseInt(Leitor.nextLine());
			
			
		}
	}
	
	public static Cliente obterCliente() {
		System.out.println("Informe o código");
		int codigo = Integer.parseInt(Leitor.nextLine());
		System.out.println("Informe o nome");
		String nome = Leitor.nextLine();
		System.out.println("Informe o tipo 1-Pessoa Jurídica\n2-Pessoa Física");
		int tPessoa = Integer.parseInt(Leitor.nextLine());
		TipoPessoa tipoPessoa = tPessoa == 1 ? TipoPessoa.JURIDICA : TipoPessoa.FISICA;
		
		Cliente cliente = new Cliente();
		cliente.setCodigo(codigo);
		cliente.setNome(nome);
		cliente.setTipoPessoa(tipoPessoa);
		return cliente;

	}

}
