package aula13.heranca.exercicio;

public class Endereco {

	private String logradouro;
	private int numero;
	private String bairro;
	private String cidade;
	private String unidadeFederativa;
	
	public Endereco(String logradouro, int numero, String bairro, String cidade, String unidadeFederativa) {
	
		this.logradouro = logradouro;
		this.numero = numero;
		this.bairro = bairro;
		this.cidade = cidade;
		this.unidadeFederativa = unidadeFederativa;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public int getNumero() {
		return numero;
	}

	public String getBairro() {
		return bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public String getUnidadeFederativa() {
		return unidadeFederativa;
	}
}
