package aula15.polimorfismo.sobreposicao.exemplo02;

public class ImovelNovo extends Imovel {

	private double valorAdicional;

	public ImovelNovo(String endereco, double valorBase, double valorAdicional) {

		super(endereco, valorBase);
		this.valorAdicional = valorAdicional;
	}

	public void imprimirDados() {

		super.imprimirDados();
		System.out.println("Valor Adicional: R$" + this.valorAdicional);
		System.out.println("Valor Total: R$" + this.calcularValorTotal());
	}

	protected double calcularValorTotal() {

		return this.valorBase + this.valorAdicional;
	}
}
