package com.Victor;

public class Pessoa2 {

	private int codigo;
	private String nome;
	private String endereco;
	
	
	
	public Pessoa2() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Pessoa2(int codigo, String nome, String endereco) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.endereco = endereco;
	}



	public int getCodigo() {
		return codigo;
	}



	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getEndereco() {
		return endereco;
	}



	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}



	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pessoa2 [codigo=");
		builder.append(codigo);
		builder.append(", nome=");
		builder.append(nome);
		builder.append(", endereco=");
		builder.append(endereco);
		builder.append("]");
		return builder.toString();
	}
	
	
}
