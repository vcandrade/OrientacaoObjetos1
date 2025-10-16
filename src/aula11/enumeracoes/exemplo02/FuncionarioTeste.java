package aula11.enumeracoes.exemplo02;

public class FuncionarioTeste {

	public static void main(String[] args) {

		Funcionario funcionario1 = new Funcionario(111, "João da Silva", DiaSemana.TERCA);
		funcionario1.imprimirRelatorio();

		funcionario1.alterarDiaFolga(DiaSemana.SEXTA);
		funcionario1.imprimirRelatorio();
	}
}
