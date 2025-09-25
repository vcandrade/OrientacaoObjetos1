package aula09.encapsulamentodados;

public class ContaBancaria {

	// atributos de instância
	private int numero;
	private String titular;
	private double saldo;

	// métodos construtores
	public ContaBancaria(int numero, String titular) {

		this.numero = numero;
		this.titular = titular;
		this.saldo = 0.00;
	}

	// demais métodos da classe
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
		System.out.println("Saldo: R$" + this.saldo);
		System.out.println("================================");
	}

	private void calcularRendimento() {

		double rendimento = this.saldo * 0.10;
		this.saldo += rendimento;
	}

	// método toString e métodos getters e setters
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "ContaBancaria [numero=" + numero + ", titular=" + titular + ", saldo=" + saldo + "]";
	}
}
