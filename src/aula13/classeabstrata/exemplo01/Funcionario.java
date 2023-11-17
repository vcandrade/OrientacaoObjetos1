package aula13.classeabstrata.exemplo01;

public abstract class Funcionario {

	protected String nome;
	protected int cpf;
	protected double salarioBase;

	public Funcionario(String nome, int cpf, double salarioBase) {

		this.nome = nome;
		this.cpf = cpf;
		this.salarioBase = salarioBase;
	}

	public abstract double calcularSalario();

	public void imprimirDados() {

		System.out.println("CPF: " + this.cpf);
		System.out.println("Nome: " + this.nome);
		System.out.println("Salário Base: R$" + this.salarioBase);
	}
}
