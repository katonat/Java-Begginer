package com.unipe.br.arrays.exercicios;

public class Usuario {
	private String nome;
	private String cpf;
	
	public Usuario(){
		this.setNome("");
		this.setCpf("");
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
}