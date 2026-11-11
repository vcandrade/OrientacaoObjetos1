package aula13.heranca.exemplo02;

public class CoordenadorCurso extends Professor {

	private double salarioAdicional;

	public CoordenadorCurso(int numeroRegistro, String nome, String dataNomeacao, double salario, double salarioAdicional) {

		super(numeroRegistro, nome, dataNomeacao, salario);
		this.salarioAdicional = salarioAdicional;
	}

	public void analisarPedidoSegundaChamada() {

		System.out.println(super.nome + " está analisando pedidos de segunda chamada.");
	}

	public void analisarPedidoSuficiencia() {

		System.out.println(super.nome + " está analisando pedidos de exames de suficiência");
	}

	public void participarReunioesDirecao() {

		System.out.println(super.nome + " está participando das reuniões da direção.");
	}

	public void imprimirDadosCoordenador() {

		super.imprimirDadosProfessor();

		System.out.println("Salário Adicional: R$" + this.salarioAdicional);
		System.out.println("Salário Total: R$" + this.calcularSalario());
	}

	private double calcularSalario() {

		return super.salario + this.salarioAdicional;
	}
}
