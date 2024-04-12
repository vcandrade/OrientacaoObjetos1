package aula09.encapsulamentodados;

public class ContaBancariaTeste {

	public static void main(String[] args) {

		ContaBancaria cb1 = new ContaBancaria(111, "João da Silva");
		cb1.imprimirSaldo();

		cb1.depositar(500.00);
		cb1.imprimirSaldo();
		
		cb1.sacar(300.00);
		cb1.imprimirSaldo();

		cb1.setTitular("Maria de Oliveira");
		System.out.println(cb1.getTitular());
		
		cb1.imprimirSaldo();
	}
}
