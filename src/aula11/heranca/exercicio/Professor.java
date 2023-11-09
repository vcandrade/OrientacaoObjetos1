package aula11.heranca.exercicio;

public class Professor extends Pessoa {

	private double salarioBase;
	private double salarioTitulacao;

	public Professor(String nome, int idade, String logradouro, int numero, String bairro, String cidade, String unidadeFederativa, double salarioBase, double salarioTitulacao) {
		
		super(nome, idade, logradouro, numero, bairro, cidade, unidadeFederativa);
		
		this.salarioBase = salarioBase;
		this.salarioTitulacao = salarioTitulacao;
	}
	
	public double calcularSalario() {
		
		return this.salarioBase + this.salarioTitulacao;
	}
	
	public void imprimirDados() {
		
		super.imprimirDados();
		
		System.out.println("Salário: R$" + this.calcularSalario());
	}
}
