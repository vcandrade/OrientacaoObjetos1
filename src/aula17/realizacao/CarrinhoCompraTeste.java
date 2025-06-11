package aula17.realizacao;

public class CarrinhoCompraTeste {

	public static void main(String[] args) {

		CarrinhoCompra carrinhoCompra = new CarrinhoCompra(150.00, 100, new Correios());
		carrinhoCompra.finalizarCompra();
	}
}
