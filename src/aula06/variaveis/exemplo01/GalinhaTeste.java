package aula06.variaveis.exemplo01;

public class GalinhaTeste {

	public static void main(String[] args) {

		Galinha galinha1 = new Galinha();
		Galinha galinha2 = new Galinha();
		Galinha galinha3 = new Galinha();

		galinha1.nome = "Giselda";
		galinha2.nome = "Matilde";
		galinha3.nome = "Clotilde";

		galinha1.botar();
		galinha1.botar();
		galinha1.botar();

		galinha2.botar();
		galinha2.botar();
		galinha2.botar();
		galinha2.botar();
		galinha2.botar();

		galinha3.botar();

		System.out.println(galinha1.nome + " botou " + galinha1.quantidadeOvos + " ovo(s).");
		System.out.println(galinha2.nome + " botou " + galinha2.quantidadeOvos + " ovo(s).");
		System.out.println(galinha3.nome + " botou " + galinha3.quantidadeOvos + " ovo(s).");

		System.out.println("Quantidade Total de Ovos: " + Galinha.quantidadeOvosGranja + " ovo(s).");
	}
}
