package aula13.heranca.exemplo02;

public class CoordenadorCurso extends Professor {

	private double adicionalSalario;
	
	public CoordenadorCurso(int numeroRegistro, String nome, String dataNomeacao, double salario, double adicionalSalario) {
		
		super(numeroRegistro, nome, dataNomeacao, salario);
		this.adicionalSalario = adicionalSalario;
	}

	public void analisarPedidoSegundaChamada() {		
		
		System.out.println(this.nome + " está analisando pedidos de avaliações de 2a chamada.");
	}
	
	public void analisarPedidoSuficiencia() {		
		
		System.out.println(this.nome + " está deferindo pedidos de exames de suficiência.");
	}
	
	public void participarReunioesDirecao() {		
		
		System.out.println(this.nome + " está participando das reuniões da direção do campus.");
	}
	
	public void imprimirDadosCoordenador() {
		
		super.imprimirDadosProfessor();
		
		System.out.println("Adicional: R$" + this.adicionalSalario);
		System.out.println("Salário Total: R$" + this.calcularSalario());
	}

	private double calcularSalario() {		
		
		return this.salario + this.adicionalSalario;
	}
}
