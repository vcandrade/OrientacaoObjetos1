package aula06.variaveis;

public class ContaTeste {

	public static void main(String[] args) {

		ContaBancaria cb1 = new ContaBancaria();
		ContaBancaria cb2 = new ContaBancaria();
		ContaBancaria cb3 = new ContaBancaria();
		
		cb1.criarConta();
		cb2.criarConta();
		cb3.criarConta();
		
		System.out.println("CB1: " + cb1.numeroConta);
		System.out.println("CB2: " + cb2.numeroConta);
		System.out.println("CB3: " + cb3.numeroConta);
	}
}
