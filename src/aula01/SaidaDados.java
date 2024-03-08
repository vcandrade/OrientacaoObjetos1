package aula01;

public class SaidaDados {

	public static void main(String[] args) {

		String nome = "João da Silva";
		int idade = 28;
		double peso = 78.6;

		// PRINTLN
		System.out.println(nome + " possui " + idade + " anos e " + peso + "Kg.");

		// PRINT
		System.out.print(nome + " possui " + idade + " anos e " + peso + "Kg.\n");

		// PRINTF
		System.out.printf("%s possui %d anos e %.2f kg.", nome, idade, peso);
	}
}
