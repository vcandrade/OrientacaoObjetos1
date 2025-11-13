package aula13.heranca.exemplo02;

public class CoordenadorCurso extends Professor {

	private double adicionalSalario;

	public CoordenadorCurso(int numeroRegistro, String nome, String dataNomeacao, double salario, double adicionalSalario) {

		super(numeroRegistro, nome, dataNomeacao, salario);
		this.adicionalSalario = adicionalSalario;
	}

	public void analisarPedidoSegundaChamada() {

		System.out.println(this.nome + " analisando pedido de 2a chamada.");
	}

	public void analisarPedidoSuficiencia() {

		System.out.println(this.nome + " analisando pedido de exame de suficiência.");
	}

	public void participarReunioesDirecao() {

		System.out.println(this.nome + " participando de reuniões da direção.");
	}

	public void imprimirDadosCoordenador() {

		super.imprimirDadosProfessor();
		System.out.println("Salário Adicional: R$" + this.adicionalSalario);
		System.out.println("Salário Total: R$" + this.calcularSalario());
		System.out.println("--------------------------------");
	}

	private double calcularSalario() {

		return this.salario + this.adicionalSalario;
	}
}
