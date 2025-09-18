package aula06.variaveis.exemplo01;

public class Galinha {

	// variável de instância
	String nome;
	int quantidadeOvos;

	// variável de classe
	static int quantidadeOvosGranja;

	public void botar() {

		quantidadeOvos++;
		quantidadeOvosGranja++;
	}
}
