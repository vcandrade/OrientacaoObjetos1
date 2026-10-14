package aula08.classesnativas.string;

public class Exemplo13Equals {

	public static void main(String[] args) {

		String s1 = new String("Orientação a Objetos");
		String s2 = new String("Orientação a Objetos");

		// ============================================
		// comparação de objetos (endereços de memória): "=="
		if (s1 == s2) {

			System.out.println("São Iguais");

		} else {

			System.out.println("São Diferentes");
		}

		// ============================================
		// comparação de conteúdos de strings: "equals"
		if (s1.equals(s2)) {

			System.out.println("São Iguais");

		} else {

			System.out.println("São Diferentes");
		}
	}
}
