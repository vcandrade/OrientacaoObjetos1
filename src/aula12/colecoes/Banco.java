package aula12.colecoes;

import java.util.ArrayList;
import java.util.List;

public class Banco {

	private String cnpj;
	private String nomeBanco;
	private List<ContaBancaria> contas;

	public Banco(String cnpj, String nome) {

		this.cnpj = cnpj;
		this.nomeBanco = nome;
		this.contas = new ArrayList<ContaBancaria>();
	}

	public void criarNovaConta(int numeroConta, String nomeTitular) {

		ContaBancaria contaBancaria = new ContaBancaria(numeroConta, nomeTitular);
		this.contas.add(contaBancaria);

		System.out.println("Conta " + numeroConta + " criada com sucesso.");
	}

	public void excluirConta(int numeroConta) {

		for (ContaBancaria contaBancaria : contas) {

			if (contaBancaria.getNumeroConta() == numeroConta) {

				contas.remove(contaBancaria);
				return;
			}
		}

		System.out.println("Conta inexistente.");
	}

	public void verificarSaldo(int numeroConta) {

		for (ContaBancaria contaBancaria : contas) {

			if (contaBancaria.getNumeroConta() == numeroConta) {

				contaBancaria.imprimirSaldo();
				return;
			}
		}

		System.out.println("Conta inexistente.");
	}

	public void depositarConta(int numeroConta, double valor) {

		for (ContaBancaria contaBancaria : contas) {

			if (contaBancaria.getNumeroConta() == numeroConta) {

				contaBancaria.depositar(valor);
				return;
			}
		}

		System.out.println("Conta inexistente.");
	}

	public void sacarConta(int numeroConta, double valor) {

		for (ContaBancaria contaBancaria : contas) {

			if (contaBancaria.getNumeroConta() == numeroConta) {

				contaBancaria.sacar(valor);
				return;
			}
		}

		System.out.println("Conta inexistente.");
	}

	public void listarTodasContas() {

		for (ContaBancaria contaBancaria : contas) {

			contaBancaria.imprimirSaldo();
		}
	}
}
