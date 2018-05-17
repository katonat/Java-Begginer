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
		System.out.printf("Tipo de Pessoa\n(1)Física\n(2)Jurídica\n");
		//c.setTipoPessoa(leitor.nextInt());
		
		leitor.close();
	}
	
	public void cadastrarContrato() {
		Scanner leitor = new Scanner(System.in);
		int tipo = 0;
		
		System.out.printf("(1)Pessoa Física\n(2)Pessoa Jurídica");
		
		leitor.close();
	}

}
