package aula02.entradadados;

public class OperadorTernario {

	public static void main(String[] args) {

		int valor = 10;

		String resultado = (valor % 2 == 0) ? "Valor é par" : "Valor é ímpar";

//		if (valor % 2 == 0) {		
//			resultado = "Valor é par";
//		} else {
//			resultado = "Valor é ímpar";
//		}

		System.out.println(resultado);
	}
}
