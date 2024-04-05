package aula07.metodosconstrutores;

public class Carro {

	// declarar os atributos da classe
	String modelo;
	String marca;
	int ano;
	String placa;
	String cor;
	int velocidade;
	boolean ligado;

	// método construtor
	public Carro(String modelo, String marca, int ano, String placa, String cor) {

		this.modelo = modelo;
		this.marca = marca;
		this.ano = ano;
		this.placa = placa;
		this.cor = cor;
		this.velocidade = 0;
		this.ligado = false;
	}

	public Carro(String placa) {

		this("Não informado", "Não informado", 0, placa, "Não informado");
	}

	public Carro(int ano) {

		this("Não informado", "Não informado", ano, "Não informado", "Não informado");
	}

	// declarar os métodos da classe
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

	public void imprimirDados() {

		System.out.println("====================");
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Marca: " + this.marca);
		System.out.println("Ano: " + this.ano);
		System.out.println("Placa: " + this.placa);
		System.out.println("Cor: " + this.cor);
		System.out.println("Velocidade: " + this.velocidade);
		System.out.println("Ligado: " + this.ligado);
	}

	@Override
	public String toString() {
		return "Carro [modelo=" + modelo + ", marca=" + marca + ", ano=" + ano + ", placa=" + placa + ", cor=" + cor
				+ "]";
	}
}
