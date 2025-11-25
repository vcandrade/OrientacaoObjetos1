package aula16.classemetodoabstrato.exemplo01;

public class Comissionado extends Funcionario {

	private double totalVendas;
	private int taxaComissao;

	public Comissionado(String nome, String cpf, double salarioBase, double totalVendas, int taxaComissao) {

		super(nome, cpf, salarioBase);
		this.totalVendas = totalVendas;
		this.taxaComissao = taxaComissao;
	}

	@Override
	public void imprimirDados() {

		super.imprimirDados();
		System.out.println("Total de Vendas: R$" + this.totalVendas);
		System.out.println("Taxa de Comissão: " + this.taxaComissao + "%");
		System.out.println("Salário Total: R$" + this.calcularSalario());
		System.out.println("===============================");
	}

	@Override
	protected double calcularSalario() {

		return this.salarioBase + (this.totalVendas * this.taxaComissao / 100);
	}
}
