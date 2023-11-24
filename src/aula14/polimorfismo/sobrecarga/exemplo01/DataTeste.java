package aula14.polimorfismo.sobrecarga.exemplo01;

public class DataTeste {

	public static void main(String[] args) {
		
		Data data1 = new Data();
		Data data2 = new Data();
		Data data3 = new Data();
		
		data1.atribuirData();
		data2.atribuirData("10/10/2010");
		data3.atribuirData(1, 2, 2020);
		
		System.out.println(data1);
		System.out.println(data2);
		System.out.println(data3);
	}
}
