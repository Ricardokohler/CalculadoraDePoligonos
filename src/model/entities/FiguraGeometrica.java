 package model.entities;

import entities.enums.Color;

public abstract class FiguraGeometrica {
	private String name;
	protected Color color;
	
	public FiguraGeometrica() {
	}
	
	public FiguraGeometrica(String name, Color color) {
		this.name = name;
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	
	
}
