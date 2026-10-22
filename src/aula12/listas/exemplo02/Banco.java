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

		this.listaContas = new ArrayList<ContaBancaria>();
	}

	public void adicionarNovaConta(int numero, String nomeTitular) {

		if (this.verificarExistenciaConta(numero)) {

			System.out.println("Conta " + numero + " existente.");
			return;
		}
		
		ContaBancaria cb = new ContaBancaria(numero, nomeTitular);
		this.listaContas.add(cb);

		System.out.println("Conta " + numero + " criada com sucesso.");
	}

	private boolean verificarExistenciaConta(int numeroConta) {

		for (ContaBancaria contaBancaria : listaContas) {

			if (contaBancaria.getNumero() == numeroConta) {

				return true;
			}
		}
		return false;
	}

	public void exibirContas() {

		for (ContaBancaria contaBancaria : listaContas) {

			System.out.println(contaBancaria.getNumero() + " - " + contaBancaria.getTitular());
		}
	}
}
