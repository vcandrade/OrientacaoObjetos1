package aula06.variaveis;

public class ContaBancaria {

	
	int numeroConta;
	static int contador;
	
	public void criarConta() {
		
		contador++;
		numeroConta = contador;
	}
}
