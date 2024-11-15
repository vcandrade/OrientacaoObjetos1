package aula10.associacoesclasses;

public class Pessoa {

	private String nome;
	private String dataNascimento;
	private String sexo;
	private String email;
	private Endereco endereco;

	public Pessoa(String nome, String dataNascimento, String sexo, String email, Endereco endereco) {

		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.sexo = sexo;
		this.email = email;
		this.endereco = endereco;
	}

	public Pessoa(String nome, String dataNascimento, String sexo, String email, String logradouro, int numero, String bairro, String cidade, String uf) {

		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.sexo = sexo;
		this.email = email;
		this.endereco = new Endereco(logradouro, numero, bairro, cidade, uf);
	}

	public void imprimirDados() {

		System.out.println("Nome: " + this.nome);
		System.out.println("Data de Nascimento: " + this.dataNascimento);
		System.out.println("Sexo: " + this.sexo);
		System.out.println("E-mail: " + this.email);
		System.out.println("Logradouro: " + this.endereco.getLogradouro());
		System.out.println("Número: " + this.endereco.getNumero());
		System.out.println("Bairro: " + this.endereco.getBairro());
		System.out.println("Cidade: " + this.endereco.getCidade());
		System.out.println("UF: " + this.endereco.getUf());
	}
}
