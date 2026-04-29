package aula09.encapsulamentodados;

public class ContaBancaria {

	private int numero;
	private String titular;
	private double saldo;

	public ContaBancaria(int numero, String titular) {

		this.numero = numero;
		this.titular = titular;
		this.saldo = 0.00;
	}

	public void sacar(double valor) {

		if (this.saldo >= valor) {

			this.saldo -= valor;
			System.out.println("Saque realizado com sucesso.");

		} else {

			System.out.println("Saldo insuficiente.");
		}
	}

	public void depositar(double valor) {

		this.saldo += valor;
		System.out.println("Depósito realizado com sucesso.");

		this.calcularRendimentos();
	}

	public void imprimirSaldo() {

		System.out.println("===============================");
		System.out.println("Número da Conta: " + this.numero);
		System.out.println("Nome do Titular: " + this.titular);
		System.out.println("Saldo: R$" + this.saldo);
	}

	private void calcularRendimentos() {

		double rendimento = this.saldo * 0.10;
		this.saldo += rendimento;
	}

	public int getNumero() {
		return this.numero;
	}

	public String getTitular() {
		return this.titular;
	}

	public void setTitular(String titular) {

		if (!titular.equals("")) {

			this.titular = titular;
		}
	}
}
