package seguradora;

public class ContratoResidencial extends Contrato{
	
	private String endereco;
	private Zona zona;
	private TipoResidencia tipoResidencia;
	
	public ContratoResidencial() {
		
	}
		
	
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public Zona getZona() {
		return zona;
	}
	public void setZona(Zona zona) {
		this.zona = zona;
	}
	public TipoResidencia getTipoResidencia() {
		return tipoResidencia;
	}
	public void setTipoResidencia(TipoResidencia tipoResidencia) {
		this.tipoResidencia = tipoResidencia;
	}
	
	
	public float calcularSeguro() {
		float valorSeguro = 0f;
		valorSeguro = 0.2f * getValorImovel();
		
		if(zona.toString().equals("URBANA"))
			valorSeguro += getValorImovel() * 0.01f;
		else if(zona.toString().equals("SUBURBANA"))
			valorSeguro += getValorImovel() * 0.005f;
	
		if(tipoResidencia.toString().equals("CASA"))
			valorSeguro += getValorImovel() * 0.005f;

		
		return valorSeguro;
	}
	
	
}