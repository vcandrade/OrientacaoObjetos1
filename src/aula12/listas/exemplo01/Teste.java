package aula12.listas.exemplo01;

import java.util.ArrayList;
import java.util.List;

public class Teste {

	public static void main(String[] args) {

		Pessoa pessoa1 = new Pessoa("Ana Vieira", 12, 58.8);
		Pessoa pessoa2 = new Pessoa("Fernando Campos", 15, 75.5);
		Pessoa pessoa3 = new Pessoa("Aline Azevedo", 18, 60.9);

		List<Pessoa> listaGenerica = new ArrayList<>();

		listaGenerica.add(pessoa1);
		listaGenerica.add(pessoa2);
		listaGenerica.add(pessoa3);

		for (Pessoa pessoa : listaGenerica) {

			if (pessoa.getIdade() >= 18) {

				System.out.println(pessoa.getNome() + " é maior de idade.");

			} else {

				System.out.println(pessoa.getNome() + " é menor de idade.");
			}
		}

//		for (int i = 0; i < listaGenerica.size(); i++) {
//
//			Pessoa pessoa = listaGenerica.get(i);
//
//			if (pessoa.getIdade() >= 18) {
//
//				System.out.println(pessoa.getNome() + " é maior de idade.");
//
//			} else {
//
//				System.out.println(pessoa.getNome() + " é menor de idade.");
//			}
//		}

		System.out.println("Total de Elementos: " + listaGenerica.size());
	}
}
