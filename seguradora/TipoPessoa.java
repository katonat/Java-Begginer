package seguradora;

public enum TipoPessoa {
	
	FISICA(1),
	JURIDICA(2);

	
	private int codigo;
	

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	private TipoPessoa(int codigo) {
		this.codigo = codigo;

	}

}