package aula12.listas.exemplo01;

public class Pessoa {

	private String nome;
	private int idade;
	private double peso;
	
	public Pessoa(String nome, int idade, double peso) {
	
		this.nome = nome;
		this.idade = idade;
		this.peso = peso;
	}

	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}

	public double getPeso() {
		return peso;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + ", peso=" + peso + "]";
	}
}








