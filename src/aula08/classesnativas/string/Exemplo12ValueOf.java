package aula08.classesnativas.string;

public class Exemplo12ValueOf {

	public static void main(String[] args) {

		int numeroInteiro = 10;
		double numeroDouble = 50.0;
		boolean variavelBooleana = true;

		String inteiroConvertido = String.valueOf(numeroInteiro);
		String doubleConvertido = String.valueOf(numeroDouble);
		String booleanaConvertida = String.valueOf(variavelBooleana);

		System.out.println(inteiroConvertido);
		System.out.println(doubleConvertido);
		System.out.println(booleanaConvertida);
	}
}
