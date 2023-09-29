package aula09.associacaoclasse;

public class PessoaTeste {

	public static void main(String[] args) {

		Endereco end1 = new Endereco("Vicente Machado", 1024, "Centro", "Ponta Grossa", "PR");
		Pessoa p1 = new Pessoa("João da Silva", "01/02/2010", "Masculino", "joao@email.com", "Solteiro", end1);
		p1.imprimirDados();

		Pessoa p2 = new Pessoa("Maria de Oliveira", "10/10/2005", "Feminino", "maria@email.com", "Casada", "Monteiro Lobato", 2048, "Jd. Carvalho", "Ponta Grossa", "PR");
		p2.imprimirDados();
	}
}
