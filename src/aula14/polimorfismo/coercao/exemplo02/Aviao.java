package aula14.polimorfismo.coercao.exemplo02;

public class Aviao extends Veiculo {

	private int altiduteMaxima;

	public Aviao(String modelo, String fabricante, int ano, int numeroPassageiros, String combustivel, int altiduteMaxima) {

		super(modelo, fabricante, ano, numeroPassageiros, combustivel);
		this.altiduteMaxima = altiduteMaxima;
	}

	public void voar() {

		System.out.println(this.fabricante + " " + this.modelo + " está voando.");
	}
}
