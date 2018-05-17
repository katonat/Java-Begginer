package tiposenums;

public enum Zona {
	
	RURAL(1, "rural"),
	URBANA(2, "urbana"),
	SUBURBANA(3, "suburbana");
	
	private String descricao;
	private int codigo;
	
	Zona(int codigo, String descricao) {
		this.descricao = descricao;
		this.codigo = codigo;
	}

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
	

}