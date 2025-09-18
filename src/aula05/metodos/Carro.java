package aula05.metodos;

public class Carro {

	// Atributos da classe Carro
	String modelo;
	String marca;
	int ano;
	String placa;
	String cor;
	
	int velocidade = 0;
	boolean ligado = false;

	// Métodos da classe Carro
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

	@Override
	public String toString() {
		return "Carro [modelo=" + modelo + ", marca=" + marca + ", ano=" + ano + ", placa=" + placa + ", cor=" + cor + "]";
	}
}








