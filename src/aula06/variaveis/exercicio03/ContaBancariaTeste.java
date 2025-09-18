package aula06.variaveis.exercicio03;

public class ContaBancariaTeste {

	public static void main(String[] args) {
		
		ContaBancaria cb1 = new ContaBancaria();
		ContaBancaria cb2 = new ContaBancaria();
		ContaBancaria cb3 = new ContaBancaria();
		
		cb1.inicializarConta("João da Silva", 100.00);
		cb2.inicializarConta("Maria de Oliveira", 200.00);
		cb3.inicializarConta("Ricardo Carvalho", 300.00);
		
		System.out.println(cb1);
		System.out.println(cb2);
		System.out.println(cb3);
	}
}
