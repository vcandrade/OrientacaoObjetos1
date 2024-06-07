package aula13.heranca.exemplo02;

public class ProfessorTeste {

	public static void main(String[] args) {
		
		Professor professor1 = new Professor(123456, "João da Silva", "15/05/2015", 5000.00);
		professor1.lancarFrequencia();
		professor1.aplicarAvaliacao();
		professor1.imprimirDadosProfessor();
		
		System.out.println("===============================================================");
		
		CoordenadorCurso coordenadorCurso1 = new CoordenadorCurso(987654, "Maria de Oliveira", "01/01/2010", 5000.00, 1500.00);
		coordenadorCurso1.lancarFrequencia();
		coordenadorCurso1.aplicarAvaliacao();
		coordenadorCurso1.analisarPedidoSegundaChamada();
		coordenadorCurso1.analisarPedidoSuficiencia();
		coordenadorCurso1.participarReunioesDirecao();
		coordenadorCurso1.imprimirDadosCoordenador();
	}
}
