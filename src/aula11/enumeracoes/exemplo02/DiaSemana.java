package aula11.enumeracoes.exemplo02;

public enum DiaSemana {

	DOMINGO(1, "Domingo"), 
	SEGUNDA(2, "Segunda-feira"), 
	TERCA(3, "Terça-feira"), 
	QUARTA(4, "Quarta-feira"),
	QUINTA(5, "Quinta-feira"), 
	SEXTA(6, "Sexta-feira"), 
	SABADO(7, "Sábado");

	private int diaNumerico;
	private String diaExtenso;

	private DiaSemana(int diaNumerico, String diaExtenso) {

		this.diaNumerico = diaNumerico;
		this.diaExtenso = diaExtenso;
	}

	public int getDiaNumerico() {
		return diaNumerico;
	}

	public String getDiaExtenso() {
		return diaExtenso;
	}
}
