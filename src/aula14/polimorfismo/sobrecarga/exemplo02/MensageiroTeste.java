package aula14.polimorfismo.sobrecarga.exemplo02;

public class MensageiroTeste {

	public static void main(String[] args) {
        
		Mensageiro mensageiro = new Mensageiro();

        mensageiro.imprimirMensagem("Olá, Tudo bem?");
        
        mensageiro.imprimirMensagem(99887766);
        
        mensageiro.imprimirMensagem("Orientação a Objetos", 11223344);
    }
}
