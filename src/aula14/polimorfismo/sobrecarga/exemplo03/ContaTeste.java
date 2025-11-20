package aula14.polimorfismo.sobrecarga.exemplo03;

public class ContaTeste {

	public static void main(String[] args) {
		
		Conta conta1 = new Conta();
		conta1.emitirSaldo();
		
		Conta conta2 = new Conta(1000.00);
		conta2.emitirSaldo();
	}
}
