package aula13.classeabstrata.exemplo01;

public class Assalariado extends Funcionario {

	private double salarioAdicional;

	public Assalariado(String nome, int cpf, double salarioBase, double salarioAdicional) {

		super(nome, cpf, salarioBase);
		this.salarioAdicional = salarioAdicional;
	}

	@Override
	public double calcularSalario() {

		return this.salarioBase + this.salarioAdicional;
	}
}
