package aula16.classemetodoabstrato.exemplo01;

public class Assalariado extends Funcionario {

	private double adicional;

	public Assalariado(String nome, String cpf, double salarioBase, double adicional) {

		super(nome, cpf, salarioBase);
		this.adicional = adicional;
	}

	@Override
	public void imprimirDados() {

		super.imprimirDados();
		System.out.println("Salário Adicional: R$" + this.adicional);
		System.out.println("Salário Total: R$" + this.calcularSalario());
		System.out.println("===============================");
	}

	@Override
	protected double calcularSalario() {

		return this.salarioBase + this.adicional;
	}
}
