package aula11.enumeracoes.exemplo02;

public class Quarto {

	private int numero;
	private TipoQuarto tipoQuarto;

	public Quarto(int numero, TipoQuarto tipoQuarto) {

		this.numero = numero;
		this.tipoQuarto = tipoQuarto;
	}

	public void imprimirQuarto() {

		System.out.println("Número: " + this.numero);
		System.out.println("Tipo do Quarto: " + this.tipoQuarto);
		System.out.println("Capacidade: " + this.tipoQuarto.getCapacidade());
		System.out.println("Área: " + this.tipoQuarto.getArea());
		System.out.println("Valor da Diária: R$" + this.tipoQuarto.getValorDiaria());
		System.out.println("Características: " + this.tipoQuarto.getCaracteristica());
		System.out.println("======================");
	}
}
