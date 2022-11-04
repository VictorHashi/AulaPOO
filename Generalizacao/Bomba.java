package com.Victor;

public class Bomba {

	private double totalLitros;
	private float valorLitro;
	
	public Bomba() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bomba(double totalLitros, float valorLitro) {
		super();
		this.totalLitros = totalLitros;
		this.valorLitro = valorLitro;
	}

	public double getTotalLitros() {
		return totalLitros;
	}

	public void setTotalLitros(double totalLitros) {
		this.totalLitros = totalLitros;
	}

	public float getValorLitro() {
		return valorLitro;
	}

	public void setValorLitro(float valorLitro) {
		this.valorLitro = valorLitro;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Bomba [totalLitros=");
		builder.append(totalLitros);
		builder.append(", valorLitro=");
		builder.append(valorLitro);
		builder.append("]");
		return builder.toString();
	}
	
	public boolean abastecerPorLitro(int litro) {
		
		if(litro > this.getTotalLitros())
			return false;
		
		this.setTotalLitros(this.getTotalLitros()-litro);
		return true;
	}
	
	public boolean abastecerPorValor(double valor) {
		
		double litro = valor / this.valorLitro;
		if(litro > this.getTotalLitros())
			return false;
		
		this.setTotalLitros(this.getTotalLitros()-litro);
		return true;
		
	}
	
	
}
