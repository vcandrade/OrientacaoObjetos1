package aula01.saidadados;

public class SaidaDados {

	public static void main(String[] args) {

		String nome = "João da Silva";
		int idade = 30;
		double peso = 75.8;

		System.out.println(nome + " possui " + idade + " anos e " + peso + "kg.");
		System.out.printf("%s possui %d anos e %.2f kg.", nome, idade, peso);
	}
}
