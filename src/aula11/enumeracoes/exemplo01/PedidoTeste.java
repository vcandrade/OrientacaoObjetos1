package aula11.enumeracoes.exemplo01;

public class PedidoTeste {

	public static void main(String[] args) {
		
		Pedido pedido1 = new Pedido(111, "20/10/2026");
		pedido1.imprimirPedido();
		
		pedido1.alterarStatus(Status.PROCESSANDO);
		pedido1.imprimirPedido();
		
		pedido1.alterarStatus(Status.ENVIADO);
		pedido1.imprimirPedido();
		
		pedido1.alterarStatus(Status.ENTREGUE);
		pedido1.imprimirPedido();
	}
}






