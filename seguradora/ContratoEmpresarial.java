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
	
	

}
