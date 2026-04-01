package aula06.variaveis.exemplo03.variaveisclasse;

public class Galinha {

	// atributos de instância
	String nome;
	int quantidadeOvos;

	// atributos de classe
	static int quantidadeOvosGranja;

	public void botar() {

		quantidadeOvos++;
		quantidadeOvosGranja++;
	}
}
