package com.nathaliekato;

import java.util.Scanner;

import modelo.Cliente;

public class Seguradora {
	
	
	
	
	
	public void cadastrarCliente() {
		Scanner leitor = new Scanner(System.in);
		Cliente c = new Cliente();

		System.out.println("* CADASTRO DE CLIENTES *");
		System.out.print("Nome: ");
		c.setNome(leitor.nextLine());
		System.out.printf("\nCodigo: ");
		c.setCodigo(leitor.nextInt());
		System.out.printf("Tipo de Pessoa\n(1)F�sica\n(2)Jur�dica\n");
		//c.setTipoPessoa(leitor.nextInt());
		
		leitor.close();
	}
	
	public void cadastrarContrato() {
		Scanner leitor = new Scanner(System.in);
		int tipo = 0;
		
		System.out.printf("(1)Pessoa F�sica\n(2)Pessoa Jur�dica");
		
		leitor.close();
	}

}
