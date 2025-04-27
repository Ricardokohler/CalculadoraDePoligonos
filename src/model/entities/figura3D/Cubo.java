package model.entities.figura3D;

import entities.enums.Color;

public class Cubo extends Figura3D{
	private double lado;

	public Cubo(String name, Color color, double lado) {
		super(name, color);
		this.lado = lado;
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	@Override
	public double calcularVolume() {
		return Math.pow(lado, 3);
	}

	@Override
	public double calcularArea() {
		return 6 * (Math.pow(lado, 2));
	}

	
}
