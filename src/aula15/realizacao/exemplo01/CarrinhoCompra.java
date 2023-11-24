package aula15.realizacao.exemplo01;

public class CarrinhoCompra {

	private double valorCompra;
	private int distancia;
	private Frete frete;

	public CarrinhoCompra(double valorCompra, int distancia, Frete frete) {

		this.valorCompra = valorCompra;
		this.distancia = distancia;
		this.frete = frete;
	}

	public void realizarCompra() {

		double valorTotal = this.valorCompra + this.frete.calcularFrete(this.distancia);

		System.out.println("Valor Total: R$" + valorTotal);
	}
}
