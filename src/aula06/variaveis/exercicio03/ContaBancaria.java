package aula06.variaveis.exercicio03;

public class ContaBancaria {

	int numeroConta;
	String titularConta;
	double saldo;

	static int contatorContas = 1;

	public void inicializarConta(String titular, double s) {

		numeroConta = contatorContas;
		contatorContas++;

		titularConta = titular;
		saldo = s;
	}

	@Override
	public String toString() {
		return "ContaBancaria [numeroConta=" + numeroConta + ", titularConta=" + titularConta + ", saldo=" + saldo
				+ "]";
	}
}
