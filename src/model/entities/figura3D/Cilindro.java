package model.entities.figura3D;

import entities.enums.Color;

public class Cilindro extends Figura3D{
	private double radius;
	private double high;
	
	public Cilindro(String name, Color color, double radius, double high) {
		super(name, color);
		this.radius = radius;
		this.high = high;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getHigh() {
		return high;
	}

	public void setHigh(double high) {
		this.high = high;
	}

	@Override
	public double calcularVolume() {
		return Math.PI * Math.pow(radius, 2) * high;
	}

	@Override
	public double calcularArea() {
		return (2 * Math.PI * Math.pow(radius, 2)) + (2 * Math.PI * radius * high);
	}
	
	
}
