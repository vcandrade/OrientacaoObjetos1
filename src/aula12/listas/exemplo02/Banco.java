package aula12.listas.exemplo02;

import java.util.ArrayList;
import java.util.List;

public class Banco {

	private int cnpj;
	private String nomeBanco;

	private List<ContaBancaria> listaContas;

	public Banco(int cnpj, String nomeBanco) {

		this.cnpj = cnpj;
		this.nomeBanco = nomeBanco;
		this.listaContas = new ArrayList<>();
	}

	public void adicionarNovaConta(int numeroConta, String nomeTitular) {

		if (this.verificarExistenciaConta(numeroConta)) {

			System.out.println("Conta " + numeroConta + " já existe.");
			return;
		}

		ContaBancaria cb = new ContaBancaria(numeroConta, nomeTitular);
		this.listaContas.add(cb);

		System.out.println("Conta " + numeroConta + " foi criada com sucesso.");

	}

	public boolean verificarExistenciaConta(int numeroConta) {

		for (ContaBancaria contaBancaria : this.listaContas) {

			if (contaBancaria.getNumero() == numeroConta) {

				return true;
			}
		}
		return false;
	}

	public void excluirConta(int numeroConta) {

		for (ContaBancaria contaBancaria : this.listaContas) {

			if (contaBancaria.getNumero() == numeroConta) {

				this.listaContas.remove(contaBancaria);
				System.out.println("Conta " + numeroConta + " removida com sucesso.");
				return;
			}
		}

		System.out.println("Conta " + numeroConta + " não encontrada.");
	}

	public void verificarSaldoConta(int numeroConta) {

		for (ContaBancaria contaBancaria : listaContas) {

			if (contaBancaria.getNumero() == numeroConta) {

				contaBancaria.imprimirSaldo();
				return;
			}
		}

		System.out.println("Conta " + numeroConta + " não encontrada.");
	}

	public void realizarSaqueConta(int numeroConta, double valor) {

		for (ContaBancaria contaBancaria : listaContas) {

			if (contaBancaria.getNumero() == numeroConta) {

				contaBancaria.sacar(valor);
				return;
			}
		}

		System.out.println("Conta " + numeroConta + " não encontrada.");
	}

	public void realizarDepositoConta(int numeroConta, double valor) {

		for (ContaBancaria contaBancaria : listaContas) {

			if (contaBancaria.getNumero() == numeroConta) {

				contaBancaria.depositar(valor);
				return;
			}
		}

		System.out.println("Conta " + numeroConta + " não encontrada.");
	}

	public void listarContas() {

		for (ContaBancaria contaBancaria : this.listaContas) {

			contaBancaria.imprimirSaldo();
		}
	}
}
