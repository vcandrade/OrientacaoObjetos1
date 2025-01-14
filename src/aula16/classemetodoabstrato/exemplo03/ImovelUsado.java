package aula16.classemetodoabstrato.exemplo03;

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
		System.out.println("Valor Total: R$" + this.calcularValorTotal());
	}
	
	@Override
	protected double calcularValorTotal() {
		
		return this.valorBase - this.valorDesconto;
	}
}
