package aula15.polimorfismo.sobreposicao.exemplo01;

public class MamiferoTeste {

	public static void main(String[] args) {

		Mamifero mamifero = null;

		int opcao = 1;

		switch (opcao) {

		case 1:
			mamifero = new Gato("Garfield", "Amarelo");
			break;

		case 2:
			mamifero = new Cachorro("Spike", "Pastor");
			break;

		case 3:
			mamifero = new Cavalo("Pé de Pano", "Marchador");
			break;
		}
		mamifero.emitirSom();

		if (mamifero instanceof Gato) {

			((Gato) mamifero).brincar();
		}
	}
}
