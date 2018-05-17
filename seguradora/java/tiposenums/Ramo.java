package tiposenums;

public enum Ramo {

	COMERCIO(1, "Comércio"),
	INDUSTRIA(2, "Indústria"),
	AGROPECUARIA(3, "Agropecuária");
	
	private String descricao;
	private int codigo;
	
	
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getTipoResidencia() {
		return descricao;
	}

	public void setTipoResidencia(int codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}

	private Ramo(int codigo, String descricao) {
		this.codigo = codigo;		
		this.descricao = descricao;
	}
}