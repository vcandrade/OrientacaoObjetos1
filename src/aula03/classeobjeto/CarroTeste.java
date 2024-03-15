package aula03.classeobjeto;

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

		// obtenção dos valores dos atributos de cada objeto
		System.out.println("========== Carro 1 ==========");
		System.out.println("Modelo: " + carro1.modelo);
		System.out.println("Marca: " + carro1.marca);
		System.out.println("Ano: " + carro1.ano);
		System.out.println("Placa: " + carro1.placa);
		System.out.println("Cor: " + carro1.cor);

		System.out.println("========== Carro 2 ==========");
		System.out.println("Modelo: " + carro2.modelo);
		System.out.println("Marca: " + carro2.marca);
		System.out.println("Ano: " + carro2.ano);
		System.out.println("Placa: " + carro2.placa);
		System.out.println("Cor: " + carro2.cor);
	}
}
