package aula09.encapsulamentodados;

public class ContaBancaria {

	private int numeroConta;
	private String titular;
	private double saldo;

	public ContaBancaria(int numeroConta, String titular) {

		this.numeroConta = numeroConta;
		this.titular = titular;
		this.saldo = 0.00;
	}

	public void sacar(double valor) {

		if (valor <= this.saldo) {

			this.saldo -= valor;
			System.out.println("Saque realizado com sucesso.");
		
		} else {
		
			System.out.println("Saldo insuficiente.");
		}
	}

	public void depositar(double valor) {

		this.saldo += valor;
		System.out.println("Depósito realizado com sucesso.");

		this.calcularRendimento();
	}

	public void imprimirSaldo() {

		System.out.println("======================");
		System.out.println("Número da Conta: " + this.numeroConta);
		System.out.println("Nome do Titular: " + this.titular);
		System.out.println("Saldo: R$" + this.saldo);
		System.out.println("======================");
	}

	private void calcularRendimento() {

		this.saldo *= 1.10;
	}

	public int getNumeroConta() {
		return numeroConta;
	}
	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {

		if (!titular.equals("")) {

			this.titular = titular;
		}
	}
}
