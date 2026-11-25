package aula16.classemetodoabstrato.exemplo02;

public class Gato extends Mamifero {

	public Gato(String nome, String raca) {

		super(nome, raca);
	}

	@Override
	public void emitirSom() {

		System.out.println(super.nome + " está miando.");
	}
	
	public void brincar() {
		
		System.out.println(super.nome + " está brincando");
	}
}








