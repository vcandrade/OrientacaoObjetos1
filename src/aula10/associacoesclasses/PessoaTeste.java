package aula10.associacoesclasses;

public class PessoaTeste {

	public static void main(String[] args) {

		Endereco endereco1 = new Endereco("Vicente Machado", 1024, "Centro", "Ponta Grossa", "PR");

		Pessoa pessoa1 = new Pessoa("João da Silva", "01/02/2003", "Masculino", "joao@email.com", "Casado", endereco1);
		pessoa1.imprimirDados();
	}
}
