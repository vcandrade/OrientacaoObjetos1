package aula06.variaveis.exercicio02;

public class Terra {

	final double GRAVIDADE = 9.8;

	public void calcularTempoQueda(double altura) {

		double tempo = Math.sqrt((2 * altura) / GRAVIDADE);
		
		System.out.println("Tempo de Queda: " + String.format("%.2f", tempo) + "s.");
	}
}
