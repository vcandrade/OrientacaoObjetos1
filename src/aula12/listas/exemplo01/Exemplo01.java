package aula12.listas.exemplo01;

import java.util.List;
import java.util.ArrayList;

public class Exemplo01 {

	public static void main(String[] args) {

		Pessoa p1 = new Pessoa("Maria de Oliveira", 25, 50.5);
		Pessoa p2 = new Pessoa("Manuel Azevedo", 30, 65.7);
		Pessoa p3 = new Pessoa("Paulo Ferreira", 35, 70.0);

		List<Pessoa> listaPessoas = new ArrayList<>();

		listaPessoas.add(p1);
		listaPessoas.add(p2);
		listaPessoas.add(p3);
		
		// foreach
		for (Pessoa pessoa : listaPessoas) {
			
			System.out.println("Nome: " + pessoa.getNome());
			System.out.println("Idade: " + pessoa.getIdade());
			System.out.println("Peso: " + pessoa.getPeso());

			if (pessoa.getIdade() >= 18) {

				System.out.println("Maior de Idade");

			} else {

				System.out.println("Menor de Idade");
			}

			System.out.println("==================");
		}

//		for (int i = 0; i < listaPessoas.size(); i++) {
//
//			Pessoa pessoa = listaPessoas.get(i);
//
//			System.out.println("Nome: " + pessoa.getNome());
//			System.out.println("Idade: " + pessoa.getIdade());
//			System.out.println("Peso: " + pessoa.getPeso());
//
//			if (pessoa.getIdade() >= 18) {
//
//				System.out.println("Maior de Idade");
//
//			} else {
//
//				System.out.println("Menor de Idade");
//			}
//
//			System.out.println("==================");
//		}
	}
}
