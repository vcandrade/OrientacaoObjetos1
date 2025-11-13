package aula13.heranca.exercicio;

public class Aluno extends Pessoa {

	private String curso;

	public Aluno(String nome, int idade, String logradouro, int numero, String bairro, String cidade, String unidadeFederativa) {

		super(nome, idade, logradouro, numero, bairro, cidade, unidadeFederativa);
	}

	public void realizarMatricula(String curso) {

		this.curso = curso;
		System.out.println("Matrícula realizada com sucesso.");
	}

	public void imprimirDados() {

		System.out.println("Nome: " + this.nome);
		System.out.println("Idade: " + this.idade);
		System.out.println("Curso: " + this.curso);
		System.out.println("Logradouro: " + this.endereco.getLogradouro());
		System.out.println("Número: " + this.endereco.getNumero());
		System.out.println("Bairro: " + this.endereco.getBairro());
		System.out.println("Cidade: " + this.endereco.getCidade());
		System.out.println("UF: " + this.endereco.getUnidadeFederativa());
	}
}
