package aula08.classesnativas.string;

public class Exemplo06LastIndexOf {

	public static void main(String[] args) {

		String universidade = "Universidade Tecnológica Federal do Paraná";

		int ultimaOcorrencia = universidade.lastIndexOf('a');

		System.out.println("Última Ocorrência: " + ultimaOcorrencia);
	}
}
