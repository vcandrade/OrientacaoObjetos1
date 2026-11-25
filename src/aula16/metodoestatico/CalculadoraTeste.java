package aula16.metodoestatico;

public class CalculadoraTeste {

	public static void main(String[] args) {
		
		Calculadora.somar(10, 5);
		Calculadora.subtrair(10, 5);
		Calculadora.multiplicar(10, 5);
		Calculadora.dividir(10, 5);
		
		double raiz = Math.sqrt(81);
		System.out.println("Raiz de 81: " + raiz);
	}
}
