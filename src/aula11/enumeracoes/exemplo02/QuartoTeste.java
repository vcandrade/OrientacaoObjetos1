package aula11.enumeracoes.exemplo02;

public class QuartoTeste {

	public static void main(String[] args) {

		Quarto quarto1 = new Quarto(111, TipoQuarto.SOLTEIRO);
		Quarto quarto2 = new Quarto(222, TipoQuarto.CASAL);
		Quarto quarto3 = new Quarto(333, TipoQuarto.SUITE);
		Quarto quarto4 = new Quarto(444, TipoQuarto.LUXO);

		quarto1.imprimirQuarto();
		quarto2.imprimirQuarto();
		quarto3.imprimirQuarto();
		quarto4.imprimirQuarto();
	}
}
