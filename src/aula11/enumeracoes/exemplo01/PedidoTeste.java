package aula11.enumeracoes.exemplo01;

public class PedidoTeste {

	public static void main(String[] args) {

		Pedido pedido1 = new Pedido(1, "28/04/2026");
		pedido1.imprimirDados();

		pedido1.realizarPagamento();
		pedido1.imprimirDados();

		pedido1.alterarStatusPedido(Status.ENTREGUE);
		pedido1.imprimirDados();
	}
}
