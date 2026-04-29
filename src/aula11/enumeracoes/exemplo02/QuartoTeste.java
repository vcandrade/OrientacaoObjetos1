package aula11.enumeracoes.exemplo02;

public class QuartoTeste {

	public static void main(String[] args) {

		Quarto quarto1 = new Quarto(1, TipoQuarto.SOLTEIRO);
		Quarto quarto2 = new Quarto(2, TipoQuarto.CASAL);
		Quarto quarto3 = new Quarto(3, TipoQuarto.SUITE);
		Quarto quarto4 = new Quarto(4, TipoQuarto.LUXO);
		
		quarto1.finalizarEstadia();
		quarto2.finalizarEstadia();
		quarto3.finalizarEstadia();
		quarto4.finalizarEstadia();
	}
}
