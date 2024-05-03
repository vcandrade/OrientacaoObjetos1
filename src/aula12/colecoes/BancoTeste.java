package aula12.colecoes;

public class BancoTeste {

	public static void main(String[] args) {

		Banco banco1 = new Banco("123456", "NewBank");

		banco1.criarNovaConta(111, "João da Silva");
		banco1.criarNovaConta(222, "Maria de Oliveira");
		banco1.criarNovaConta(333, "Ricardo Carvalho");
		banco1.criarNovaConta(444, "Gustavo Almeida");

		banco1.verificarSaldo(333);
		
		banco1.depositarConta(333, 500.00);
		banco1.verificarSaldo(333);
		
		banco1.sacarConta(333, 450.00);
		banco1.verificarSaldo(333);
	}
}
