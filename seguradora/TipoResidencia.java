package seguradora;

public enum TipoResidencia {
	
	APARTAMENTO("Apartamento"),
	CASA("Casa");
	
	private String tipoResidencia;
	
	
	public String getTipoResidencia() {
		return tipoResidencia;
	}

	public void setTipoResidencia(String tipoResidencia) {
		this.tipoResidencia = tipoResidencia;
	}

	private TipoResidencia(String tipoResidencia) {
		this.tipoResidencia = tipoResidencia;
	}

}