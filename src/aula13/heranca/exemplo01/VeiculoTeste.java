package aula13.heranca.exemplo01;

public class VeiculoTeste {

	public static void main(String[] args) {

		Carro carro1 = new Carro("Gol", "Volks", 2020, 5, "Flex", 5);
		carro1.calibrarPneus();
		carro1.abastecer();

		Aviao aviao1 = new Aviao("A-380", "AirBus", 1980, 800, "Combustível de Aviação", 45000);
		aviao1.voar();
		aviao1.abastecer();
	}
}
