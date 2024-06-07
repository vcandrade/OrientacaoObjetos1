package aula14.polimorfismo.coercao.tiposobjetos;

public class ImovelUsado extends Imovel {

	private double valorDesconto;

	public ImovelUsado(String endereco, double valorBase, double valorDesconto) {

		super(endereco, valorBase);
		this.valorDesconto = valorDesconto;
	}

	public void imprimirDados() {

		System.out.println("Enderero: " + this.endereco);
		System.out.println("Valor Base: " + this.valorBase);
		System.out.println("Valor Desconto: " + this.valorDesconto);
		System.out.println("Valor Total: R$" + this.calcularValorTotal());
	}

	private double calcularValorTotal() {

		return this.valorBase - this.valorDesconto;
	}
}
