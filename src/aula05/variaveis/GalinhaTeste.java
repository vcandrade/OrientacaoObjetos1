package aula05.variaveis;

public class GalinhaTeste {

	public static void main(String[] args) {
		
		// instanciação dos objetos do tipo Galinha
		Galinha galinha1 = new Galinha();
		Galinha galinha2 = new Galinha();
		Galinha galinha3 = new Galinha();
		
		// definição dos valores dos atributos de cada Galinha
		galinha1.nome = "Giselda";
		galinha2.nome = "Matilde";
		galinha3.nome = "Clotilde";
		
		// invocação de métodos de cada galinha
		galinha1.botar();
		galinha1.botar();
		galinha1.botar();
		
		galinha3.botar();
		
		// verificação da quantidade de ovos de cada galinha
		System.out.println(galinha1.nome + " botou " + galinha1.quantidadeOvos + " ovo(s)");
		System.out.println(galinha2.nome + " botou " + galinha2.quantidadeOvos + " ovo(s)");
		System.out.println(galinha3.nome + " botou " + galinha3.quantidadeOvos + " ovo(s)");
		System.out.println("TOTAL: " + Galinha.quantidadeOvosGranja);
	}
}








