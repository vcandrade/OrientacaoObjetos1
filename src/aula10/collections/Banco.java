package aula10.collections;

import java.util.ArrayList;
import java.util.List;

public class Banco {

	private int cnpj;
	private String nomeBanco;
	private List<ContaBancaria> contas;

	public Banco(int cnpj, String nomeBanco) {

		this.cnpj = cnpj;
		this.nomeBanco = nomeBanco;
		this.contas = new ArrayList<ContaBancaria>();
	}

	public void criarNovaConta(int numeroConta, String nomeTitular) {

		ContaBancaria cb = new ContaBancaria(numeroConta, nomeTitular);
		this.contas.add(cb);

		System.out.println("Conta criada com sucesso.");
	}

	public void removerConta(int numeroConta) {

		for (ContaBancaria contaBancaria : contas) {

			if (contaBancaria.getNumeroConta() == numeroConta) {

				this.contas.remove(contaBancaria);
				System.out.println("Conta " + numeroConta + " removida com sucesso.");

				return;
			}
		}

		System.out.println("Conta não encontrada.");
	}

	public void emitirSaldo(int numeroConta) {

		for (ContaBancaria contaBancaria : contas) {

			if (contaBancaria.getNumeroConta() == numeroConta) {

				contaBancaria.emitirSaldo();
				return;

			}
		}

		System.out.println("Conta não encontrada.");
	}

	public void depositar(int numeroConta, double valor) {

		for (ContaBancaria contaBancaria : contas) {

			if (contaBancaria.getNumeroConta() == numeroConta) {

				contaBancaria.depositar(valor);
				return;
			}
		}

		System.out.println("Conta não encontrada.");
	}

	public void sacar(int numeroConta, double valor) {

		for (ContaBancaria contaBancaria : contas) {

			if (contaBancaria.getNumeroConta() == numeroConta) {

				contaBancaria.sacar(valor);
				return;
			}
		}

		System.out.println("Conta não encontrada.");
	}
}
