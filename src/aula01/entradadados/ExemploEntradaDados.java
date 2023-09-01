package aula01.entradadados;

import java.util.Scanner;

public class ExemploEntradaDados {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Informe seu nome:");
		String nome = input.nextLine();

		System.out.println("Informe o período:");
		int periodo = input.nextInt();

		// limpeza de buffer
		input.nextLine();

		System.out.println("Informe a situação do aluno:");
		String situacao = input.nextLine();

		System.out.println("Informe seu coeficiente:");
		double coeficiente = input.nextDouble();

		System.out.println("Aluno: " + nome);
		System.out.println("Período: " + periodo);
		System.out.println("Situação: " + situacao);
		System.out.println("Coeficiente: " + coeficiente);
	}
}
