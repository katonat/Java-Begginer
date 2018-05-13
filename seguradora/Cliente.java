package seguradora;

import java.util.Scanner;

public class Cliente {

	private int codigo;
	private String nome;
	private TipoPessoa tipoPessoa;
	
	public Cliente() {
		this.codigo = 0;
		this.nome = "";
	}
	
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public TipoPessoa getTipoPessoa() {
		return tipoPessoa;
	}

	public void setTipoPessoa(TipoPessoa tipoPessoa) {
		this.tipoPessoa = tipoPessoa;
	}


	public void cadastrarCliente() {
		Scanner leitor = new Scanner(System.in);

		System.out.println("* CADASTRO DE CLIENTES *");
		System.out.print("Nome: ");
		setNome(leitor.nextLine());
		System.out.printf("\nCodigo: ");
		setCodigo(leitor.nextInt());
		System.out.printf("Tipo de Pessoa\n(1)Física\n(2)Jurídica\n");
		TipoPessoa.valueOf(leitor.nextLine());
		
		leitor.close();
	}

	
	
}