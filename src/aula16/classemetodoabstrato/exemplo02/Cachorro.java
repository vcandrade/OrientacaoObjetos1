package aula16.classemetodoabstrato.exemplo02;

public class Cachorro extends Mamifero {

	public Cachorro(String nome, String raca) {

		super(nome, raca);
	}

	public void emitirSom() {

		System.out.println(super.nome + " está latindo.");
	}
}
