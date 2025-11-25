package aula16.classemetodoabstrato.exemplo03;

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
	}
}
