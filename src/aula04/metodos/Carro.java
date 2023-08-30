package aula04.metodos;

public class Carro {

	// atributos da classe Carro
	String modelo;
	String marca;
	int ano;
	String placa;
	String cor;
	boolean ligado = false;
	int velocidade = 0;

	// m�todos da classe Carro
	public void ligar() {
		
		if(!ligado) {
			
			ligado = true;
			System.out.println(marca + " " + modelo + " está ligando.");
		
		} else {
			
			System.out.println(marca + " " + modelo + " já encontra-se ligado.");
		}
	}

	public void desligar() {

		System.out.println(marca + " " + modelo + " está desligando.");
	}

	public void acelerar() {

		velocidade = velocidade + 10;
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







