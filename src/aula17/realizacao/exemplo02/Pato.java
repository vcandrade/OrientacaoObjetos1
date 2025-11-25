package aula17.realizacao.exemplo02;

public class Pato implements Andador, Voador, Nadador {

	private String nome;

	public Pato() {

		this.nome = "Pato";
	}

	@Override
	public void nadar() {

		System.out.println(this.nome + " está nadando.");
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
