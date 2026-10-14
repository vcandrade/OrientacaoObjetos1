package aula08.classesnativas.string;

public class Exemplo04Trim {

	public static void main(String[] args) {

		String alfabeto = "       abcdefghijklmnopqrstuvwxyz       ";

		String alfabetoSemEspaco = alfabeto.trim();

		System.out.println("<<" + alfabeto + ">>");
		System.out.println("<<" + alfabetoSemEspaco + ">>");
	}
}
