package aula16.classemetodoabstrato.exemplo01;

public class Comissionado extends Funcionario {

	private double totalVendas;
	private double taxaComissao;

	public Comissionado(String nome, int cpf, double salarioBase, double totalVendas, double taxaComissao) {

		super(nome, cpf, salarioBase);
		this.totalVendas = totalVendas;
		this.taxaComissao = taxaComissao;
	}

	public void imprimirDados() {

		super.imprimirDados();

		System.out.println("Total de Vendas: R$" + this.totalVendas);
		System.out.println("Taxa de Comissão: " + this.taxaComissao);
		System.out.println("Salário Total: R$" + this.calcularSalario());
		System.out.println("===============================");
	}

	protected double calcularSalario() {

		return this.salarioBase + (this.totalVendas * this.taxaComissao);
	}
}
