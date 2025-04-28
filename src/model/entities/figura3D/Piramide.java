package model.entities.figura3D;

import model.enums.Color;

public class Piramide extends Figura3D {
    private double lado;
    private double height;
    
    private double areaBase;
    private double slantHeight;
    
    public Piramide(String name, Color color, double lado, double height) {
        super(name, color);
        this.lado = lado;
        this.height = height;
        

        this.areaBase = Math.pow(lado, 2);
        this.slantHeight = Math.sqrt(Math.pow(lado / 2, 2) + Math.pow(height, 2));
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double calcularVolume() {
        return (1.0 / 3) * areaBase * height;  // Volume 
    }

    @Override
    public double calcularArea() {
        double areaLaterais = 4 * (lado * slantHeight / 2);  // Área lateral
        return areaBase + areaLaterais;  // Soma das áreas 
    }
}
