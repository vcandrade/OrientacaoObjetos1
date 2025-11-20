package aula15.polimorfismo.sobreposicao.exemplo01;

public class Mamifero {

	protected String nome;
	protected String raca;

	public Mamifero(String nome, String raca) {

		this.nome = nome;
		this.raca = raca;
	}

	public void emitirSom() {

		System.out.println("Emitindo som genérico.");
	}
}
