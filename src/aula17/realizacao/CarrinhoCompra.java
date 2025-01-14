package aula17.realizacao;

public class CarrinhoCompra {

	private double valorTotalProdutos;
	private int distancia;
	private Frete frete;

	public CarrinhoCompra(double valorTotalProdutos, int distancia, Frete frete) {

		this.valorTotalProdutos = valorTotalProdutos;
		this.distancia = distancia;
		this.frete = frete;
	}

	public void finalizarCompra() {

		double valorTotal = valorTotalProdutos + frete.calcularFrete(distancia);
		System.out.println("Total da Compra: R$" + valorTotal);
	}
}
