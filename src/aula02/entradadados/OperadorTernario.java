package aula02.entradadados;

import java.util.Scanner;

public class OperadorTernario {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Informe um valor inteiro:");
		int valor = input.nextInt();

		String resultado = (valor % 2 == 0) ? "Valor par" : "Valor ímpar";

		System.out.println(resultado);

	}
}
