package aula12.listas;

public class ContaBancariaTeste {

	public static void main(String[] args) {

		Banco banco1 = new Banco(123456, "New Bank");

		banco1.adicionarNovaConta(111, "João da Silva");
		banco1.adicionarNovaConta(222, "Maria de Oliveira");
		banco1.adicionarNovaConta(333, "Ricardo Carvalho");
		banco1.adicionarNovaConta(444, "Amanda Lima");

		banco1.listarContas();
		
		banco1.realizarDepositoConta(333, 1000.00);
		banco1.verificarSaldoConta(333);
		
		banco1.realizarSaqueConta(333, 1000.00);
		banco1.verificarSaldoConta(333);
		
		banco1.excluirConta(333);
		banco1.listarContas();
	}
}
