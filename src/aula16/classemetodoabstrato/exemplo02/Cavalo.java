package aula16.classemetodoabstrato.exemplo02;

public class Cavalo extends Mamifero {

	public Cavalo(String nome, String raca) {

		super(nome, raca);
	}

	public void emitirSom() {

		System.out.println(super.nome + " está relinchando.");
	}
}
