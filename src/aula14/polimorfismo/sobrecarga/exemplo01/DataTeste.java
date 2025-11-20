package aula14.polimorfismo.sobrecarga.exemplo01;

public class DataTeste {

	public static void main(String[] args) {
		
		Data data1 = new Data();
		data1.atribuirData();
		
		Data data2 = new Data();
		data2.atribuirData("01/02/2003");
		
		Data data3 = new Data();
		data3.atribuirData(10, 11, 2012);
		
		data1.exibirData();
		data2.exibirData();
		data3.exibirData();
	}
}
