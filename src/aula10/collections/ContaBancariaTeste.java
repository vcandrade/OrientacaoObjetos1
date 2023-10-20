package aula10.collections;

import java.util.ArrayList;
import java.util.List;

public class ContaBancariaTeste {

	public static void main(String[] args) {
		
		Banco banco1 = new Banco(123456, "NewBank");

		banco1.criarNovaConta(111, "João da Silva");
		banco1.criarNovaConta(222, "Maria de Oliveira");
		banco1.criarNovaConta(333, "Ricardo Carvalho");
		
		banco1.depositar(222, 100.00);
		banco1.emitirSaldo(222);
		
		banco1.sacar(222, 110.00);
		banco1.emitirSaldo(222);

		banco1.removerConta(222);

		banco1.emitirSaldo(222);
	}
}
