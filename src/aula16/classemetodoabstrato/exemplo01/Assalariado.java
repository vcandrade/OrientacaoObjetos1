package aula16.classemetodoabstrato.exemplo01;

public class Assalariado extends Funcionario {

	private double salarioAdicional;

	public Assalariado(String nome, String cpf, double salarioBase, double salarioAdicional) {

		super(nome, cpf, salarioBase);
		this.salarioAdicional = salarioAdicional;
	}

	@Override
	public void imprimirDados() {

		super.imprimirDados();

		System.out.println("Salário Adicional: R$" + this.salarioAdicional);
		System.out.println("Salário Total: R$" + this.calcularSalario());
	}

	@Override
	protected double calcularSalario() {

		return this.salarioBase + this.salarioAdicional;
	}
}
