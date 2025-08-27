package aula03.classeobjeto;

public class CarroTeste {

	public static void main(String[] args) {

		// Instanciação (criação) de objetos da classe Carro
		Carro carro1 = new Carro();
		Carro carro2 = new Carro();
		Carro carro3 = new Carro();

		// Atribuição dos valores para cada objeto
		carro1.modelo = "458 Italia";
		carro1.marca = "Ferrari";
		carro1.ano = 2015;
		carro1.placa = "ABC-1234";
		carro1.cor = "Vermelho";

		carro2.modelo = "Civic";
		carro2.marca = "Honda";
		carro2.ano = 2018;
		carro2.placa = "MNO-9876";
		carro2.cor = "Azul";

		carro3.modelo = "911 Carrera";
		carro3.marca = "Porsche";
		carro3.ano = 2020;
		carro3.placa = "XYZ-5555";
		carro3.cor = "Branco";

		// Obtenção dos valores de cada objeto
		System.out.println("Carro 1");
		System.out.println("Modelo: " + carro1.modelo);
		System.out.println("Marca: " + carro1.marca);
		System.out.println("Ano: " + carro1.ano);
		System.out.println("Placa: " + carro1.placa);
		System.out.println("Cor: " + carro1.cor);

		System.out.println("Carro 2");
		System.out.println("Modelo: " + carro2.modelo);
		System.out.println("Marca: " + carro2.marca);
		System.out.println("Ano: " + carro2.ano);
		System.out.println("Placa: " + carro2.placa);
		System.out.println("Cor: " + carro2.cor);

		System.out.println("Carro 3");
		System.out.println("Modelo: " + carro3.modelo);
		System.out.println("Marca: " + carro3.marca);
		System.out.println("Ano: " + carro3.ano);
		System.out.println("Placa: " + carro3.placa);
		System.out.println("Cor: " + carro3.cor);
	}
}
