package jse04.controlFlow;

public class Switch {

	public static void main(String[] args) {
		
		/**
		 * A declaração switch avalia uma série de possibilidades pré-definidas, chamadas de case
		 * Cada case é avaliado até que o valor desejado seja encontrado
        */
		
		int month = 8;
		
		switch(month) {
			case 1: System.out.println("Janeiro");
					break; // O break serve para avisar ao switch que case o valor seja encontrado, ele pode parar de avaliar os demais cases
			case 2: System.out.println("Fevereiro");
					break;
			case 3: System.out.println("Mar�o");
					break;
			case 4: System.out.println("Abril");
					break;
			case 5: System.out.println("Maio");
					break;
			case 6: System.out.println("Junho");
					break;
			case 7: System.out.println("Julho");
					break;
			case 8: System.out.println("Agosto");
					break;
			case 9: System.out.println("Setembro");
					break;
			case 10: System.out.println("Outubro");
					break;
			case 11: System.out.println("Novembro");
					break;
			case 12: System.out.println("Dezembro");
					break;
			default: System.out.println("O mês " + month + " não existe"); // A instrução default é utilizada caso nenhum case seja executado
			 		break;
		}
		
		int letter = 'A';
		
		switch(letter) {
			case 'A': System.out.println("Letra A"); // Caso o break não seja informado, o case avaliado como true e os cases abaixo dele serão executados, até que um break seja encontrado
			case 'B': System.out.println("Letra B");
			case 'C': System.out.println("Letra C");
					  break;
			case 'D': System.out.println("Letra D");
		}
		
	}
	
}
