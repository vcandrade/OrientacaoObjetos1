package aula13.classeabstrata.exemplo01;

public class Comissionado extends Funcionario {

	private double totalVendas;
	private double taxaComissao;

	public Comissionado(String nome, int cpf, double salarioBase, double totalVendas, double taxaComissao) {

		super(nome, cpf, salarioBase);
		this.totalVendas = totalVendas;
		this.taxaComissao = taxaComissao;
	}

	@Override
	public double calcularSalario() {

		return this.salarioBase + (this.totalVendas * this.taxaComissao);
	}
}
