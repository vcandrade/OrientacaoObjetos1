package aula11.enumerations.exemplo02;

public class Funcionario {

	private int registro;
	private String nome;
	private int cpf;
	private DiaSemana folga;

	public Funcionario(int registro, String nome, int cpf, DiaSemana folga) {

		this.registro = registro;
		this.nome = nome;
		this.cpf = cpf;
		this.folga = folga;
	}

	public void alterarDiaFolga(DiaSemana novoDia) {

		this.folga = novoDia;
	}

	public void imprimirDadosFuncionario() {

		System.out.println("Registro: " + this.registro);
		System.out.println("Nome: " + this.nome);
		System.out.println("CPF: " + this.cpf);
		System.out.println("Dia Folga: " + this.folga.getDiaExtenso());
		System.out.println("Dia Semana: " + this.folga.getNumeroDia());
		System.out.println("========================");
	}
}
