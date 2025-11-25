package aula17.realizacao.exemplo02;

public class Homem implements Nadador, Andador {

	private String nome;

	public Homem() {

		this.nome = "Homem";
	}

	@Override
	public void andar() {

		System.out.println(this.nome + " está andando.");
	}

	@Override
	public void nadar() {

		System.out.println(this.nome + " está nadando.");
	}
}
