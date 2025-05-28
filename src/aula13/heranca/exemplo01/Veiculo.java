package aula13.heranca.exemplo01;

public class Veiculo {

	protected String modelo;
	protected String fabricante;
	protected int anoFabricacao;
	protected int numeroPassageiros;
	protected String combustivel;

	public Veiculo(String modelo, String fabricante, int anoFabricacao, int numeroPassageiros, String combustivel) {

		this.modelo = modelo;
		this.fabricante = fabricante;
		this.anoFabricacao = anoFabricacao;
		this.numeroPassageiros = numeroPassageiros;
		this.combustivel = combustivel;
	}

	public void abastecer() {

		System.out.println(this.fabricante + " " + this.modelo + " está abastecendo.");
	}
}
