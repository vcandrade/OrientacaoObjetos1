package aula14.polimorfismo.sobrecarga.exemplo04;

public class ConversorTeste {

	public static void main(String[] args) {
		
		Conversor conversor = new Conversor();
		
		long valorLong = 10;
		float valorFloat = 11.5F;
		double valorDouble = 12.6;
		String valorString = "13";
		
		int w = conversor.converterValor(valorLong);
		int x = conversor.converterValor(valorFloat);
		int y = conversor.converterValor(valorDouble);
		int z = conversor.converterValor(valorString);
	}
}
