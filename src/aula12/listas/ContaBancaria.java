package aula12.listas;

public class ContaBancaria {

	private int numeroConta;
	private String nomeTitular;
	private double saldo;

	public ContaBancaria(int numeroConta, String nomeTitular) {

		this.numeroConta = numeroConta;
		this.nomeTitular = nomeTitular;
		this.saldo = 0.00;
	}

	public void sacar(double valor) {

		if (this.saldo >= valor) {

			this.saldo -= valor;
			System.out.println("Saque de R$" + valor + " realizado com sucesso.");

		} else {

			System.out.println("Saldo insuficiente.");
		}
	}

	public void depositar(double valor) {

		this.saldo += valor;
		System.out.println("Depósito de R$" + valor + " realizado com sucesso.");

		this.calcularRendimento();
	}

	public void imprimirSaldo() {

		System.out.println("====================================");
		System.out.println("Número da Conta: " + this.numeroConta);
		System.out.println("Nome do Titular: " + this.nomeTitular);
		System.out.println("Saldo: R$" + this.saldo);
		System.out.println("====================================");
	}

	private void calcularRendimento() {

		this.saldo *= 1.10;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {

		if (!nomeTitular.equals("")) {

			this.nomeTitular = nomeTitular;
		}
	}
}
