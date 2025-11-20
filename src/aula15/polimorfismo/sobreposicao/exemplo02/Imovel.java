package aula15.polimorfismo.sobreposicao.exemplo02;

public class Imovel {

	protected String endereco;
	protected double valorBase;

	public Imovel(String endereco, double valorBase) {

		this.endereco = endereco;
		this.valorBase = valorBase;
	}

	public void imprimirDados() {

		System.out.println("Endereço: " + this.endereco);
		System.out.println("Valor Base: R$" + this.valorBase);
	}

	protected double calcularValorTotal() {

		return 0.00;
	}
}
