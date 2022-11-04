package com.Victor;

public class Veiculo {

	private boolean motor;

	
	public Veiculo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Veiculo(boolean motor) {
		super();
		this.motor = motor;
	}

	public boolean isMotor() {
		return motor;
	}

	public void setMotor(boolean motor) {
		this.motor = motor;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Veiculo [motor=");
		builder.append(motor);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
