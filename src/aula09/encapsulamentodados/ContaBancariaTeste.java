package aula09.encapsulamentodados;

public class ContaBancariaTeste {

	public static void main(String[] args) {

		ContaBancaria contaBancaria1 = new ContaBancaria(111, "João da Silva");

		contaBancaria1.imprimirSaldo();

		contaBancaria1.depositar(100.00);
		contaBancaria1.imprimirSaldo();

		contaBancaria1.sacar(60.00);
		contaBancaria1.imprimirSaldo();

		contaBancaria1.setTitular("José Carvalho");

		System.out.println(contaBancaria1.getNumero());
		System.out.println(contaBancaria1.getTitular());
	}
}
