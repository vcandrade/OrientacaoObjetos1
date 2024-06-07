package aula14.polimorfismo.coercao.tiposobjetos;

public class ImovelTeste {

	public static void main(String[] args) {

		Imovel imovel = new ImovelUsado("Vicente Machado", 500000.00, 200000.00);
		imovel.imprimirDados();

		System.out.println("======================");

		if (imovel instanceof ImovelUsado) {

			ImovelUsado imovelUsado = (ImovelUsado) imovel;
			imovelUsado.imprimirDados();

		} else {

			ImovelNovo imovelNovo = (ImovelNovo) imovel;
			imovelNovo.imprimirDados();
		}
	}
}
