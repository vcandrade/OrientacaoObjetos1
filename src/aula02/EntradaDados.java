package aula02;

import java.util.Scanner;

public class EntradaDados {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Informe seu nome:");
		String nome = input.nextLine();

		System.out.println("Informe sua idade:");
		int idade = input.nextInt();

		input.nextLine(); // limpeza de buffer

		System.out.println("Informe seu estado civil:");
		String estadoCivil = input.nextLine();

		System.out.println("Informe seu peso:");
		double peso = input.nextDouble();

		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Estado Civil: " + estadoCivil);
		System.out.println("Peso: " + String.format("%.2f", peso));
	}
}
