package aula15.polimorfismo.sobreposicao.exemplo01;

public class Gato extends Mamifero {

	public Gato(String nome, String raca) {

		super(nome, raca);
	}

	@Override
	public void emitirSom() {

		System.out.println(this.nome + " está miando.");
	}

	public void brincar() {

		System.out.println(this.nome + " está brincando.");
	}

}
