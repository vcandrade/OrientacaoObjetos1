package aula08.classesnativas.string;

public class Exemplo09CompareToIgnoreCase {

	public static void main(String[] args) {

		String universidade = "Universidade Tecnológica Federal do Paraná";
		String universidadeLetrasMaiusculas = "UNIVERSIDADE TECNOLÓGICA FEDERAL DO PARANÁ";

		if (universidade.equalsIgnoreCase(universidadeLetrasMaiusculas)) {

			System.out.println("São iguais");

		} else {

			System.out.println("São diferentes");
		}
	}
}
