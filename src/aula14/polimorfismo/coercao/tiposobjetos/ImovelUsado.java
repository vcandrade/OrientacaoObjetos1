package aula14.polimorfismo.coercao.tiposobjetos;

public class ImovelUsado extends Imovel {

	private double valorDesconto;

	public ImovelUsado(String endereco, double valorBase, double valorDesconto) {

		super(endereco, valorBase);
		this.valorDesconto = valorDesconto;
	}

	public void imprimirDados() {

		System.out.println("Endereço: " + this.endereco);
		System.out.println("Valor Base: R$" + this.valorBase);
		System.out.println("Valor Desconto: R$" + this.valorDesconto);
		System.out.println("Valor Total: R$" + this.calcularValor());
	}

	public double calcularValor() {

		return this.valorBase - this.valorDesconto;
	}
}
