package aula06.variaveis.exemplo02.variaveisconstantes;

public class Circulo {

	double raio;

	// Atributo Constante (Imutável)
	final double PI = 3.14;
	
	public void calcularArea() {
		
		double area;
		area = PI * raio * raio;
		System.out.println("Área do Círculo: " + area + "cm²");
	}
}
