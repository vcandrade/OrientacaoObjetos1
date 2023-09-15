package aula08.encapsulamentodados;

public class ContaBancariaTeste {

	public static void main(String[] args) {

		ContaBancaria cb1 = new ContaBancaria(111, "João da Silva");

		cb1.setNomeTitular("Maria de Oliveira");

		System.out.println("Número Conta: " + cb1.getNumeroConta());
		System.out.println("Nome Titular: " + cb1.getNomeTitular());
		
		cb1.depositar(100.00);
		cb1.emitirSaldo();
		
		cb1.sacar(50.00);
		cb1.emitirSaldo();
	}
}
