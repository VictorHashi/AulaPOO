package com.Victor;

public class PessoaFisica extends Pessoa {

	private String cpf;
	private String estadoCivil;
	
	
	
	public PessoaFisica() {
		super();
		// TODO Auto-generated constructor stub
	}



	public PessoaFisica(String cpf, String estadoCivil) {
		super();
		this.cpf = cpf;
		this.estadoCivil = estadoCivil;
	}



	public String getCpf() {
		return cpf;
	}



	public void setCpf(String cpf) {
		this.cpf = cpf;
	}



	public String getEstadoCivil() {
		return estadoCivil;
	}



	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}



	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append(" - PessoaFisica [cpf=");
		builder.append(cpf);
		builder.append(", estadoCivil=");
		builder.append(estadoCivil);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
	
}
