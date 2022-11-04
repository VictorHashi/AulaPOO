package com.Victor;

public class Carro extends Veiculo {

	private int portas;

	
	
	public Carro() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Carro(boolean motor) {
		super(motor);
		// TODO Auto-generated constructor stub
	}



	public Carro(int portas) {
		super();
		this.portas = portas;
	}



	public int getPortas() {
		return portas;
	}



	public void setPortas(int portas) {
		this.portas = portas;
	}



	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append(" - Carro [portas=");
		builder.append(portas);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
