package aula13.heranca.exemplo01;

public class Aviao extends Veiculo {

	private int altitudeMaxima;

	public Aviao(String modelo, String fabricante, int ano, int numeroPassageiros, String combustivel, int altitudeMaxima) {

		super(modelo, fabricante, ano, numeroPassageiros, combustivel);
		this.altitudeMaxima = altitudeMaxima;
	}

	public void voar() {

		System.out.println(this.fabricante + " " + this.modelo + " está voando.");
	}
}










