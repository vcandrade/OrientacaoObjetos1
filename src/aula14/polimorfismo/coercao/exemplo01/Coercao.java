package aula14.polimorfismo.coercao.exemplo01;

public class Coercao {

	public static void main(String[] args) {
		
		// coerção explícita
		float w = (float) 12.34;
		int x = (int) 56.78;
		
		// coerção implícita
		double y = 10;
		int z = 'z';
		
		System.out.println("float w: " + w);
		System.out.println("int x: " + x);
		System.out.println("double y: " + y);
		System.out.println("int z: " + z);
	}
}
