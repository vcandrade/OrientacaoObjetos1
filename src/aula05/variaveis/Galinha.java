package aula05.variaveis;

public class Galinha {

	String nome;
	int quantidadeOvos = 0;
	static int quantidadeOvosGranja = 0;

	public void botar() {

		quantidadeOvos++;
		quantidadeOvosGranja++;
	}
}
