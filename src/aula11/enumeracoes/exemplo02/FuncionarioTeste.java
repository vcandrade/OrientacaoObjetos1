package aula11.enumeracoes.exemplo02;

public class FuncionarioTeste {

	public static void main(String[] args) {

		Funcionario funcionario1 = new Funcionario(1, "João da Silva", 123, DiaSemana.DOMINGO);
		funcionario1.imprimirDadosFuncionario();

		funcionario1.alterarDiaFolga(DiaSemana.TERCA);
		funcionario1.imprimirDadosFuncionario();
	}
}
