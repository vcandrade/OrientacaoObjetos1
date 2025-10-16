package aula11.enumeracoes.exemplo01;

public class Pedido {

	private int id;
	private String data;
	private Status status;

	public Pedido(int id, String data) {
		this.id = id;
		this.data = data;
		this.status = Status.AGUARDANDO_PAGAMENTO;
	}

	public void alterarStatusPedido(Status novoStatus) {

		this.status = novoStatus;
	}

	public void imprimirRelatorio() {

		System.out.println("ID: " + this.id);
		System.out.println("Data: " + this.data);
		System.out.println("Status: " + this.status);
		System.out.println("======================");
	}
}
