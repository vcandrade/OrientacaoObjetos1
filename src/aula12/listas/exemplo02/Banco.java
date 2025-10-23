package aula12.listas.exemplo02;

import java.util.ArrayList;
import java.util.List;

public class Banco {

	private int cnpj;
	private String nome;
	private List<ContaBancaria> listaContas;

	public Banco(int cnpj, String nome) {

		this.cnpj = cnpj;
		this.nome = nome;
		this.listaContas = new ArrayList<>();
	}

	public void adicionarNovaConta(int numeroConta, String nomeTitular) {

		ContaBancaria conta = this.verificarExistenciaConta(numeroConta);

		if (conta == null) {

			ContaBancaria contaBancaria = new ContaBancaria(numeroConta, nomeTitular);
			this.listaContas.add(contaBancaria);

			System.out.println("Conta " + numeroConta + " criada com sucesso.");

		} else {

			System.out.println("A Conta " + numeroConta + " já existe.");
		}

	}

	public ContaBancaria verificarExistenciaConta(int numeroConta) {

		for (ContaBancaria conta : this.listaContas) {

			if (conta.getNumero() == numeroConta) {

				return conta;
			}
		}

		return null;
	}

	public void excluirConta(int numeroConta) {

		ContaBancaria conta = this.verificarExistenciaConta(numeroConta);

		if (conta != null) {

			this.listaContas.remove(conta);
			System.out.println("Conta " + numeroConta + " removida com sucesso.");

		} else {

			System.out.println("Conta " + numeroConta + " não encontrada.");
		}
	}

	public void verificarSaldoConta(int numeroConta) {

		ContaBancaria conta = this.verificarExistenciaConta(numeroConta);

		if (conta != null) {

			System.out.println("================================");
			System.out.println("CNPJ: " + this.cnpj + " - " + this.nome);
			conta.imprimirSaldo();

		} else {

			System.out.println("Conta " + numeroConta + " não encontrada.");
		}
	}

	public void depositar(int numeroConta, double valor) {

		ContaBancaria conta = this.verificarExistenciaConta(numeroConta);

		if (conta != null) {

			conta.depositar(valor);

		} else {

			System.out.println("Conta " + numeroConta + " não encontrada.");
		}
	}

	public void realizarSaqueConta(int numeroConta, double valor) {

		ContaBancaria conta = this.verificarExistenciaConta(numeroConta);

		if (conta != null) {

			conta.sacar(valor);

		} else {

			System.out.println("Conta " + numeroConta + " não encontrada.");
		}
	}
}
