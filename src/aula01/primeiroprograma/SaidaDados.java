package aula01.primeiroprograma;

public class SaidaDados {

	public static void main(String[] args) {

		String nome = "João da Silva";
		int idade = 30;
		double peso = 78.4;

		System.out.println(nome + " possui " + idade + " anos e " + peso + "kg.");
		System.out.print(nome + " possui " + idade + " anos e " + peso + "kg.\n");
		System.out.printf("%s possui %d anos e %f kg.", nome, idade, peso);
	}
}
