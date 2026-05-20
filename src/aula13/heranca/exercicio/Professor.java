package aula13.heranca.exercicio;

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
		
		System.out.println("Nome: " + this.nome);
		System.out.println("Idade: " + this.idade);
		System.out.println("Salário: R$" + this.calcularSalario());
		System.out.println("Logradouro: " + this.endereco.getLogradouro());
		System.out.println("Número: " + this.endereco.getNumero());
		System.out.println("Bairro: " + this.endereco.getBairro());
		System.out.println("Cidade: " + this.endereco.getCidade());
		System.out.println("UF: " + this.endereco.getUnidadeFederativa());
	}
}
