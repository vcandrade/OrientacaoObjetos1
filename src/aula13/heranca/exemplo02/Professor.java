package aula13.heranca.exemplo02;

public class Professor {

	protected int numeroRegistro;
	protected String nome;
	protected String dataNomeacao;
	protected double salario;
	
	public Professor(int numeroRegistro, String nome, String dataNomeacao, double salario) {
		
		this.numeroRegistro = numeroRegistro;
		this.nome = nome;
		this.dataNomeacao = dataNomeacao;
		this.salario = salario;
	}
	
	public void lancarFrequencia() {
		
		System.out.println(this.nome + " está lançando frequência.");
	}
	
	public void aplicarAvaliacao() {
		
		System.out.println(this.nome + " está aplicando avaliação.");
	}
	
	public void imprimirDadosProfessor() {
		
		System.out.println("Número Registro: " + this.numeroRegistro);
		System.out.println("Nome: " + this.nome);
		System.out.println("Data da Nomeação: " + this.dataNomeacao);
		System.out.println("Salário: R$" + this.salario);
	}
}
