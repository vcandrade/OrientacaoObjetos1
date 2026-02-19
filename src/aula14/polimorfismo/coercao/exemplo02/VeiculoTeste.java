package aula14.polimorfismo.coercao.exemplo02;

import java.util.Scanner;

	public class VeiculoTeste {
	
		public static void main(String[] args) {
			
			Scanner input = new Scanner(System.in);
			
			Veiculo veiculo = null;
			
			System.out.println("1 - Carro");
			System.out.println("2 - Avião");
			System.out.print("Opção: ");
			int opcao = input.nextInt();
			
			switch(opcao) {
			
				case 1:
					// coerção implícita
					veiculo = new Carro("Gol", "Volks", 2020, 5, "Flex", 5);
					break;
					
				case 2:
					// coerção implícita
					veiculo = new Aviao("A-380", "AirBus", 1980, 800, "Combustível de Aviação", 45000);
					break;
			}
			
			veiculo.abastecer();
			
			if (veiculo instanceof Carro) {
				
				// coerção explícita (casting)
				Carro carro = (Carro) veiculo;
				
				carro.calibrarPneus();
			}
		}
	}
