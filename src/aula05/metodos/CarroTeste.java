package aula05.metodos;

public class CarroTeste {

	public static void main(String[] args) {

		// instanciar objetos da classe Carro
		Carro carro1 = new Carro();
		Carro carro2 = new Carro();
		Carro carro3 = new Carro();

		// atribuir valores para os atributos de cada carro
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
		carro3.placa = "XYZ-1597";
		carro3.cor = "Branco";

		// exibir os dados de cada carro
		System.out.println(carro1);
		System.out.println(carro2);
		System.out.println(carro3);

		carro2.ligar();
		carro1.acelerar();
		carro1.desligar();
		carro3.frear();
	}
}
