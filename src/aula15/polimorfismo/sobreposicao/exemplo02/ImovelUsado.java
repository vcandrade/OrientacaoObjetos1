package aula15.polimorfismo.sobreposicao.exemplo02;

public class ImovelUsado extends Imovel {

	private double valorDesconto;

	public ImovelUsado(String endereco, double valorBase, double valorDesconto) {

		super(endereco, valorBase);
		this.valorDesconto = valorDesconto;
	}

	@Override
	public void imprimirDados() {

		super.imprimirDados();
		
		System.out.println("Valor de Desconto: R$" + this.valorDesconto);
		System.out.println("Valor Total: R$" + this.calcularValorImovel());
	}

	@Override
	protected double calcularValorImovel() {

		return super.valorBase - this.valorDesconto;
	}
}






