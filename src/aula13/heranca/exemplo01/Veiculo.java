package aula13.heranca.exemplo01;

public class Veiculo {

	protected String modelo;
	protected String fabricante;
	protected int ano;
	protected int numeroPassageiros;
	protected String combustivel;

	public Veiculo(String modelo, String fabricante, int ano, int numeroPassageiros, String combustivel) {

		this.modelo = modelo;
		this.fabricante = fabricante;
		this.ano = ano;
		this.numeroPassageiros = numeroPassageiros;
		this.combustivel = combustivel;
	}

	public void abastecer() {

		System.out.println(this.fabricante + " " + this.modelo + " está abastecendo.");
	}
}
