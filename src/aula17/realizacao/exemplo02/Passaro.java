package aula17.realizacao.exemplo02;

public class Passaro implements Andador, Voador {

	private String nome;

	public Passaro() {

		this.nome = "Pássaro";
	}

	@Override
	public void voar() {

		System.out.println(this.nome + " está voando.");
	}

	@Override
	public void andar() {

		System.out.println(this.nome + " está andando.");
	}
}
