package aula06.metodoconstrutor;

public class Pessoa {

	// atributos de inst�ncia
	String nome;
	int idade;
	double peso;
	int cpf;
	
	// m�todo construtor da classe Pessoa
	public Pessoa(String nome, int idade, double peso, int cpf) {
		
		this.nome = nome;
		this.idade = idade;
		this.peso = peso;
		this.cpf = cpf;
	}
	
	public Pessoa(String nome, int idade, double peso) {
		
		this(nome, idade, peso, 0);
	}

	public Pessoa(String nome, int cpf) {
		
		this(nome, 0, 0.0, cpf);
	}
	
	public Pessoa(int cpf) {
		
		this(null, 0, 0.0, cpf);
	}
	
	public Pessoa() {
		
		this(null, 0, 0.0, 0);
	}
	
	// m�todos da classe Pessoa
	public void falar() {
		
		System.out.println(this.nome + " est� falando.");
	}
	
	public void correr() {
		
		System.out.println(this.nome + " est� correndo.");
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + ", peso=" + peso + ", cpf=" + cpf + "]";
	}
}
