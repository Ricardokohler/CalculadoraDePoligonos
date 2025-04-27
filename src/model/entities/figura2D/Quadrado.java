package model.entities.figura2D;

import entities.enums.Color;

public class Quadrado extends Figura2D{
	private double side;
	
	
	public Quadrado(String name, Color color, double side) {
		super(name, color);
		this.side = side;
	}

	
	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	
	@Override
	public double calcularArea() {
		return Math.pow(side, 2);
	}
	
	
}
