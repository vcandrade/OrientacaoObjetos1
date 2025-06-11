package aula16.classemetodoabstrato.exemplo01;

public abstract class Funcionario {

	protected String nome;
	protected String cpf;
	protected double salarioBase;

	public Funcionario(String nome, String cpf, double salarioBase) {

		this.nome = nome;
		this.cpf = cpf;
		this.salarioBase = salarioBase;
	}

	public void imprimirDados() {

		System.out.println("===================================");
		System.out.println("Nome: " + this.nome);
		System.out.println("CPF: " + this.cpf);
		System.out.println("Salário Base: R$" + this.salarioBase);
	}

	protected abstract double calcularSalario();
}
