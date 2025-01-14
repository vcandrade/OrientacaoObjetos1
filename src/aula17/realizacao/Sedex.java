package aula17.realizacao;

public class Sedex implements Frete {

	@Override
	public double calcularFrete(int distancia) {

		return 17.00 + (0.45 * distancia);
	}
}
