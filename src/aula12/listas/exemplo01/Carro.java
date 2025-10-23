package aula12.listas.exemplo01;

public class Carro {

	// Atributos da classe Carro
	private String modelo;
	private String marca;
	private int ano;

	public Carro(String modelo, String marca, int ano) {

		this.modelo = modelo;
		this.marca = marca;
		this.ano = ano;
	}

	public String getModelo() {
		return modelo;
	}

	public String getMarca() {
		return marca;
	}

	public int getAno() {
		return ano;
	}

	@Override
	public String toString() {
		return "Carro [modelo=" + modelo + ", marca=" + marca + ", ano=" + ano + "]";
	}
}
