package aula11.enumerations.exemplo01;

public class PedidoTeste {

	public static void main(String[] args) {
		
		Pedido pedido1 = new Pedido(101, "07/05/2025");
		pedido1.imprimirDadosPedido();
		
		System.out.println("========================");
		
		pedido1.alterarStatusPedido(Status.PROCESSANDO);
		pedido1.imprimirDadosPedido();
	}
}







