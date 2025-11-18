package aula14.polimorfismo.coercao.exemplo02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ImovelTeste {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		Imovel imovel = null;

		System.out.println("1 - Imóvel Novo");
		System.out.println("2 - Imóvel Usado");
		System.out.print("Opção: ");
		int opcao = input.nextInt();

		switch (opcao) {

		case 1:

			// coerção implícita
			imovel = new ImovelNovo("Vicente Machado, 1024", 500000.00, 150000.00);
			break;

		case 2:
			// coerção implícita
			imovel = new ImovelUsado("Balduíno Taques, 2048", 500000.00, 50000.00);
			break;
		}

		imovel.imprimirDados();

		System.out.println("=============================");

		if (imovel instanceof ImovelNovo) {

			// coerção explícita
			ImovelNovo imovelNovo = (ImovelNovo) imovel;
			imovelNovo.imprimirDados();
		}

		// declaração de uma lista considerando objetos genéricos, desta maneira,
		// pode-se add a ela qualquer objeto que seja filho da classe Imovel
		List<Imovel> listaImoveis = new ArrayList<Imovel>();

		ImovelNovo imovelNovo1 = new ImovelNovo("Vicente Machado, 1024", 500000.00, 200000.00);
		ImovelUsado imovelUsado1 = new ImovelUsado("Monteiro Lobato, 256", 400000.00, 25000.00);

		listaImoveis.add(imovelNovo1);
		listaImoveis.add(imovelUsado1);
	}
}
