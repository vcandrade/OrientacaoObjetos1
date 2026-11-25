package aula16.metodoestatico;

public class Calculadora {

	public static void somar(double a, double b) {

		double resultado = a + b;

		System.out.println(a + " + " + b + " = " + resultado);
	}

	public static void subtrair(double a, double b) {

		double resultado = a - b;

		System.out.println(a + " - " + b + " = " + resultado);
	}

	public static void multiplicar(double a, double b) {

		double resultado = a * b;

		System.out.println(a + " * " + b + " = " + resultado);
	}

	public static void dividir(double a, double b) {

		double resultado = a / b;

		System.out.println(a + " / " + b + " = " + resultado);
	}
}
