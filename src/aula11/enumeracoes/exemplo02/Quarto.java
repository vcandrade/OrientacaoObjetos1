package aula11.enumeracoes.exemplo02;

public class Quarto {

	private int numero;
	private TipoQuarto tipoQuarto;

	public Quarto(int numero, TipoQuarto tipoQuarto) {

		this.numero = numero;
		this.tipoQuarto = tipoQuarto;
	}

	public void imprimirDadosQuarto() {

		System.out.println("Quarto: " + this.numero);
		System.out.println("Tipo: " + this.tipoQuarto);
		System.out.println("Capacidade: " + this.tipoQuarto.getCapacidade());
		System.out.println("Área: " + this.tipoQuarto.getArea() + "m²");
		System.out.println("Características: " + this.tipoQuarto.getCaracteristicas());
		System.out.println("Valor Diária: R$" + this.tipoQuarto.getValorDiaria());

		System.out.println("========================================================");
	}
}
