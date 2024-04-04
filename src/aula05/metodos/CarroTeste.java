package aula05.metodos;

public class CarroTeste {

	public static void main(String[] args) {

		// instanciar objetos da classe Carro
		Carro carro1 = new Carro();
		Carro carro2 = new Carro();

		// atribuir valores para os atributos de cada carro
		carro1.modelo = "Gol";
		carro1.marca = "Volkswagen";
		carro1.ano = 2015;
		carro1.placa = "ABC-1234";
		carro1.cor = "Vermelho";

		carro2.modelo = "Onix";
		carro2.marca = "Chevrolet";
		carro2.ano = 2024;
		carro2.placa = "MNO-9876";
		carro2.cor = "Preto";

		System.out.println(carro1);
		System.out.println(carro2);
	}
}
