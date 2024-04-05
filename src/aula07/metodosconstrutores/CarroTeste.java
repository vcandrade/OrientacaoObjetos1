package aula07.metodosconstrutores;

public class CarroTeste {

	public static void main(String[] args) {

		// instanciar objetos da classe Carro
		Carro carro1 = new Carro("Gol", "Volkswagen", 2022, "ABC-1234", "Vermelho");
		Carro carro2 = new Carro("XYZ-1597");
		Carro carro3 = new Carro(2015);

		// imprimir os dados dos objetos
		carro1.imprimirDados();
		carro2.imprimirDados();
		carro3.imprimirDados();

	}
}
