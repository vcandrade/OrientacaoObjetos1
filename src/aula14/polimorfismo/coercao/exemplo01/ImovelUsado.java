package aula14.polimorfismo.coercao.exemplo01;

public class ImovelUsado extends Imovel {

	private double valorDesconto;

	public ImovelUsado(String endereco, double valorBase, double valorDesconto) {
		
		super(endereco, valorBase);
		this.valorDesconto = valorDesconto;
	}
	
	@Override
	public void imprimirDados() {
		
		super.imprimirDados();
		
		System.out.println("Valor Desconto: R$" + this.valorDesconto);
		System.out.println("Valor Final: R$" + this.calcularValor());
	}
	
	@Override
	public double calcularValor() {
		
		return this.valorBase - this.valorDesconto;
	}
}
