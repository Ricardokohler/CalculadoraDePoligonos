package model.entities.figura2D;

import model.enums.Color;

public class Triangulo extends Figura2D{
	private double ladoA;
	private double ladoB;
	private double ladoC;
	
	public Triangulo(String name, Color color, double ladoA, double ladoB, double ladoC) {
		super(name, color);
		this.ladoA = ladoA;
		this.ladoB = ladoB;
		this.ladoC = ladoC;
	}

	public double getLadoA() {
		return ladoA;
	}

	public void setLadoA(double ladoA) {
		this.ladoA = ladoA;
	}

	public double getLadoB() {
		return ladoB;
	}

	public void setLadoB(double ladoB) {
		this.ladoB = ladoB;
	}

	public double getLadoC() {
		return ladoC;
	}

	public void setLadoC(double ladoC) {
		this.ladoC = ladoC;
	}

	@Override
	public double calcularArea() {
		double semiP = (ladoA + ladoB + ladoC) / 2;
		return Math.sqrt(semiP * (semiP - ladoA) * (semiP - ladoB) * (semiP - ladoC));
	}

	
}
