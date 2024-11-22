package aula12.colecoes;

public class BancoTeste {

	public static void main(String[] args) {

		Banco banco1 = new Banco(987654, "UTF Bank");

		banco1.adicionarNovaConta(111, "João da Silva");
		banco1.adicionarNovaConta(222, "Maria de Oliveira");
		banco1.adicionarNovaConta(333, "Ricardo Carvalho");

		banco1.listarContas();

		banco1.realizarSaque(222, 60.00);
		banco1.listarContas();

		banco1.realizarDeposito(333, 500.00);
		banco1.listarContas();
	}
}
