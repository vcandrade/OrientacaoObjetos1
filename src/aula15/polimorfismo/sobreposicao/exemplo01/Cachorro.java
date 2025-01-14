package aula15.polimorfismo.sobreposicao.exemplo01;

public class Cachorro extends Mamifero {

	private int idade;

	public Cachorro(String nome, String raca, int idade) {

		super(nome, raca);
		this.idade = idade;
	}

	@Override
	public void emitirSom() {

		System.out.println(this.nome + " tem " + idade + " anos e está latindo.");
	}

	public void brincar() {

		System.out.println(this.nome + " está brincando");
	}
}
