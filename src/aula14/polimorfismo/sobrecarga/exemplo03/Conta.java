package aula14.polimorfismo.sobrecarga.exemplo03;

public class Conta {

	private double saldo;
	
	public Conta() {
	
		this.saldo = 0.00;
	}
	
	public Conta(double saldo) {
		
		this.saldo = saldo;
	}
	
	public void emitirSaldo() {
		
		System.out.println("Saldo: R$" + this.saldo);
	}
}
