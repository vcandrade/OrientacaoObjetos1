package aula07.metodosconstrutores;

public class Carro {

	// Atributos da classe Carro
	String modelo;
	String marca;
	int ano;
	String placa;
	String cor;
	int velocidade;
	boolean ligado;
	
	// métodos construtores
	public Carro(int ano) {
		
		this("Gol", "Volkswagen", ano, "AAA-1111", "Preto");
		this.ligado = false;
		this.velocidade = 0;
	}
	
	public Carro(String placa) {
		
		this("Gol", "Volkswagen", 2000, placa, "Preto");
	}
	
	public Carro(String modelo, String marca, int ano) {
		
		this(modelo, marca, ano, "AAA-1111", "Preto");
	}

	public Carro(String modelo, String marca, int ano, String placa, String cor) {

		this.modelo = modelo;
		this.marca = marca;
		this.ano = ano;
		this.placa = placa;
		this.cor = cor;
		this.velocidade = 0;
		this.ligado = false;
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
		return "Carro [modelo=" + this.modelo + ", marca=" + this.marca + ", ano=" + this.ano + ", placa=" + this.placa
				+ ", cor=" + this.cor + ", velocidade=" + this.velocidade + ", ligado=" + this.ligado + "]";
	}
}
