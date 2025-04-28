package model.entities.figura3D;

import model.enums.Color;
import model.entities.FiguraGeometrica;
import model.interfaces.DimensaoSuperficial;
import model.interfaces.DimensaoVolumetrica;

public abstract class Figura3D extends FiguraGeometrica implements DimensaoVolumetrica, DimensaoSuperficial{

	public Figura3D(String name, Color color) {
	}

	
}
