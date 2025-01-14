package aula16.classemetodoabstrato.exemplo01;

public class Assalariado extends Funcionario {

	private double adicional;

	public Assalariado(String nome, int cpf, double salarioBase, double adicional) {

		super(nome, cpf, salarioBase);
		this.adicional = adicional;
	}

	public void imprimirDados() {

		super.imprimirDados();

		System.out.println("Adicional: R$" + this.adicional);
		System.out.println("Salário Total: R$" + this.calcularSalario());
		System.out.println("===============================");
	}

	protected double calcularSalario() {

		return this.salarioBase + this.adicional;
	}
}
