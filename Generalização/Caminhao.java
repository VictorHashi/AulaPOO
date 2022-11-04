package com.Victor;

public class Caminhao extends Veiculo {

	private int eixos;

	
	
	public Caminhao() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Caminhao(boolean motor) {
		super(motor);
		// TODO Auto-generated constructor stub
	}



	public Caminhao(int eixos) {
		super();
		this.eixos = eixos;
	}



	public int getEixos() {
		return eixos;
	}



	public void setEixos(int eixos) {
		this.eixos = eixos;
	}



	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append(" - Caminhao [eixos=");
		builder.append(eixos);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
