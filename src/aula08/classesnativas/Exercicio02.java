package aula08.classesnativas;

public class Exercicio02 {

	public static void main(String[] args) {

		String s1 = new String("Orientação a Objetos");
		String s2 = new String("Orientação a Objetos");

		// ============================================
		// comparação com "=="
		if (s1 == s2) {

			System.out.println("São Iguais");

		} else {

			System.out.println("São Diferentes");
		}

		// ============================================
		// comparação com equals
		if (s1.equals(s2)) {

			System.out.println("São Iguais");

		} else {

			System.out.println("São Diferentes");
		}
	}
}
