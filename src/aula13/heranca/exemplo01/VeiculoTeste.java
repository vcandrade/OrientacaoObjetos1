package aula13.heranca.exemplo01;

public class VeiculoTeste {

	public static void main(String[] args) {

		Carro carro1 = new Carro("Gol", "Volkswagen", 2020, 5, "Flex", 5);
		carro1.abastecer();
		carro1.calibrarPneus();

		Aviao aviao1 = new Aviao("A-330", "AirBus", 1990, 550, "Combustível de Aviação", 45000);
		aviao1.abastecer();
		aviao1.voar();
	}
}
