package aula05.metodos;

public class Carro {

	// atributos da classe Carro
	String modelo;
	String marca;
	int ano;
	String placa;
	String cor;

	// métodos da classe Carro
	public void ligar() {

		System.out.println(marca + " " + modelo + " está ligando.");
	}

	public void desligar() {

		System.out.println(marca + " " + modelo + " está desligando.");
	}

	public void acelerar() {

		System.out.println(marca + " " + modelo + " está acelerando.");
	}

	public void frear() {

		System.out.println(marca + " " + modelo + " está freando.");
	}


	public String toString() {
		return "Carro [modelo=" + modelo + ", marca=" + marca + ", ano=" + ano + ", placa=" + placa + ", cor=" + cor
				+ "]";
	}
	
	
}












