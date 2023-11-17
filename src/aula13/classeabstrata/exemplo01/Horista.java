package aula13.classeabstrata.exemplo01;

public class Horista extends Funcionario {

	private double precoHora;
	private int horasTrabalhadas;

	public Horista(String nome, int cpf, double salarioBase, double precoHora, int horasTrabalhadas) {

		super(nome, cpf, salarioBase);
		this.precoHora = precoHora;
		this.horasTrabalhadas = horasTrabalhadas;
	}

	@Override
	public double calcularSalario() {

		return this.salarioBase + (this.precoHora * this.horasTrabalhadas);
	}
}
