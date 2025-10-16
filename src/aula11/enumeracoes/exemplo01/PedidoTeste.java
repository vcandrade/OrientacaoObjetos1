package aula11.enumeracoes.exemplo01;

public class PedidoTeste {

	public static void main(String[] args) {

		Pedido pedido1 = new Pedido(111, "15/10/2025");
		pedido1.imprimirRelatorio();

		pedido1.alterarStatusPedido(Status.PROCESSANDO);
		pedido1.imprimirRelatorio();

		pedido1.alterarStatusPedido(Status.ENVIADO);
		pedido1.imprimirRelatorio();

		pedido1.alterarStatusPedido(Status.ENTREGUE);
		pedido1.imprimirRelatorio();
	}
}
