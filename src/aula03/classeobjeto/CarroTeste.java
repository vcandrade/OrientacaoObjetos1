package aula03.classeobjeto;

import java.util.Scanner;

public class CarroTeste {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		// instanciando objetos da classe Carro
		Carro carro1 = new Carro();
		Carro carro2 = new Carro();
		Carro carro3 = new Carro();

		// atribuindo valores para os atributos dos objetos
		carro1.modelo = "458 Italia";
		carro1.marca = "Ferrari";
		carro1.ano = 2015;
		carro1.placa = "ABC-1234";
		carro1.cor = "Vermelho";

		carro2.modelo = "Civic";
		carro2.marca = "Honda";
		carro2.ano = 2020;
		carro2.placa = "MNO-9876";
		carro2.cor = "Azul";

		System.out.println("Informe o modelo do carro 3:");
		carro3.modelo = input.nextLine();
		
		System.out.println("Informe a marca do carro 3:");		
		carro3.marca = input.nextLine();
		
		System.out.println("Informe o ano do carro 3:");
		carro3.ano = input.nextInt();
		
		input.nextLine();
		
		System.out.println("Informe a placa do carro 3:");
		carro3.placa = input.nextLine();
		
		System.out.println("Informe a cor do carro 3:");
		carro3.cor = input.nextLine();

		// buscando os valores dos atributos dos objetos
		System.out.println("Modelo: " + carro1.modelo);
		System.out.println("Marca: " + carro1.marca);
		System.out.println("Ano: " + carro1.ano);
		System.out.println("Placa: " + carro1.placa);
		System.out.println("Cor: " + carro1.cor);

		System.out.println("========================");

		System.out.println("Modelo: " + carro2.modelo);
		System.out.println("Marca: " + carro2.marca);
		System.out.println("Ano: " + carro2.ano);
		System.out.println("Placa: " + carro2.placa);
		System.out.println("Cor: " + carro2.cor);

		System.out.println("========================");

		System.out.println("Modelo: " + carro3.modelo);
		System.out.println("Marca: " + carro3.marca);
		System.out.println("Ano: " + carro3.ano);
		System.out.println("Placa: " + carro3.placa);
		System.out.println("Cor: " + carro3.cor);
	}
}
