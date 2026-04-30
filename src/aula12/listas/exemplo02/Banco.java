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

	public void listarContas() {

		for (ContaBancaria contaBancaria : this.listaContas) {

			contaBancaria.imprimirSaldo();
		}
	}
}
