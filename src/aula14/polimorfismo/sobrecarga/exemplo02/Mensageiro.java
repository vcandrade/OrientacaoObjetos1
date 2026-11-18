package aula14.polimorfismo.sobrecarga.exemplo02;

public class Mensageiro {

	public void imprimirMensagem(String texto) {
		System.out.println("Mensagem: " + texto);
	}

	public void imprimirMensagem(int numero) {
		System.out.println("Número: " + numero);
	}

	public void imprimirMensagem(String texto, int numero) {
		System.out.println(numero + ", escreveu: " + texto);
	}
}
