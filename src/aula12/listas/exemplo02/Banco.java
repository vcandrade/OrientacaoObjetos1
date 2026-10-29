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

		for (ContaBancaria cb : listaContas) {

			if (cb.getNumero() == numeroConta) {

				return true;
			}
		}
		return false;
	}

	public void excluirConta(int numero) {

		for (ContaBancaria cb : listaContas) {
			
			if (cb.getNumero() == numero) {
				
				this.listaContas.remove(cb);
				System.out.println("Conta " + numero + " foi removida.");
				return;
			}
		}
		
		System.out.println("Conta " + numero + " não encontrada.");

//		for (int i = 0; i < this.listaContas.size(); i++) {
//			ContaBancaria cb = this.listaContas.get(i);
//
//			if (cb.getNumero() == numero) {
//
//				this.listaContas.remove(cb);
//				System.out.println("Conta " + numero + " foi removida.");
//				return;
//			}
//		}
//
//		System.out.println("Conta " + numero + " não encontrada.");
	}
	
	public void verificarSaldoConta(int numero) {
		
		for (ContaBancaria cb : this.listaContas) {
			
			if (cb.getNumero() == numero) {
				
				cb.imprimirSaldo();
				return;
			}
		}
		System.out.println("Conta " + numero + " não encontrada.");
	}
	
	public void realizarDepositoConta(int numero, double valor) {
		
		for (ContaBancaria cb : listaContas) {
			
			if (cb.getNumero() == numero) {
				
				cb.depositar(valor);
				return;
			}
		}
		
		System.out.println("Conta " + numero + " não encontrada.");
	}
	
	public void realizarSaqueConta(int numero, double valor) {
		
		for (ContaBancaria cb: listaContas) {
			
			if (cb.getNumero() == numero) {
				
				cb.sacar(valor);
				return;
			}
		}
		
		System.out.println("Conta " + numero + " não encontrada.");
	}

	public void exibirContas() {

		System.out.println("CONTAS CADASTRADAS");

		for (ContaBancaria contaBancaria : listaContas) {

			System.out.println(contaBancaria.getNumero() + " - " + contaBancaria.getTitular());
		}
	}
}
