package aula12.colecoes;

public class BancoTeste {

	public static void main(String[] args) {

		Banco banco1 = new Banco(123456, "UTF Bank");

		banco1.adicionarNovaConta(111, "João da Silva");
		banco1.adicionarNovaConta(222, "Maria de Oliveira");
		banco1.adicionarNovaConta(333, "Ricardo Carvalho");

		banco1.verificarSaldoConta(222);

		banco1.realizarDepositoConta(222, 100.00);
		banco1.verificarSaldoConta(222);
	}
}
