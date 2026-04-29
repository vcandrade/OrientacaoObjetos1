package aula11.enumeracoes.exemplo02;

public class Quarto {

	private int numero;
	private TipoQuarto tipoQuarto;

	public Quarto(int numero, TipoQuarto tipoQuarto) {

		this.numero = numero;
		this.tipoQuarto = tipoQuarto;
	}

	public void finalizarEstadia() {

		System.out.println("Capacidade: " + this.tipoQuarto.getCapacidade() + " pessoas.");
		System.out.println("Valor da Diária: R$" + String.format("%.2f", this.tipoQuarto.getValorDiaria()));
		System.out.println("Área: " + this.tipoQuarto.getArea() + "m².");
		System.out.println("Características: " + this.tipoQuarto.getCaracteristicas());
		System.out.println("========================================================");

	}
}
