package aula11.heranca.exercicio;

public class Pessoa {

	protected String nome;
	protected int idade;
	protected Endereco endereco;
	
	public Pessoa(String nome, 
			      int idade, 
			      String logradouro, 
			      int numero, 
			      String bairro, 
			      String cidade, 
			      String unidadeFederativa) {
		
		this.nome = nome;
		this.idade = idade;
		this.endereco = new Endereco(logradouro, numero, bairro, cidade, unidadeFederativa);
	}
	
	public void imprimirDados() {
		
		System.out.println("Nome: " + this.nome);
		System.out.println("Idade: " + this.idade);
		System.out.println("Logradouro: " + this.endereco.getLogradouro());
		System.out.println("Número: " + this.endereco.getNumero());
		System.out.println("Bairro: " + this.endereco.getBairro());
		System.out.println("Cidade: " + this.endereco.getCidade());
		System.out.println("UF: " + this.endereco.getUnidadeFederativa());
	}
}
