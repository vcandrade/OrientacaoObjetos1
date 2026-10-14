package aula07.metodoconstrutor;

public class CarroTeste {

	public static void main(String[] args) {

		// instanciar objetos da classe Carro
		Carro carro1 = new Carro("458 Italia", "Ferrari", 2015, "ABC-1234", "Vermelho");
		Carro carro2 = new Carro("Civic", "Honda", "MNO-9876");
		Carro carro3 = new Carro("XYZ-1597");
		Carro carro4 = new Carro(2026);

		// exibir os dados de cada carro
		System.out.println(carro1);
		System.out.println(carro2);
		System.out.println(carro3);
		System.out.println(carro4);
	}
}
