package aula08.classesnativas.string;

public class Exemplo01Equals {

	public static void main(String[] args) {

		String disciplina1 = "Orientação a Objetos";
		String disciplina2 = "Orientação a Objetos";

		if (disciplina1.equals(disciplina2)) {

			System.out.println("São iguais");

		} else {

			System.out.println("São diferentes");
		}
	}
}
