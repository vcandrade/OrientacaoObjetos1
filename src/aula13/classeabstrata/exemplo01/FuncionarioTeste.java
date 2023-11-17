package aula13.classeabstrata.exemplo01;

public class FuncionarioTeste {

	public static void main(String[] args) {
		
		Assalariado assalariado1 = new Assalariado("João da Silva", 123456, 5000.00, 2000.00);
		Comissionado comissionado1 = new Comissionado("Maria de Oliveira", 987654, 5000.00, 50000.00, 0.10);
		Horista horista = new Horista("Ricardo Carvalho", 159789, 5000.00, 15.00, 160);
		
		System.out.println("Salário Assalariado: R$" + assalariado1.calcularSalario());
		System.out.println("Salário Comissionado: R$" + comissionado1.calcularSalario());
		System.out.println("Salário Horista: R$" + horista.calcularSalario());
	}
}
