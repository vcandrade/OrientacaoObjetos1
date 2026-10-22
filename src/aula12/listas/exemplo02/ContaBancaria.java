package aula12.listas.exemplo02;

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

		System.out.println("================================");
		System.out.println("Número da Conta: " + this.numero);
		System.out.println("Nome do Titular: " + this.titular);
		System.out.println("Saldo: R$" + String.format("%.2f", this.saldo));
		System.out.println("================================");
	}

	private void calcularRendimento() {

		double rendimento = this.saldo * 0.10;
		this.saldo += rendimento;
	}

	// métodos de acesso getters e setters
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
