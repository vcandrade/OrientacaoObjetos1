package aula01.saidadados;

public class ExemploSaidaDados {

	public static void main(String[] args) {

		String aluno = "Jo�o da Silva";
		int periodo = 2;
		double coeficiente = 0.79;

		System.out.println(aluno + " est� no " + periodo + " per�odo e tem " + coeficiente + " de coeficiente.");
		System.out.println("Orienta��o a Objetos 1");

		System.out.printf("%s est� no %d per�odo e tem %.2f de coeficiente.", aluno, periodo, coeficiente);
	}
}
