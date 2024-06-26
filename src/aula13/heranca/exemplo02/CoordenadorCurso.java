package aula13.heranca.exemplo02;

public class CoordenadorCurso extends Professor {

	private double salarioAdicional;
	
	public CoordenadorCurso(int numeroRegistro, String nome, String dataNomeacao, double salario, double salarioAdicional) {
		
		super(numeroRegistro, nome, dataNomeacao, salario);
		this.salarioAdicional = salarioAdicional;
	}

	public void analisarPedidoSegundaChamada() {
		
		System.out.println(this.nome + " est� analisando pedido de segunda chamada.");
	}
	
	public void analisarPedidoSuficiencia() {
		
		System.out.println(this.nome + " est� analisando pedido de sufici�ncia.");
	}
	
	public void participarReunioesDirecao() {
		
		System.out.println(this.nome + " est� participando de reuni�es da dire��o do campus.");
	}
	
	public void imprimirDadosCoordenador() {
		
		super.imprimirDadosProfessor();
		System.out.println("Sal�rio Adicional: R$" + this.salarioAdicional);
		System.out.println("Sal�rio Total: R$" + this.calcularSalario());
	}
	
	private double calcularSalario() {
		
		return this.salario + this.salarioAdicional;
	}
}
