package aula16.classemetodoabstrato.exemplo01;

public class Horista extends Funcionario {

	private double precoHora;
	private int horasTrabalhadas;

	public Horista(String nome, String cpf, double salarioBase, double precoHora, int horasTrabalhadas) {

		super(nome, cpf, salarioBase);
		this.precoHora = precoHora;
		this.horasTrabalhadas = horasTrabalhadas;
	}

	@Override
	public void imprimirDados() {

		super.imprimirDados();

		System.out.println("Horas Trabalhadas: " + this.horasTrabalhadas + " horas");
		System.out.println("Preço Recebido por Hora: R$" + this.precoHora);
		System.out.println("Salário Total: R$" + this.calcularSalario());
	}

	protected double calcularSalario() {

		return super.salarioBase + (this.precoHora * this.horasTrabalhadas);
	}
}
