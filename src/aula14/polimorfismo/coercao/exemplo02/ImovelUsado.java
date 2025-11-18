package aula14.polimorfismo.coercao.exemplo02;

public class ImovelUsado extends Imovel {

	private double valorDesconto;

	public ImovelUsado(String endereco, double valorBase, double valorDesconto) {

		super(endereco, valorBase);
		this.valorDesconto = valorDesconto;
	}

	public void imprimirDados() {

		super.imprimirDados();
		System.out.println("Valor Desconto: R$" + this.valorDesconto);
	}
}
