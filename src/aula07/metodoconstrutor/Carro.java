package aula07.metodoconstrutor;

public class Carro {

	// Atributos da classe Carro
	String modelo;
	String marca;
	int ano;
	String placa;
	String cor;
	boolean ligado = false;
	int velocidade = 0;

	// Métodos Construtores da Classe Carro
	public Carro(String modelo, String marca, int ano, String placa, String cor) {

		this.modelo = modelo;
		this.marca = marca;
		this.ano = ano;
		this.placa = placa;
		this.cor = cor;
		this.ligado = false;
		this.velocidade = 0;
	}

	public Carro(String modelo, String marca, String placa) {

		this(modelo, marca, 0, placa, "Vazio");
	}

	public Carro(String modelo, int ano) {

		this(modelo, "Vazio", ano, "Vazio", "Vazio");
	}

	public Carro(int ano, String placa) {

		this("Vazio", "Vazio", ano, placa, "Vazio");
	}

	// Métodos da classe Carro
	public void ligar() {

		System.out.println(this.marca + " " + this.modelo + " está ligando.");
	}

	public void desligar() {

		System.out.println(this.marca + " " + this.modelo + " está desligando.");
	}

	public void acelerar() {

		System.out.println(this.marca + " " + this.modelo + " está acelerando.");
	}

	public void frear() {

		System.out.println(this.marca + " " + this.modelo + " está freando.");
	}

	@Override
	public String toString() {
		return "Carro [modelo=" + modelo + ", marca=" + marca + ", ano=" + ano + ", placa=" + placa + ", cor=" + cor
				+ "]";
	}
}
