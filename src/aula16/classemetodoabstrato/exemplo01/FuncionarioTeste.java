package aula16.classemetodoabstrato.exemplo01;

public class FuncionarioTeste {

	public static void main(String[] args) {

		Funcionario funcionario = null;

		int opcao = 2;

		switch (opcao) {

			case 1:
				funcionario = new Assalariado("João da Silva", "123.456.789-10", 5000.00, 2000.00);
				break;
	
			case 2:
				funcionario = new Comissionado("Maria de Oliveira", "987.654.321-55", 5000.00, 50000.00, 10);
				break;
	
			case 3:
				funcionario = new Horista("Ricardo Carvalho", "159.753.456-82", 5000.00, 10.00, 160);
				break;
		}

		funcionario.imprimirDados();
	}
}
