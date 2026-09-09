package aula06.variaveis.exemplo03;

public class Galinha {

	String nome; 					 // atributo de instância
	int quantidadeOvos = 0; 		 // atributo de instância

	static int quantidadeOvosGranja; // atributo de classe

	public void botar() {

		quantidadeOvos++;
		quantidadeOvosGranja++;
	}
}
