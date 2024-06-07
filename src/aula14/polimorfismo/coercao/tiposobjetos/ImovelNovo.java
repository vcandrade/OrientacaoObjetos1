package aula14.polimorfismo.coercao.tiposobjetos;

public class ImovelNovo extends Imovel {
	
	private double valorAdicional;

	public ImovelNovo(String endereco, double valorBase, double valorAdicional) {
		
		super(endereco, valorBase);
		this.valorAdicional = valorAdicional;
	}
	
	public void imprimirDados() {
		
		System.out.println("Enderero: " + this.endereco);
		System.out.println("Valor Base: " + this.valorBase);
		System.out.println("Valor Adicional: " + this.valorAdicional);
		System.out.println("Valor Total: R$" + this.calcularValorTotal());
	}

	private double calcularValorTotal() {
		
		return this.valorBase + this.valorAdicional;
	}
}
