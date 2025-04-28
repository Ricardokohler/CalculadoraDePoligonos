package model.entities.figura2D;

import model.enums.Color;

public class Circulo extends Figura2D{
	
	private double radius;

	public Circulo(String name, Color color, double radius) {
		super(name, color);
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double calcularArea() {
		return Math.PI * Math.pow(radius,2);
		
	}
	
	
}
