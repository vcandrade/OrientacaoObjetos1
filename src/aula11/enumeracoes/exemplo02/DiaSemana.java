package aula11.enumeracoes.exemplo02;

public enum DiaSemana {

	DOMINGO(1, "Domingo"),
	SEGUNDA(2, "Segunda-Feira"),
	TERCA(3, "Terça-Feira"),
	QUARTA(4, "Quarta-Feira"),
	QUINTA(5, "Quinta-Feira"),
	SEXTA(6, "Sexta-Feira"),
	SABADO(7, "Sábado");
	
	private int diaSemanaNumerico;
	private String diaSemanaExtenso;
	
	private DiaSemana(int diaSemanaNumerico, String diaSemanaExtenso) {
	
		this.diaSemanaNumerico = diaSemanaNumerico;
		this.diaSemanaExtenso = diaSemanaExtenso;
	}

	public int getDiaSemanaNumerico() {
		return diaSemanaNumerico;
	}

	public String getDiaSemanaExtenso() {
		return diaSemanaExtenso;
	}
}
