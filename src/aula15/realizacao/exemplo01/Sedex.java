package aula15.realizacao.exemplo01;

public class Sedex implements Frete {

	@Override
	public double calcularFrete(int distancia) {
		
		return 15.00 + (distancia * 0.45);
	}
}
