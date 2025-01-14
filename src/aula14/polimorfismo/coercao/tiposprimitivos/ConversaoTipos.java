package aula14.polimorfismo.coercao.tiposprimitivos;

public class ConversaoTipos {

	public static void main(String[] args) {
		
		// coerção implícita
		int x = 10;
		double y = x;
		System.out.println("int to double (implícita): " + y);
		
		// coerção explícita
		double a = 25.9;
		int b = (int) a;
		System.out.println("double to int (explícita):" + b);
	}
}
