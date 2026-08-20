package aula02.entradadados;

import java.util.Scanner;

public class EntradaDados {

	public static void main(String[] args) {

		Scanner entradaTeclado = new Scanner(System.in);

		System.out.println("Informe sua idade:");
		int idade = entradaTeclado.nextInt();

		entradaTeclado.nextLine(); // limpeza de buffer

		System.out.println("Informe seu nome:");
		String nome = entradaTeclado.nextLine();

		System.out.println("Informe seu peso:");
		double peso = entradaTeclado.nextDouble();

		System.out.println(nome + " possui " + idade + " anos e " + peso + "kg.");
	}
}
