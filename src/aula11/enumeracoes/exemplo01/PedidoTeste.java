package aula11.enumeracoes.exemplo01;

public class PedidoTeste {

	public static void main(String[] args) {

		Pedido pedido1 = new Pedido(111, "02/05/2024");
		pedido1.imprimirDadosPedido();

		pedido1.alterarStatusPedido(Status.PROCESSANDO);
		pedido1.imprimirDadosPedido();
	}
}
