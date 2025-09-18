package aula07.metodosconstrutores;

public class CarroTeste {

	public static void main(String[] args) {

		// Instanciação (criação) de objetos da classe Carro
		Carro carro1 = new Carro("458 Italia", "Ferrari", 2015, "ABC-1234", "Vermelho");
		Carro carro2 = new Carro("MNO-9876");
		Carro carro3 = new Carro("911 Carrera", "Porsche", 2020);
		Carro carro4 = new Carro(2025);

		// Obtenção dos valores de cada objeto
		System.out.println(carro1);
		System.out.println(carro2);
		System.out.println(carro3);
		System.out.println(carro4);
	}
}
