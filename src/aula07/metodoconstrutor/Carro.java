package aula07.metodoconstrutor;

public class Carro {

	// declaração dos atributos da classe Carro
	String modelo;
	String marca;
	int ano;
	String placa;
	String cor;
	boolean ligado;
	int velocidade;
	
	static int contador;
	
	// método construtor da classe Carro
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
		
		this(modelo, marca, 0, placa, "Não informado");
	}
	
	public Carro(String placa) {
		
		this("Não informado", "Não informado", 0, placa, "Não informado");
	}
	
	public Carro(int ano) {
		
		this("Não informado", "Não informado", ano, "Não informado", "Não informado");
	}
	

	// declaração dos métodos da classe Carro
	public void ligar() {
		
		System.out.println(this.marca + " " + this.modelo + " está ligando.");
	}

	public void desligar() {

		System.out.println(this.marca + " " + this.modelo + " está desligando.");
	}

	public void acelerar() {

		System.out.println(marca + " " + modelo + " está acelerando.");
	}

	public void frear() {

		System.out.println(marca + " " + modelo + " está freando.");
	}

	@Override
	public String toString() {
		return "Carro [modelo=" + modelo + ", marca=" + marca + ", ano=" + ano + ", placa=" + placa + ", cor=" + cor
				+ "]";
	}
}
