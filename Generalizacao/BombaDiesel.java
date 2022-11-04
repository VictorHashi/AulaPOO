package com.Victor;

public class BombaDiesel extends Bomba {

	public BombaDiesel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BombaDiesel(double totalLitros, float valorLitro) {
		super(totalLitros, valorLitro);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("BombaDiesel [");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}

	
	
}
