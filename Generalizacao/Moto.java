package com.Victor;

public class Moto extends Veiculo {
	
	private int cilindradas;

	
	public Moto() {
		super();
		// TODO Auto-generated constructor stub
	}




	public Moto(boolean motor) {
		super(motor);
		// TODO Auto-generated constructor stub
	}




	public Moto(int cilindradas) {
		super();
		this.cilindradas = cilindradas;
	}




	public int getCilindradas() {
		return cilindradas;
	}




	public void setCilindradas(int cilindradas) {
		this.cilindradas = cilindradas;
	}




	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append(" - Moto [cilindradas=");
		builder.append(cilindradas);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
