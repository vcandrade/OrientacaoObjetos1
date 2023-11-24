package aula14.polimorfismo.sobrecarga.exemplo01;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Data {

	private String data;

	public void atribuirData() {

		Date hoje = new Date();
		SimpleDateFormat sf = new SimpleDateFormat("dd/MM/yyyy");
		this.data = sf.format(hoje);
	}

	public void atribuirData(String data) {

		this.data = data;
	}

	public void atribuirData(int dia, int mes, int ano) {

		this.data = dia + "/" + mes + "/" + ano;
	}

	@Override
	public String toString() {
		return "Data [data=" + data + "]";
	}
}
