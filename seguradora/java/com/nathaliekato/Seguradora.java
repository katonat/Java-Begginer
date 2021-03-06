package com.nathaliekato;

import java.util.ArrayList;
import java.util.Scanner;

import modelo.Cliente;
import modelo.Contrato;
import modelo.ContratoResidencial;

/**
 * 
 * @author nathalie.kato
 *
 */
public class Seguradora {
	
	private ArrayList<Cliente> listaCliente = new ArrayList<>();
	private ArrayList<Contrato> listaContrato = new ArrayList<>();
	
	/**
	 * Metodo que realiza cadastro de cliente.
	 * @param cliente a ser cadastrado
	 */
	public void cadastraCliente(Cliente cliente) {
		getListaCliente().add(cliente);
		System.out.println("Cadastro do cliente realizado com sucesso.");
	}
	
	/**
	 * Metodo que realiza o cadastro de contratos
	 * @param contrato a ser cadastrado
	 */
	public void cadastrarContrato(Contrato contrato) {
		getListaContrato().add(contrato);
		System.out.println("Cadastro de contrato realizado com sucesso.");
	}

	public void listarClientes() {
		for(Cliente cliente: getListaCliente())
			System.out.println(cliente);
	}
		
	public void listarContratos() {
		for(Contrato contrato: getListaContrato())
			System.out.println(contrato);
	}	
	
	
	
	
	
	
	public ArrayList<Cliente> getListaCliente() {
		return listaCliente;
	}

	public void setListaCliente(ArrayList<Cliente> listaCliente) {
		this.listaCliente = listaCliente;
	}

	public ArrayList<Contrato> getListaContrato() {
		return listaContrato;
	}

	public void setListaContrato(ArrayList<Contrato> listaContrato) {
		this.listaContrato = listaContrato;
	}

	
	
}
