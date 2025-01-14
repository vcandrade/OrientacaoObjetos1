package aula15.polimorfismo.sobreposicao.exemplo01;

import java.util.Scanner;

public class MamiferoTeste {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Mamifero mamifero = null;

		System.out.println("1 - Gato");
		System.out.println("2 - Cachorro");
		System.out.println("3 - Cavalo");

		System.out.print("Informe a opção: ");
		int opcao = input.nextInt();

		switch (opcao) {

			case 1:
				mamifero = new Gato("Garfield", "Amarelo");
				break;
	
			case 2:
				mamifero = new Cachorro("Spike", "Caramelo", 10);
				break;
	
			case 3:
				mamifero = new Cavalo("Pé de Pano", "Marchador");
				break;
		}

		mamifero.emitirSom();

		if (mamifero instanceof Cachorro) {

			((Cachorro) mamifero).brincar();
		}
	}
}
