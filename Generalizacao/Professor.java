package com.Victor;

public class Professor extends Pessoa2 {

	private String disciplina;

	public Professor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Professor(int codigo, String nome, String endereco) {
		super(codigo, nome, endereco);
		// TODO Auto-generated constructor stub
	}

	public Professor(String disciplina) {
		super();
		this.disciplina = disciplina;
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append(" - Professor [disciplina=");
		builder.append(disciplina);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
}
