package aula09.encapsulamentodados;

public class ContaBancariaTeste {

	public static void main(String[] args) {

		ContaBancaria conta1 = new ContaBancaria(111, "João da Silva");
		
		conta1.imprimirSaldo();
		
		conta1.depositar(1000.00);
		conta1.imprimirSaldo();
		
		conta1.sacar(200.00);
		conta1.imprimirSaldo();

		conta1.setNomeTitular("");

		System.out.println(conta1.getNumeroConta());
		System.out.println(conta1.getNomeTitular());
	}
}
