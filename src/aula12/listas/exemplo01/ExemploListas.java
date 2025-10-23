package aula12.listas.exemplo01;

import java.util.ArrayList;
import java.util.List;

public class ExemploListas {

	public static void main(String[] args) {

		Carro carro1 = new Carro("Gol", "Volks", 2020);
		Carro carro2 = new Carro("Onix", "Chevrolet", 2021);
		Carro carro3 = new Carro("Ká", "Ford", 2022);

		List<Carro> listaNomes = new ArrayList<>();

		System.out.println("Número de Elementos: " + listaNomes.size());

		listaNomes.add(carro1);
		listaNomes.add(carro2);
		listaNomes.add(carro3);

		System.out.println("Número de Elementos: " + listaNomes.size());
		
		System.out.println("\n====================================");
		System.out.println(">>>> for tradicional com índice <<<<");

		for (int i = 0; i < listaNomes.size(); i++) {

			Carro temp = listaNomes.get(i);
			System.out.println("Modelo: " + temp.getModelo());
		}
		
		System.out.println("\n====================================");
		System.out.println(">>>>		foreach		<<<<");

		for (Carro temp : listaNomes) {

			System.out.println("Modelo: " + temp.getModelo());
		}
	}
}
