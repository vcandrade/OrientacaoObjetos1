package aula12.listas.exemplo02;

public class ContaBancariaTeste {

	public static void main(String[] args) {

		Banco banco1 = new Banco(123456, "UTFBank");

		banco1.adicionarNovaConta(111, "João da Silva");
		banco1.adicionarNovaConta(222, "Maria de Oliveira");
		banco1.adicionarNovaConta(333, "José Carvalho");

		banco1.listarContas();
	}
}
