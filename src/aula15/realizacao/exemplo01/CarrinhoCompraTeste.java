package aula15.realizacao.exemplo01;

public class CarrinhoCompraTeste {

	public static void main(String[] args) {

		CarrinhoCompra carrinhoCompra = new CarrinhoCompra(500.00, 100, new Sedex());
		carrinhoCompra.realizarCompra();
	}
}
