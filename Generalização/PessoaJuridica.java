package com.Victor;

public class PessoaJuridica extends Pessoa {

	private String cnpj;
	private String tipoEmpresa;
	
	
	
	public PessoaJuridica() {
		super();
		// TODO Auto-generated constructor stub
	}



	public PessoaJuridica(String cnpj, String tipoEmpresa) {
		super();
		this.cnpj = cnpj;
		this.tipoEmpresa = tipoEmpresa;
	}



	public String getCnpj() {
		return cnpj;
	}



	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}



	public String getTipoEmpresa() {
		return tipoEmpresa;
	}



	public void setTipoEmpresa(String tipoEmpresa) {
		this.tipoEmpresa = tipoEmpresa;
	}



	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append(" - PessoaJuridica [cnpj=");
		builder.append(cnpj);
		builder.append(", tipoEmpresa=");
		builder.append(tipoEmpresa);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
