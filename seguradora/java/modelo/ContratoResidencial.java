package modelo;

import tiposenums.TipoResidencia;
import tiposenums.Zona;

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
	
	
	public float obterValorSeguro() {
		float valorSeguro = 0f;
		valorSeguro = 0.2f * getValorImovel();
		

		
		return valorSeguro;
	}
	
	
}