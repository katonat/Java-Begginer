package modelo;


import tiposenums.TipoPessoa;

public class Cliente {

	private int codigo;
	private String nome;
	private TipoPessoa tipoPessoa;
	
	
	
	
	
	@Override
	public String toString() {
		return "Cliente [codigo=" + codigo + ", nome=" + nome + ", tipoPessoa="
				+ tipoPessoa + "]";
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

}