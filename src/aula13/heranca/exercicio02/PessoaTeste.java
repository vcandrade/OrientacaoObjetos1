package aula13.heranca.exercicio02;

public class PessoaTeste {

	public static void main(String[] args) {
		
		System.out.println("=========== PROFESSOR ===========");
		
		Professor professor1 = new Professor("João da Silva", 30, "Vicente Machado", 1024, "Centro", "Ponta Grossa", "PR", 5000.00, 2000.00);
		professor1.imprimirDados();
		
		System.out.println("=========== ALUNO ===========");
		
		Aluno aluno1 = new Aluno("Maria de Oliveira", 20, "Balduíno Taques", 2048, "Centro", "Ponta Grossa", "PR");
		aluno1.realizarMatricula("Bacharelado em Ciência da Computação");
		aluno1.imprimirDados();
	}
}
