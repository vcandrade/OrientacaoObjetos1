package aula17.realizacao.exemplo02;

public class Teste {

	public static void main(String[] args) {

		Peixe peixe = new Peixe();
		peixe.nadar();

		Homem homem = new Homem();
		homem.nadar();
		homem.andar();

		Passaro passaro = new Passaro();
		passaro.voar();
		passaro.andar();

		Pato pato = new Pato();
		pato.voar();
		pato.andar();
		pato.nadar();
	}
}
