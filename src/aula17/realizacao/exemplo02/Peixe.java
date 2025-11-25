package aula17.realizacao.exemplo02;

public class Peixe implements Nadador {

	private String nome;

	public Peixe() {

		this.nome = "Peixe";
	}

	@Override
	public void nadar() {

		System.out.println(this.nome + " está nadando.");
	}
}
