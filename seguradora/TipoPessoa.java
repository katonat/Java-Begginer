package seguradora;

/**
 * 
 * @author nathalie.kato
 *
 */
public enum TipoPessoa {
	
	FISICA("Pessoa Física"),
	JURIDICA("Pessoa Jurídica");

	
	private String tipo;
	
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}	
	
	private TipoPessoa(String tipo) {
		this.tipo = tipo;
	}


	
	
	
	
}
