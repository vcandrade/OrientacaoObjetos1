package aula02.entradadados;

import java.util.Scanner;

public class EntradaDados {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Informe sua idade:");
		int idade = input.nextInt();

		input.nextLine(); // limpeza de buffer

		System.out.println("Informe seu nome:");
		String nome = input.nextLine();

		System.out.println("Informe seu peso:");
		double peso = input.nextDouble();

		System.out.println(nome + " possui " + idade + " anos e " + String.format("%.2f", peso) + "kg.");

		input.close();
	}
}
