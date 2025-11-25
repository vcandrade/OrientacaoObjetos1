package aula17.realizacao.exemplo01;

public class Sedex implements Frete {

	@Override
	public double calcularFrete(int distancia) {
		
		return 17.00 + (distancia * 0.45);
	}
}
