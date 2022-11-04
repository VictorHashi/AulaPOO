package com.Victor;

public class BombaGasolina extends Bomba {

	public BombaGasolina() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BombaGasolina(double totalLitros, float valorLitro) {
		super(totalLitros, valorLitro);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("BombaGasolina [");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}

	
	
}
