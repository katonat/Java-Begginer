package br.unipe.java.syncthreads;

public class CanalAtendimento implements Runnable {

	private String nome;
	private ContaCorrente cc;
	
	public CanalAtendimento(String nome, ContaCorrente cc) {
		this.nome = nome;
		this.cc = cc;
	}
	
	public void setCC(ContaCorrente cc) {
		this.cc = cc;
	}
	
	public ContaCorrente getCC() {
		return this.cc;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void run() {
		
		synchronized(cc) {
			Float saldo = this.cc.getSaldo();
			this.cc.setSaldo(saldo - 5);
		}		

	}
	
	

}
