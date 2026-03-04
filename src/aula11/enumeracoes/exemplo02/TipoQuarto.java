package aula11.enumeracoes.exemplo02;

public enum TipoQuarto {

	SOLTEIRO(1, 150.00, 12, "Uma cama solteiro e frigobar"), 
	CASAL(2, 220.00, 18, "Uma cama de casal queen e frigobar"),
	SUITE(4, 350.00, 30, "Uma cama casal king, duas camas de solteiro e frigobar"), 
	LUXO(4, 600.00, 45, "Uma cama de casal king, duas camas de solteiro, frigobar, banheira com hidromassagem, e varanda");

	private int capacidade;
	private double valorDiaria;
	private int area;
	private String caracteristicas;

	private TipoQuarto(int capacidade, double valorDiaria, int area, String caracteristicas) {

		this.capacidade = capacidade;
		this.valorDiaria = valorDiaria;
		this.area = area;
		this.caracteristicas = caracteristicas;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public double getValorDiaria() {
		return valorDiaria;
	}

	public int getArea() {
		return area;
	}

	public String getCaracteristicas() {
		return caracteristicas;
	}
}
