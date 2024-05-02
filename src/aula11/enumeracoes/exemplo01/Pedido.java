package aula11.enumeracoes.exemplo01;

public class Pedido {

	private int id;
	private String data;
	private Status statusPedido;

	public Pedido(int id, String data) {

		this.id = id;
		this.data = data;
		this.statusPedido = Status.AGUARDANDO_PAGAMENTO;
	}

	public void alterarStatusPedido(Status novoStatus) {

		this.statusPedido = novoStatus;
		System.out.println("Status do pedido alterado.");
	}

	public void imprimirDadosPedido() {

		System.out.println("============================");
		System.out.println("Número: " + this.id);
		System.out.println("Data: " + this.data);
		System.out.println("Status: " + this.statusPedido);
		System.out.println("============================");
	}
}
