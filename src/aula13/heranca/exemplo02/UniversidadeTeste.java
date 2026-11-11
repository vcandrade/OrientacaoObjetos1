package aula13.heranca.exemplo02;

public class UniversidadeTeste {

	public static void main(String[] args) {

		Professor professor1 = new Professor(111, "João da Silva", "01/02/2003", 5000.00);
		professor1.lancarFrequencia();
		professor1.aplicarAvaliacao();
		professor1.imprimirDadosProfessor();

		System.out.println("======================================");

		CoordenadorCurso coordenadorCurso1 = new CoordenadorCurso(222, "Maria de Oliveira", "09/10/2011", 5000.00, 2000.00);
		coordenadorCurso1.lancarFrequencia();
		coordenadorCurso1.aplicarAvaliacao();
		coordenadorCurso1.analisarPedidoSegundaChamada();
		coordenadorCurso1.analisarPedidoSuficiencia();
		coordenadorCurso1.participarReunioesDirecao();
		coordenadorCurso1.imprimirDadosCoordenador();
	}
}
