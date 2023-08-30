package aula04.metodos;

public class CarroTeste {

	public static void main(String[] args) {

		// instanciando objetos da classe Carro
		Carro carro1 = new Carro();
		Carro carro2 = new Carro();
		Carro carro3 = new Carro();

		// atribuir valores para os atributos dos objetos
		carro1.modelo = "Fusca";
		carro1.marca = "Volkswagen";
		carro1.ano = 1970;
		carro1.placa = "ABC-1234";
		carro1.cor = "Amarelo";

		carro2.modelo = "Civic";
		carro2.marca = "Honda";
		carro2.ano = 2015;
		carro2.placa = "MNO-9876";
		carro2.cor = "Azul";

		carro3.modelo = "Onix";
		carro3.marca = "Chevrolet";
		carro3.ano = 2013;
		carro3.placa = "XYZ-5555";
		carro3.cor = "Preto";

		// invocação dos métodos de cada carro
		carro2.ligar();
		carro1.acelerar();
		carro1.acelerar();
		
		carro1.frear();
		carro1.frear();

		// exibir valores dos atributos em console
		System.out.println(carro1);
		System.out.println(carro2);
		System.out.println(carro3);
	}
}









