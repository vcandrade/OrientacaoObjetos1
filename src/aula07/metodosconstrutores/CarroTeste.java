package aula07.metodosconstrutores;

public class CarroTeste {

	public static void main(String[] args) {

		// instanciando objetos da classe Carro
		Carro carro1 = new Carro("458 Italia", "Ferrari", 2015, "ABC-1234", "Vermelho");
		Carro carro2 = new Carro(2018);
		Carro carro3 = new Carro("XYZ-1597");
		Carro carro4 = new Carro("Gol", "Volks", 2013);

		// impressão dos dados de cada objeto por meio do método toString()
		System.out.println(carro1);
		System.out.println(carro2);
		System.out.println(carro3);
		System.out.println(carro4);
	}
}
