package aula06.variaveis.exemplo01.variaveisinstancia;

public class PessoaTeste {

	public static void main(String[] args) {
		
		Pessoa pessoa1 = new Pessoa();
		Pessoa pessoa2 = new Pessoa();
		Pessoa pessoa3 = new Pessoa();
		
		pessoa1.nome = "João da Silva";
		pessoa1.idade = 30;
		pessoa1.peso = 75.4;
		
		pessoa2.nome = "Maria de Oliveira";
		pessoa2.idade = 25;
		pessoa2.peso = 61.7;
		
		pessoa3.nome = "Ricardo Carvalho";
		pessoa3.idade = 28;
		pessoa3.peso = 69.9;
		
		pessoa1.imprimirDados();
		pessoa2.imprimirDados();
		pessoa3.imprimirDados();
	}
}
