package aula12.listas;

import java.util.ArrayList;
import java.util.List;

public class Banco {

	private int cnpj;
	private String nome;
	private List<ContaBancaria> listasContas;

	public Banco(int cnpj, String nome) {

		this.cnpj = cnpj;
		this.nome = nome;
		this.listasContas = new ArrayList<ContaBancaria>();
	}

	public void adicionarNovaConta(int numeroConta, String nomeTitular) {

		if (!this.verificarExistenciaConta(numeroConta)) {

			ContaBancaria conta = new ContaBancaria(numeroConta, nomeTitular);
			this.listasContas.add(conta);

			System.out.println("Conta " + numeroConta + " criada com sucesso.");

		} else {

			System.out.println("Conta " + numeroConta + " existente.");
		}

	}

	private boolean verificarExistenciaConta(int numeroConta) {

		for (ContaBancaria contaBancaria : listasContas) {

			if (contaBancaria.getNumeroConta() == numeroConta) {

				return true;
			}
		}

		return false;
	}

	public void excluirConta(int numeroConta) {

		for (ContaBancaria contaBancaria : listasContas) {

			if (contaBancaria.getNumeroConta() == numeroConta) {

				listasContas.remove(contaBancaria);
				System.out.println("Conta " + numeroConta + " removida com sucesso.");
				return;
			}
		}

		System.out.println("Conta inexistente.");
	}

	public void verificarSaldoConta(int numeroConta) {

		for (ContaBancaria contaBancaria : listasContas) {

			if (contaBancaria.getNumeroConta() == numeroConta) {

				contaBancaria.imprimirSaldo();
				return;
			}
		}

		System.out.println("Conta inexistente.");
	}

	public void realizarSaqueConta(int numeroConta, double valor) {

		for (ContaBancaria contaBancaria : listasContas) {

			if (contaBancaria.getNumeroConta() == numeroConta) {

				contaBancaria.sacar(valor);
				return;
			}
		}

		System.out.println("Conta " + numeroConta + " inexistente.");
	}

	public void realizarDepositoConta(int numeroConta, double valor) {

		for (ContaBancaria contaBancaria : listasContas) {

			if (contaBancaria.getNumeroConta() == numeroConta) {

				contaBancaria.depositar(valor);
				return;
			}
		}

		System.out.println("Conta " + numeroConta + " inexistente.");
	}

	public void listarContas() {

		for (ContaBancaria contaBancaria : listasContas) {

			contaBancaria.imprimirSaldo();
		}
	}
}
