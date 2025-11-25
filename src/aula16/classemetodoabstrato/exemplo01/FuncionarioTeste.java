package aula16.classemetodoabstrato.exemplo01;

public class FuncionarioTeste {

	public static void main(String[] args) {

		Assalariado assalariado = new Assalariado("João da Silva", "123.456.789-10", 5000.00, 2000.00);
		assalariado.imprimirDados();

		Comissionado comissionado = new Comissionado("Maria de Oliveira", "987.654.321-00", 5000.00, 100000.00, 5);
		comissionado.imprimirDados();

		Horista horista = new Horista("Ricardo Carvalho", "159.753.444-11", 5000.00, 15.00, 160);
		horista.imprimirDados();
	}
}
