package seguradora;

import java.util.Scanner;

public class Contrato {
	
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
	
	
	public void cadastrarContrato() {
		Scanner leitor = new Scanner(System.in);
		int tipo = 0;
		
		System.out.printf("(1)Pessoa Física\n(2)Pessoa Jurídica");

	}
	
	
}