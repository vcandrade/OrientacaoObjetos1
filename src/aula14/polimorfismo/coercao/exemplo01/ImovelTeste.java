package aula14.polimorfismo.coercao.exemplo01;

public class ImovelTeste {

	public static void main(String[] args) {
		
		// coerção implícita. Instanciando um objeto de ImovelNovo e atribuindo para um objeto Imovel
		Imovel imovel = new ImovelNovo("Vicente Machado, 1024", 500000.00, 200000.00);
		imovel.imprimirDados();
		
		System.out.println("=======================");
		
		// coerção explícita. Atribuindo um objeto do tipo Imovel para um objeto do tipo ImovelNovo
		if(imovel instanceof ImovelNovo) {
			
			ImovelNovo imovelNovo = (ImovelNovo) imovel;
			imovelNovo.imprimirDados();
		
		} else {
			
			ImovelUsado imovelUsado = (ImovelUsado) imovel;
			imovelUsado.imprimirDados();
		}
	}
}
