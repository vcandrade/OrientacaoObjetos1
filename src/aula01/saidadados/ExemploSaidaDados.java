package aula01.saidadados;

public class ExemploSaidaDados {

	public static void main(String[] args) {

		String aluno = "João da Silva";
		int periodo = 2;
		double coeficiente = 0.79;

		System.out.println(aluno + " está no " + periodo + " período e tem " + coeficiente + " de coeficiente.");
		System.out.println("Orientação a Objetos 1");

		System.out.printf("%s está no %d período e tem %.2f de coeficiente.", aluno, periodo, coeficiente);
	}
}
