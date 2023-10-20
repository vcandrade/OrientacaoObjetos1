package aula10.collections;

public class ContaBancaria {

	private int numeroConta;
	private String nomeTitular;
	private double saldo;

	public ContaBancaria(int numeroConta, String nomeTitular) {

		this.numeroConta = numeroConta;
		this.nomeTitular = nomeTitular;
		this.saldo = 0.00;
	}

	public void depositar(double valor) {

		this.saldo += valor;
		System.out.println("Depósito realizado com sucesso.");

		this.aplicarRendimento();
	}

	public void emitirSaldo() {

		System.out.println("====================================");
		System.out.println("Número da Conta: " + this.numeroConta);
		System.out.println("Nome do Titular: " + this.nomeTitular);
		System.out.println("Saldo: R$" + String.format("%.2f", this.saldo));
		System.out.println("====================================");
	}

	public void sacar(double valor) {

		if (valor <= this.saldo) {

			this.saldo -= valor;
			System.out.println("Saque realizado com sucesso.");

		} else {

			System.out.println("Saldo insuficiente.");
		}
	}

	private void aplicarRendimento() {

		this.saldo *= 1.10;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public int getNumeroConta() {
		return numeroConta;
	}
}
