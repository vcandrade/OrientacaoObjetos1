package aula06.metodoconstrutor;

public class PessoaTeste {

	public static void main(String[] args) {
		
		// instanciar objetos de Pessoa
		Pessoa pessoa1 = new Pessoa("João da Silva", 30, 78.9);
		Pessoa pessoa2 = new Pessoa("Maria de Oliveira", 123456);
		Pessoa pessoa3 = new Pessoa(987654);
		Pessoa pessoa4 = new Pessoa();
		
		// verificar os valores dos atributos de cada pessoa
		System.out.println(pessoa1);
		System.out.println(pessoa2);
		System.out.println(pessoa3);
		System.out.println(pessoa4);
	}
}
