package aula17.realizacao.exemplo01;

public class Sedex10 implements Frete {

	@Override
	public double calcularFrete(int distancia) {
		
		return 20.00 + (distancia * 0.60);
	}
}
