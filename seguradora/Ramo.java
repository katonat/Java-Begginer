package seguradora;

public enum Ramo {

	COMERCIO("Comércio"),
	INDUSTRIA("Indústria"),
	AGROPECUARIA("Agropecuária");
	
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
