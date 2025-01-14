package aula16.classemetodoabstrato.exemplo02;

import java.util.Scanner;

public class MamiferoTeste {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		Mamifero mamifero = null;
		
		System.out.println("1 - Gato");
		System.out.println("2 - Cachorro");
		System.out.println("3 - Cavalo");
		
		System.out.print("Opção: ");
		int opcao = input.nextInt();
		
		switch(opcao) {
		
			case 1:
				mamifero = new Gato("Garfield", "Amarelo");
				break;
			
			case 2:
				mamifero = new Cachorro("Spike", "Pastor Alemão");
				break;
				
			case 3:
				mamifero = new Cavalo("Pé de Pano", "Marchador");
				break;
		}
		
		mamifero.emitirSom();
	}
}
