package aula15.polimorfismo.sobreposicao.exemplo02;

public class ImovelTeste {

	public static void main(String[] args) {

		Imovel imovel = null;
		
		int opcao = 1;
		
		switch(opcao) {
		
			case 1:
				
				imovel = new ImovelNovo("Vicente Machado, 1024", 500000.00, 200000.00);
				break;
			
			case 2:
				
				imovel = new ImovelUsado("Balduíno Taques, 2048", 500000.00, 150000.00);
				break;
		}
		
		imovel.imprimirDados();
	}
}
