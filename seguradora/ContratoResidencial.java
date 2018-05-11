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
	
	
}
