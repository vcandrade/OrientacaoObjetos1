package aula11.enumerations.exemplo02;

public class FuncionarioTeste {

	public static void main(String[] args) {

		Funcionario funcionario1 = new Funcionario(123, "João da Silva", 987654, DiaSemana.DOMINGO);
		funcionario1.imprimirDadosFuncionario();

		funcionario1.alterarDiaFolga(DiaSemana.TERCA);
		funcionario1.imprimirDadosFuncionario();
	}
}
