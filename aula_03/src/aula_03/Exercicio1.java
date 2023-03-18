package aula_03;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int numeroInicial, numeroFinal;
		
		
		System.out.println("Digite o primeiro número: ");
		numeroInicial = leia.nextInt();
		
		System.out.println("Digite o segundo número: (Maior que o primeiro!)");
		numeroFinal = leia.nextInt();
		
		if (numeroInicial >= numeroFinal)
			System.out.println("Intervalo inválido!");
		else {
			for (int i = numeroInicial; i <= numeroFinal; i++) {
				if (i % 3 == 0 && i % 5 == 0)
					System.out.println(i + " é múltiplo de 3 e 5");
			}
		}
		
		
		
			

			

		
				
		
		
	}

}
