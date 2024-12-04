package aula13.heranca.exemplo02;

public class ProfessorTeste {

	public static void main(String[] args) {

		Professor professor1 = new Professor(111, "João da Silva", "01/01/2010", 2000.00);
		professor1.imprimirDadosProfessor();
		professor1.aplicarAvaliacao();
		professor1.lancarFrequencia();
		
		System.out.println("=======================================");
		
		CoordenadorCurso coordenadorCurso1 = new CoordenadorCurso(222, "Maria de Oliveira", "02/02/2020", 2000.00, 1000.00);
		coordenadorCurso1.imprimirDadosCoordenador();
		coordenadorCurso1.aplicarAvaliacao();
		coordenadorCurso1.lancarFrequencia();
		coordenadorCurso1.analisarPedidoSegundaChamada();
		coordenadorCurso1.analisarPedidoSuficiencia();
		coordenadorCurso1.participarReunioesDirecao();
	}
}
