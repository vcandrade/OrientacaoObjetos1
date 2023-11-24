package aula15.realizacao.exemplo01;

public class Transportadora implements Frete {

	@Override
	public double calcularFrete(int distancia) {
		
		return 17.00 + (distancia * 0.50);
	}

}
