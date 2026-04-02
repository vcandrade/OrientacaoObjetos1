package aula07.metodosconstrutores;

public class Carro {

	// atributos da classe Carro
	String modelo;
	String marca;
	int ano;
	String placa;
	String cor;
	int velocidade;
	boolean ligado;

	// métodos construtores da classe Carro
	public Carro(int ano) {

		this("", "", ano, "", "");
	}

	public Carro(String placa) {

		this("", "", 0, placa, "");
	}

	public Carro(String modelo, String marca, int ano) {

		this(modelo, marca, ano, "", "");
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

	// métodos da classe Carro
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

		if (velocidade == 0) {

			this.desligar();
		}
	}

	@Override
	public String toString() {
		return "Carro [modelo=" + modelo + ", marca=" + marca + ", ano=" + ano + ", placa=" + placa + ", cor=" + cor
				+ ", velocidade=" + velocidade + ", ligado=" + ligado + "]";
	}
}
