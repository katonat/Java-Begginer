package modelo;

import tiposenums.Ramo;

public class ContratoEmpresarial extends Contrato{
	
	private int numeroFuncionarios;
	private int numeroVisitasDiarias;
	private Ramo ramo;
	
	public ContratoEmpresarial() {
		
	}
	
	public float obterValorSeguro() {
		float valorSeguro = 0f;
		valorSeguro = obterValorPercentualImovel();
		valorSeguro += obterValorTotalFuncionarios();
		valorSeguro += obterValorVisitas();
		valorSeguro += obterValorRamo();
		return valorSeguro;
	}
	
	public float obterValorPercentualImovel() {
		float valor = getValorImovel() * 0.04f;
		return valor;
	}
	
	public float obterValorTotalFuncionarios() {
		int quantidadeFuncionarios = getNumeroFuncionarios();
		float valorCalculado = (quantidadeFuncionarios / 10) * 0.002f;
		return valorCalculado;
	}
	
	public float obterValorVisitas() {
		int visitas = getNumeroVisitasDiarias();
		float valorCalculado = (visitas/200) * 0.003f;
		return valorCalculado;
	}
	
	public float obterValorRamo() {
		if(getRamo().equals(Ramo.INDUSTRIA))
			return getValorImovel() * 0.01f;
		
		if(getRamo().equals(Ramo.COMERCIO))
			return getValorImovel() * 0.005f;
		
		return 0.0f;
	}
	
	
	public int getNumeroFuncionarios() {
		return numeroFuncionarios;
	}
	public void setNumeroFuncionarios(int numeroFuncionarios) {
		this.numeroFuncionarios = numeroFuncionarios;
	}
	public int getNumeroVisitasDiarias() {
		return numeroVisitasDiarias;
	}
	public void setNumeroVisitasDiarias(int numeroVisitasDiarias) {
		this.numeroVisitasDiarias = numeroVisitasDiarias;
	}
	public Ramo getRamo() {
		return ramo;
	}
	public void setRamo(Ramo ramo) {
		this.ramo = ramo;
	}

}
