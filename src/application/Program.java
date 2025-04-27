package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.enums.Color;
import model.entities.FiguraGeometrica;
import model.entities.figura2D.Circulo;
import model.entities.figura2D.Figura2D;
import model.entities.figura2D.Quadrado;
import model.entities.figura2D.Triangulo;
import model.entities.figura3D.Cilindro;
import model.entities.figura3D.Cubo;
import model.entities.figura3D.Figura3D;
import model.entities.figura3D.Piramide;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List <FiguraGeometrica> list = new ArrayList <>();
		
		System.out.println("Calculo de Figuras: ");
		System.out.print("Nome: ");
		String name = sc.nextLine();
		System.out.print("Cor: ");
		Color color = Color.valueOf(sc.next());
		
		switch (name) {
		case "Circulo":
			System.out.println("Raio: ");
			double radius = sc.nextDouble();
			
			Circulo cir = new Circulo(name, color, radius);
			list.add(cir);
			break;
			
		case "Quadrado":
			System.out.print("Medida dos lados: ");
			double sideSquare = sc.nextDouble();
			
			Quadrado quad = new Quadrado(name, color, sideSquare);
			list.add(quad);
			break;
			
		case "Triangulo":
			System.out.print("Lado A: ");
			double ladoA = sc.nextDouble();
			System.out.print("Lado B: ");
			double ladoB = sc.nextDouble();
			System.out.print("Lado C: ");
			double ladoC = sc.nextDouble();
			
			Triangulo tri = new Triangulo(name, color, ladoA, ladoB, ladoC);
			list.add(tri);
			break;
			
		case "Cubo":
			System.out.println("Medida dos lados: ");
			double sideCube = sc.nextDouble();
			
			Cubo cub = new Cubo(name, color, sideCube);
			list.add(cub);
			break;
		
		case "Cilindro":
			System.out.print("Raio: ");
			double radiusCilinder = sc.nextDouble();
			System.out.print("Altura: ");
			double height = sc.nextDouble();
			
			Cilindro cil = new Cilindro(name, color, radiusCilinder, height);
			list.add(cil);
			break;
			
		case "Piramide":
			System.out.print("Medida dos lados da base: ");
			double sidePyramid = sc.nextDouble();
			System.out.print("Altura: ");
			double heightPyramid = sc.nextDouble();
			
			Piramide pir = new Piramide(name, color, sidePyramid, heightPyramid);
			list.add(pir);
			break;
			
		default:
			System.out.println("Nome de figura invalido: ");
			break;
		}
		
		
		
		//calculos
		System.out.println();
		System.out.println("Calculos: ");
		for(FiguraGeometrica x : list) {
			if (x  instanceof Figura2D) {
				System.out.println("Area: " + ((Figura2D) x).calcularArea());
			}
			
			else if (x instanceof Figura3D) {
				System.out.println("Area: " + String.format("%.2f",(((Figura3D) x).calcularArea())));
				System.out.println("Volume: " + String.format("%.2f",((Figura3D) x).calcularVolume()));
			}
		}
		
		sc.close();
	}

}
