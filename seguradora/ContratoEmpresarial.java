package seguradora;

public class ContratoEmpresarial extends Contrato{
	
	private int numeroFuncionarios;
	private int numeroVisitasDiarias;
	private Ramo ramo;
	
	public ContratoEmpresarial() {
		
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
	
	
	public float calcularSeguro() {
		int i = 0;
		float valorSeguro = 0f;
		valorSeguro = getValorImovel() * 0.04f;
		
		for(i = 10; i <= getNumeroFuncionarios(); i+=10)
			valorSeguro += getValorImovel()*0.002f;
		
		for(i = 200; i <= getNumeroVisitasDiarias(); i+=200)
			valorSeguro += getValorImovel()*0.003f;
		
		if(ramo.toString().equals("INDUSTRIA"))
			valorSeguro += getValorImovel()*0.01f;
		else if(ramo.toString().equals("COMERCIO"))
			valorSeguro += getValorImovel()*0.005f;
		
		return valorSeguro;
	}
	

}