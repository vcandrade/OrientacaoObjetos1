package aula11.heranca.exercicio;

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

		super.imprimirDados();
		
		System.out.println("Curso: " + this.curso);
	}
}
