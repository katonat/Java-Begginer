package modelo;

import java.util.Scanner;

public abstract class Contrato {
	
	private Cliente cliente;
	private float valorImovel;
	
	protected Contrato() {
		
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public float getValorImovel() {
		return valorImovel;
	}
	public void setValorImovel(float valorImovel) {
		this.valorImovel = valorImovel;
	}
	

	public abstract float obterValorSeguro(); //n�o tem corpo, n�o funcional
	
}