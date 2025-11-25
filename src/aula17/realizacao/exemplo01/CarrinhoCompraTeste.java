package aula17.realizacao.exemplo01;

public class CarrinhoCompraTeste {

	public static void main(String[] args) {

		CarrinhoCompra carrinhoCompra1 = new CarrinhoCompra(500.00, 100, new Sedex10());
		carrinhoCompra1.realizarCompra();
	}
}
