package aula14.polimorfismo.coercao.exemplo01;

public class ImovelNovo extends Imovel {

	private double valorAdicional;

	public ImovelNovo(String endereco, double valorBase, double valorAdicional) {
		
		super(endereco, valorBase);
		this.valorAdicional = valorAdicional;
	}
	
	@Override
	public void imprimirDados() {
		
		super.imprimirDados();
		
		System.out.println("Valor Adicional: R$" + this.valorAdicional);
		System.out.println("Valor Final: R$" + this.calcularValor());
	}
	
	@Override
	public double calcularValor() {
		
		return this.valorBase + this.valorAdicional;
	}
}
