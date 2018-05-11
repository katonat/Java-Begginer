package seguradora;

public enum Ramo {

	COMERCIO("Com�rcio"),
	INDUSTRIA("Ind�stria"),
	AGROPECUARIA("Agropecu�ria");
	
	private String ramo;
	
	public String getRamo() {
		return ramo;
	}

	public void setRamo(String ramo) {
		this.ramo = ramo;
	}

	
	private Ramo(String ramo) {
		this.ramo = ramo;
	}
}
