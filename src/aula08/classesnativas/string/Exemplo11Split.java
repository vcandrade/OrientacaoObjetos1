package aula08.classesnativas.string;

public class Exemplo11Split {

	public static void main(String[] args) {

		String universidade = "Universidade Tecnológica Federal do Paraná";

		String[] stringDividida = universidade.split(" ");

		System.out.println("[0] = " + stringDividida[0]);
		System.out.println("[1] = " + stringDividida[1]);
		System.out.println("[2] = " + stringDividida[2]);
		System.out.println("[3] = " + stringDividida[3]);
		System.out.println("[4] = " + stringDividida[4]);
	}
}
