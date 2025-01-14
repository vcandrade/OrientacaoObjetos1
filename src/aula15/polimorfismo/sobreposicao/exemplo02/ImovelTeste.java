package aula15.polimorfismo.sobreposicao.exemplo02;

public class ImovelTeste {

	public static void main(String[] args) {

		Imovel imovel = null;

		int opcao = 2;

		switch (opcao) {
			case 1:
				imovel = new ImovelNovo("Balduíno Taques, 1024", 500000.00, 150000.00);
				break;
			case 2:
				imovel = new ImovelUsado("Vicente Machado, 2048", 500000.00, 50000.00);
				break;
		}
		imovel.imprimirDados();
	}
}
