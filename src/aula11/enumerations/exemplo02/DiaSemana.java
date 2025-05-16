package aula11.enumerations.exemplo02;

public enum DiaSemana {

	DOMINGO(1, "Domingo"), SEGUNDA(2, "Segunda-feira"), TERCA(3, "Terça-feira"), QUARTA(4, "Quarta-feira"),
	QUINTA(5, "Quinta-feira"), SEXTA(6, "Sexta-feira"), SABADO(7, "Sábado");

	private int numeroDia;
	private String diaExtenso;

	private DiaSemana(int numeroDia, String diaExtenso) {

		this.numeroDia = numeroDia;
		this.diaExtenso = diaExtenso;
	}

	public int getNumeroDia() {
		return numeroDia;
	}

	public String getDiaExtenso() {
		return diaExtenso;
	}
}
